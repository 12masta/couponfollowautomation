package com.szkolqa.couponfollowautomation.coupon

import com.szkolqa.couponfollowautomation.BaseSpec
import com.szkolqa.couponfollowautomation.handlers.ClipboardHandler
import spock.lang.Unroll

class CouponSpec extends BaseSpec {
    @Unroll
    def 'Is original Domino page is loaded'() {
        when: 'I click Show coupon code'
        def dominoSite = homePage.searchStore(searchValue)
                .clickDropdownElement(0)
                .clickShowCouponCode(0)
                .switchToOriginalTab()

        then: 'then Dominos site should open in the current tab'
        dominoSite.url == 'https://www.dominos.com/index.intl.html'

        where:
        searchValue  | _
        'Domino\'s'  | _
        'domino\'s'  | _
    }

    @Unroll
    def 'Is user is able to open new tab with coupon code'() {
        when: 'I click Show coupon code'
        def couponCodesSite = homePage.searchStore(searchValue)
                .clickDropdownElement(0)
                .clickShowCouponCode(0)
                .switchToNewestTab()

        then: 'new tab with coupon code is open'
        couponCodesSite.isCouponCodeIsShown()

        where:
        searchValue  | _
        'Domino\'s'  | _
        'domino\'s'  | _
    }

    @Unroll
    def 'Is user able to copy coupon code'() {
        when: 'I click Show coupon code, then Dominos site should open in the current tab and a new tab showing the ' +
                'coupon code should open in a new tab.'
        def couponCodesSite = homePage.searchStore(searchValue)
                .clickDropdownElement(0)
                .clickShowCouponCode(0)
                .switchToNewestTab()
                .clickCopy()

        then: 'I should be able to copy the coupon code in the new tab.'
        couponCodesSite.couponValue == ClipboardHandler.clipboardValue

        where:
        searchValue  | _
        'Domino\'s'  | _
        'domino\'s'  | _
    }
}

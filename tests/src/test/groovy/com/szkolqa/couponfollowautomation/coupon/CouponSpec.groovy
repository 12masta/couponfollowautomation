package com.szkolqa.couponfollowautomation.coupon

import com.szkolqa.couponfollowautomation.BaseSpec
import com.szkolqa.couponfollowautomation.handlers.ClipboardHandler
import spock.lang.Unroll

class CouponSpec extends BaseSpec {
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

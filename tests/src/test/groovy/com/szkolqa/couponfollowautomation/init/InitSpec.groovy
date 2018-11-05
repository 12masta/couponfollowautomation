package com.szkolqa.couponfollowautomation.init

import com.szkolqa.couponfollowautomation.BaseSpec
import io.qameta.allure.Epic
import io.qameta.allure.Feature

@Epic("InitSpec")
@Feature("InitSpec")
class InitSpec extends BaseSpec {
    def 'first specifiacation'(){
        expect:
        driver.currentUrl == 'https://couponfollow.com/'
    }
}

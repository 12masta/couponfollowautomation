package com.szkolqa.biolerplate.init

import com.szkolqa.biolerplate.BaseSpec
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

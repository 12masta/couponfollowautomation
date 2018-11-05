package com.szkolqa.boilerplate.pageobjects;

public interface CouponCodesSite {
    CouponCodesSite clickShowCouponCode(int p);

    CouponCodesSite switchToNewestTab();

    CouponCodesSite clickCopy();

    String getCouponValue();
}

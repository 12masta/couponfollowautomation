package com.szkolqa.couponfollowautomation.pageobjects;

public interface CouponCodesSite {
    CouponCodesSite clickShowCouponCode(int p);

    CouponCodesSite switchToNewestTab();

    CouponCodesSite clickCopy();

    String getCouponValue();
}

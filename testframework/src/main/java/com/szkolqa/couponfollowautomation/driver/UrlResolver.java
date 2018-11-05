package com.szkolqa.couponfollowautomation.driver;

public interface UrlResolver {
    void goToRelativeUrl(String relativeUrl);

    public String getUrlRelativePath();

    public String getUrl();
}

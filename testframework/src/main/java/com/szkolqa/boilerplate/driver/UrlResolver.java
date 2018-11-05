package com.szkolqa.boilerplate.driver;

public interface UrlResolver {
    void goToRelativeUrl(String relativeUrl);

    public String getUrlRelativePath();

    public String getUrl();
}

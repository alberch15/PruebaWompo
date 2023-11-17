package com.wompi.co.utils.website;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class WebSite {

    @Steps(shared = true)
    PageObject wompi;

    @Step("Navegar al sitio web")
    public void navigateTo(String url){
        wompi.setDefaultBaseUrl(url);
        wompi.open();
    }
}

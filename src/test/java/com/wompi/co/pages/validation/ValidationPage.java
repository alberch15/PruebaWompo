package com.wompi.co.pages.validation;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ValidationPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div/div[1]/span")
    protected WebElementFacade lbl_trans;

    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div/div[1]/span")
    protected WebElementFacade lbl_declinado;

    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div/div[1]/span")
    protected WebElementFacade lblError;

}

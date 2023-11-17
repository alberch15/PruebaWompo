package com.wompi.co.pages.transferenciapago;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class TransferenciaPage extends PageObject {
    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div/div[2]/div/form/div/input")
    protected WebElementFacade txt_valor;
    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div/div[2]/div/form/div/button")
    protected WebElementFacade btn_continuar;

    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div/div[2]/div/div/a[4]/div[1]")
    protected WebElementFacade option_nequi;

    @FindBy(id = "email")
    protected WebElementFacade input_email;

    @FindBy(id = "fullName")
    protected WebElementFacade input_fullname;

    @FindBy(id = "number")
    protected WebElementFacade input_phone;

    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div/div[2]/div/form/button/span")
    protected WebElementFacade btn_continuarpago;

    @FindBy(id = "phoneNumber")
    protected WebElementFacade check_PhoneNumer;

    @FindBy(id = "acceptance")
    protected WebElementFacade check_RP;

    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div/div[2]/div/form/div[2]/button")
    protected WebElementFacade btn_continuarFin;

    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div/div[2]/div/div/a[1]")
    protected WebElementFacade option_card;

    @FindBy(id = "cardNumber")
    protected WebElementFacade input_cardNumber;

    @FindBy(id = "expirationMonth")
    protected WebElementFacade dropdownlist_month;

    @FindBy(id = "expirationYear")
    protected WebElementFacade drodownlist_year;

    @FindBy(id = "code")
    protected WebElementFacade input_cvc;

    @FindBy(id = "cardHolder")
    protected WebElementFacade input_nameoncard;

    @FindBy(id = "legal_id_option")
    protected WebElementFacade dropDownList_type;

    @FindBy(id = "legal_id_number")
    protected WebElementFacade input_docId;

    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div/div[2]/div/form/div[7]/button")
    protected WebElementFacade btn_continusrTarj;

    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div/div[2]/div/div/a[3]")
    protected WebElementFacade option_bancolombia;

    @FindBy(id = "sandboxStatus")
    protected WebElementFacade state_error;

    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div/div[2]/div/form/div[4]/button")
    protected WebElementFacade btn_continuarBC;







}

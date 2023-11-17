package com.wompi.co.steps.TransferenciaPago;

import com.wompi.co.pages.transferenciapago.TransferenciaPage;
import net.thucydides.core.annotations.Step;
import org.junit.rules.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TransferenciaStep extends TransferenciaPage {
    @Step("Ingresar valor a transferir")
    public void typeValue(String valor){
        txt_valor.isDisplayed();
        txt_valor.sendKeys(valor);
    }

    @Step("Click para continuar")
    public void clickContinuar(){
        btn_continuar.click();
    }


    @Step("Click en opcion de pago nequi")
    public void clickNequi(){
        option_nequi.isDisplayed();
        option_nequi.click();
    }


    @Step("ingresar datos del usuario y continuar")
    public void typeUsedData(String email, String fullName, String phone){
        input_email.sendKeys(email);
        input_fullname.sendKeys(fullName);
        input_phone.sendKeys(phone);
        btn_continuarpago.click();


    }

    @Step("ingresar numero nequi valido")
    public void typeNequiPhoneNumber(){
        check_PhoneNumer.click();
        check_RP.click();
        btn_continuarFin.click();
    }

    @Step("seleccionar metodo de pago tarjeta")
    public void clickCard(){
        option_card.click();
    }
    @Step("ingresar numrto de tarjeta")
    public void typeCardData(String CardNumber, String Month, String Year, String CVC,String NameOnCard, String type, String docNum) throws InterruptedException {
        input_cardNumber.isDisplayed();
        input_cardNumber.sendKeys(CardNumber);
        Select dropdownMonth = new Select(dropdownlist_month);
        dropdownMonth.selectByValue(Month);
        Select dropdownYear = new Select(drodownlist_year);
        dropdownYear.selectByValue(Year);
        input_cvc.sendKeys(CVC);
        input_nameoncard.sendKeys(NameOnCard);
        Select dropdownType = new Select(dropDownList_type);
        dropdownType.selectByValue(type);
        input_docId.sendKeys(docNum);
        check_RP.click();
        btn_continusrTarj.click();
        Thread.sleep(15000);

    }

    @Step("Seleccionar opcion banocolombia")
    public void clickBancolombia(){
        option_bancolombia.click();
    }
    @Step("ingresar datos del cliente bancolombia")
    public void typeDataClientBC(String state) throws InterruptedException {
        Select dropdownstate = new Select(state_error);
        dropdownstate.selectByValue(state);
        check_RP.click();
        btn_continuarBC.click();
        Thread.sleep(5000);
    }



}

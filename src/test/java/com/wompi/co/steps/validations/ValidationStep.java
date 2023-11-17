package com.wompi.co.steps.validations;

import com.wompi.co.pages.validation.ValidationPage;
import net.thucydides.core.annotations.Step;

public class ValidationStep extends ValidationPage {

    @Step("Validar visualizacion de transaccion exitosa")
    public boolean titleIsVisible(){
       return lbl_trans.isDisplayed();
    }

    @Step("Validar visualizacion de transaccion declinada")
    public boolean lblVisible(){
        return lbl_declinado.isDisplayed();
    }


    @Step("validar visualizacion de transaccion error")
    public boolean lblErrorVisible(){
        return lblError.isDisplayed();
    }




}

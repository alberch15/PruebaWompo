package com.wompi.co.definitions;

import com.wompi.co.steps.TransferenciaPago.TransferenciaStep;
import com.wompi.co.steps.validations.ValidationStep;
import com.wompi.co.utils.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class TransferenciaDef {

    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    TransferenciaStep transaccion;

    @Steps(shared = true)
    ValidationStep validation;

    @Given("el usuario navega al sitio web")
    public void userNavigateTo() {
    url.navigateTo("https://checkout.co.uat.wompi.dev/l/stagtest_VPOS_bdQraT");
    }

    @When("Ingresar Valor a transferir y continuar")
    public void userEnterValueToTranfer(){
        transaccion.typeValue("1500");
        transaccion.clickContinuar();
    }

    @When("Seleccionar metodo de pago Nequi")
    public void userSelectsPaymentMethod(){
        transaccion.clickNequi();
    }

    @When("Ingresar datos del usuario y continuar")
    public void enterUserData(){
        transaccion.typeUsedData("wompi@gmail.com", "wompi bancolombia", "3991111111 ");

    }

    @When("Ingresa numero nequi valido")
    public void enterNequiPhoneNumber(){
        transaccion.typeNequiPhoneNumber();
    }

    @When("Seleccionar metodo de pago tarjeta")
    public void selectCard(){
        transaccion.clickCard();
    }

    @When("Ingresar Datos de la tarjeta")
    public void typeCardData() throws InterruptedException {
        transaccion.typeCardData("4111 1111 1111 1111","05", "30", "123", "wompi bancolombia", "CC", "1234123423");
    }

    @When("Seleccionar metodo de pago cuenta bancolombia")
    public void selectBancolombia(){
        transaccion.clickBancolombia();
    }


    @When("Ingresar Datos de la cuenta bancolombia")
    public void typeDataBc() throws InterruptedException {
        transaccion.typeDataClientBC("ERROR");

    }





    @Then("Verificar transaccion exitosa")
    public void successfulTransactionValidation(){
        Assert.assertTrue(validation.titleIsVisible());
    }


    @Then("Verificar transaccion declinada")
    public void successfulTransactionValidationDeclinated(){
        Assert.assertTrue(validation.lblVisible());
    }

    @Then("Verificar transaccion error")
    public void successfulTransactionValidationError(){
        Assert.assertTrue(validation.lblErrorVisible());
    }

    }





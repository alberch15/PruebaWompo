@suite
Feature: CP01 Realizar pago exitoso

  Background: Yo como cliente de wompi quiero realizar un pago por medio de una transferencia

    Given el usuario navega al sitio web

  @transferenciaExitosa
    Scenario: Realizar pago exitoso
      When Ingresar Valor a transferir y continuar
      When Seleccionar metodo de pago Nequi
      When Ingresar datos del usuario y continuar
      When Ingresa numero nequi valido
      Then Verificar transaccion exitosa

    @transacciondeclinada
    Scenario: Realizar pago declinado
      When Ingresar Valor a transferir y continuar
      When Seleccionar metodo de pago tarjeta
      When Ingresar datos del usuario y continuar
      When Ingresar Datos de la tarjeta
      Then Verificar transaccion declinada


    @transaccionerror
    Scenario: Realizar pago error
      When Ingresar Valor a transferir y continuar
      When Seleccionar metodo de pago cuenta bancolombia
      When Ingresar datos del usuario y continuar
      When Ingresar Datos de la cuenta bancolombia
      Then Verificar transaccion error


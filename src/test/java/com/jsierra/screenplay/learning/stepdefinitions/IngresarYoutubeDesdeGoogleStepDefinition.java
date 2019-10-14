package com.jsierra.screenplay.learning.stepdefinitions;

import com.jsierra.screenplay.learning.interactions.AbrirNavegador;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class IngresarYoutubeDesdeGoogleStepDefinition {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) carga los datos de la prueba$")
    public void Carga_los_datos_de_la_prueba(String actor) {
        theActorCalled(actor).attemptsTo(AbrirNavegador.enBuscador());
    }

    @When("^ingresa a google y realiza la busqueda$")
    public void ingresa_a_google_y_realiza_la_busqueda() {

    }

    @Then("^deberia ver la pagina principal de youtube$")
    public void deberia_ver_la_pagina_principal_de_youtube() {

    }

}

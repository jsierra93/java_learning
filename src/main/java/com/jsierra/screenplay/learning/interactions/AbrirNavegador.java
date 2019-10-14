package com.jsierra.screenplay.learning.interactions;

import com.jsierra.screenplay.learning.user_interface.GooglePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirNavegador implements Interaction {

    GooglePage googlePage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        Open.browserOn().the(googlePage);
       // googlePage.open();
    }

    public static AbrirNavegador enBuscador() {
        return instrumented(AbrirNavegador.class);
    }
}

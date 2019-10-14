package com.jsierra.screenplay.learning.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feature/ingresar_youtube_desde_google.feature")
public class IngresarYoutubeDesdeGoogle {

}

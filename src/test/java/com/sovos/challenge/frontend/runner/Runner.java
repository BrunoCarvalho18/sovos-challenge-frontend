package com.sovos.challenge.frontend.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import static com.sovos.challenge.frontend.core.Driver.getDriver;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(glue = { "com.sovos.challenge.frontend.steps" }, features = {
		"src/main/resources" },tags =  "@add-products")
public class Runner {
	
	@AfterClass
	public static void encerraDriver() {
		getDriver().close();
	}

}

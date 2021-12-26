package com.sovos.challenge.frontend.steps;

import static com.sovos.challenge.frontend.core.Driver.getDriver;

import com.sovos.challenge.frontend.functionalities.ConsultProductsFuncionalities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ConsultProdcutsSteps {
	
	String url = "https://www.amazon.com.br/";	
	ConsultProductsFuncionalities consultProducts = new ConsultProductsFuncionalities();
	
	@Given("I am on the home page")
	public void i_am_on_the_home_page() {
		getDriver().get(url);
	    
	}
	@When("I put this {string} on the cart")
	public void i_put_this_on_the_cart(String product) {
		consultProducts.FillTheBlankSearchTextBox(product);
	}

	
	@Then("I should see products on the cart with the price correct")
	public void i_should_see_products_on_the_cart_with_the_price_correct() {
	    
	}

}

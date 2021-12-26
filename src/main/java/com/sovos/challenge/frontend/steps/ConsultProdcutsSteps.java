package com.sovos.challenge.frontend.steps;

import static com.sovos.challenge.frontend.core.Driver.getDriver;
import com.sovos.challenge.frontend.functionalities.ConsultProductsFuncionalities;
import com.sovos.challenge.frontend.functionalities.NewItemsFunctionalities;
import com.sovos.challenge.frontend.functionalities.ProductsFunctionalities;
import com.sovos.challenge.frontend.functionalities.SearchFuncionalities;
import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ConsultProdcutsSteps {
	
	String url = "https://www.amazon.com.br/";	
	ConsultProductsFuncionalities consultProducts = new ConsultProductsFuncionalities();
	SearchFuncionalities search = new SearchFuncionalities();
	ProductsFunctionalities products = new ProductsFunctionalities();
	NewItemsFunctionalities newItems = new NewItemsFunctionalities();
	
	@Given("I am on the home page")
	public void i_am_on_the_home_page() {
		getDriver().get(url);
	    
	}
	@When("I put this {string} on the cart")
	public void i_put_this_on_the_cart(String product) {
		consultProducts.FillTheBlankSearchTextBox(product);
		consultProducts.ClickButtonSearch();
		search.ClickTextProductSearch();
		products.clickButtonAddCart();
	}
	
	@Then("I should see products on the cart")
	public void i_should_see_products_on_the_cart() {
		Assert.assertEquals(newItems.verifyGetFieldItemsAdd(),"Adicionado ao carrinho");
	}

}

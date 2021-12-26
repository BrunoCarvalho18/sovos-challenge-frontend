package com.sovos.challenge.frontend.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.sovos.challenge.frontend.core.BasePage;
import com.sovos.challenge.frontend.core.Driver;

public class ProductPage extends BasePage {
	
	public ProductPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(id = "add-to-cart-button")
	WebElement buttonAddCart;

	public WebElement getButtonAddCart() {
		return buttonAddCart;
	}

	public void setButtonAddCart(WebElement buttonAddCart) {
		this.buttonAddCart = buttonAddCart;
	}

}

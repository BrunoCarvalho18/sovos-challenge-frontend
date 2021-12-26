package com.sovos.challenge.frontend.pages;	

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sovos.challenge.frontend.core.BasePage;
import com.sovos.challenge.frontend.core.Driver;

public class CartPage  extends BasePage {
	
	public CartPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(id = "sc-buy-box")
	WebElement textCartPage;
	
	public WebElement getTextCartPage() {
		return textCartPage;
	}

	public void setTextCartPage(WebElement textCartPage) {
		this.textCartPage = textCartPage;
	}



}

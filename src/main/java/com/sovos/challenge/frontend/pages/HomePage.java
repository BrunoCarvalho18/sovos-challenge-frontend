package com.sovos.challenge.frontend.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.sovos.challenge.frontend.core.BasePage;
import com.sovos.challenge.frontend.core.Driver;

public class HomePage extends BasePage {
	
	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(id = "twotabsearchtextbox")
	WebElement fieldSearchTextBox;
	
	@FindBy(id = "nav-search-submit-button")
	WebElement buttonSearch;
	
	public WebElement getFieldSearchTextBox() {
		return fieldSearchTextBox;
	}

	public void setFieldSearchTextBox(WebElement fieldSearchTextBox) {
		this.fieldSearchTextBox = fieldSearchTextBox;
	}

	public WebElement getButtonSearch() {
		return buttonSearch;
	}

	public void setButtonSearch(WebElement buttonSearch) {
		this.buttonSearch = buttonSearch;
	}

	

}

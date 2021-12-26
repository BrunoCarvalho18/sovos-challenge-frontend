package com.sovos.challenge.frontend.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.sovos.challenge.frontend.core.BasePage;
import com.sovos.challenge.frontend.core.Driver;

public class SearchPage extends BasePage{
	
	public SearchPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath = "//*[contains(text(),'Apple MacBook Air 13.3\", Chip M1, 8GB RAM, 256GB SSD - Space Gray')]")
	WebElement textSearchPage;

	public WebElement getTextSearchPage() {
		return textSearchPage;
	}

	public void setTextSearchPage(WebElement textSearchPage) {
		this.textSearchPage = textSearchPage;
	}
	

}

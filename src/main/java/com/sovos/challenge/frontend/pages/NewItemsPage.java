package com.sovos.challenge.frontend.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.sovos.challenge.frontend.core.BasePage;
import com.sovos.challenge.frontend.core.Driver;

public class NewItemsPage extends BasePage {
	
	public NewItemsPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath = "//*[contains(text(),'Adicionado ao carrinho')]")
	WebElement textAddCartCorrect;

	public WebElement getTextAddCartCorrect() {
		return textAddCartCorrect;
	}

	public void setTextAddCartCorrect(WebElement textAddCartCorrect) {
		this.textAddCartCorrect = textAddCartCorrect;
	}


}

package com.sovos.challenge.frontend.functionalities;

import com.sovos.challenge.frontend.pages.NewItemsPage;

public class NewItemsFunctionalities {

	NewItemsPage newItems = new NewItemsPage();

	public NewItemsFunctionalities() {
		newItems = new NewItemsPage();
	}

	public String verifyGetFieldItemsAdd() {
		return newItems.getTextAddCartCorrect().getText();
	}
	
	public void clickButtonCart() {
		newItems.getButtonCart().click();
	}
}

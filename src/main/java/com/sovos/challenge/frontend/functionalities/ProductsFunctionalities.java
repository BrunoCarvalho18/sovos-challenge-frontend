package com.sovos.challenge.frontend.functionalities;

import com.sovos.challenge.frontend.pages.ProductPage;

public class ProductsFunctionalities {

	ProductPage page = new ProductPage();

	public ProductsFunctionalities() {
		page = new ProductPage();
	}
	
	
	public void clickButtonAddCart() {
		page.getButtonAddCart().click();
	}

}

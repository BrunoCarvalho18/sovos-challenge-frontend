package com.sovos.challenge.frontend.functionalities;

import com.sovos.challenge.frontend.pages.CartPage;

public class CartFuncionalities {

	CartPage cart = new CartPage();

	public CartFuncionalities() {
		cart = new CartPage();
	}

	public String verifyGetFieldPrice() {
		return cart.getTextCartPage().getText();
   }

}

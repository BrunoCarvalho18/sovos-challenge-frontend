package com.sovos.challenge.frontend.functionalities;

import com.sovos.challenge.frontend.pages.HomePage;

public class ConsultProductsFuncionalities {
	
	 HomePage home = new HomePage();
	 
	 public ConsultProductsFuncionalities() {
		 home = new HomePage();
	 }
	 
	 public void FillTheBlankSearchTextBox(String text) {
		 home.getFieldSearchTextBox().sendKeys(text);
	 }
	 
	 public void ClickButtonSearch() {
		 home.getButtonSearch().click();
	 }

}

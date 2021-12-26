package com.sovos.challenge.frontend.functionalities;

import com.sovos.challenge.frontend.pages.SearchPage;

public class SearchFuncionalities {
	
	SearchPage search = new SearchPage();
	
	public SearchFuncionalities() {
		search = new SearchPage();
	}
	
	 public void ClickTextProductSearch() {
		search.getTextSearchPage().click();
	 }

}

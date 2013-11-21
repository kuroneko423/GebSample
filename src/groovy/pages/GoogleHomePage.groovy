package pages

import geb.Page

class GoogleHomePage extends Page {
	
	static url = "http://www.google.co.jp"
	
	static at = { title == "Google" }
	
	static content = {
		searchField { $("input[name=q]") }
		searchButton(to: GoogleResultPage) { $("input[name='btnK']") }
	}
	
	void inputSearchKey(String searchTerm){
		searchField.value searchTerm
	}
 
	void search() {
		searchButton.click()
	}

}

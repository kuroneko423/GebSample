package pages

import geb.Page

class GoogleResultPage extends Page {
	
	static at = { waitFor { title.endsWith("Google 検索") } }

	static content = {
		results(wait: true) { $("li.g") }
		result { index -> results[index] }
		resultLink { index -> result(index).find("a") }
		firstResultLink { resultLink(0) }
	}

}

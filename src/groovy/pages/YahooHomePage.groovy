package pages

import geb.Page;

class YahooHomePage extends Page{
	
	static url = "http://www.yahoo.co.jp"
	
	static at = { title == "Yahoo! JAPAN" }

}

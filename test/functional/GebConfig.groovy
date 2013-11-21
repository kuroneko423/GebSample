/*
 This is the Geb configuration file.
 
 See: http://www.gebish.org/manual/current/configuration.html
*/

import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.chrome.ChromeDriver

driver = { new FirefoxDriver() }

environments {
 
 // run as Åggrails -Dgeb.env=chrome test-appÅh
 // See: http://code.google.com/p/selenium/wiki/ChromeDriver
 chrome {
		 driver = { new ChromeDriver() }
 }
 
 // run as Åggrails -Dgeb.env=firefox test-appÅh
 // See: http://code.google.com/p/selenium/wiki/FirefoxDriver
 firefox {
		 driver = { new FirefoxDriver() }
 }

}
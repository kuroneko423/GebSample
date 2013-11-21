/*
 This is the Geb configuration file.
 
 See: http://www.gebish.org/manual/current/configuration.html
*/

import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.chrome.ChromeDriver

driver = { new FirefoxDriver() }

environments {
 
 // run as �ggrails -Dgeb.env=chrome test-app�h
 // See: http://code.google.com/p/selenium/wiki/ChromeDriver
 chrome {
		 driver = { new ChromeDriver() }
 }
 
 // run as �ggrails -Dgeb.env=firefox test-app�h
 // See: http://code.google.com/p/selenium/wiki/FirefoxDriver
 firefox {
		 driver = { new FirefoxDriver() }
 }

}
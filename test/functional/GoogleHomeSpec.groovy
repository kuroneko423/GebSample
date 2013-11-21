import geb.spock.GebReportingSpec
import pages.*
import spock.lang.Ignore

class GoogleHomeSpec extends GebReportingSpec {
	
	File getReportDir() {
		new File('reports')
	}
	
	@Ignore
	def "go to google pages"() {
		when:
		to GoogleHomePage
		
		then:
		at GoogleHomePage
	}
	
	
	def "go to yahoo pages"() {
		reportGroup "001"
		when:
		to YahooHomePage
		
		then:
		at YahooHomePage
	}
	
	def "google search"(){
		reportGroup "002"
		when:
		to GoogleHomePage
		report "init"
		inputSearchKey "Wikipedia"
		report "input"
		searchButton.click()
		
		then:
		resultLink(0).text().contains("Wikipedia")
	}
	
	@Ignore
	def "スクリーンショットのタイミング調査"() {
		when:
		to GoogleHomePage
		
		then:
		// 途中ではスクリーンショットが取られない
		at GoogleHomePage
		
		when:
		to YahooHomePage
		
		then:
		// ここでスクリーンショットが取られる
		at YahooHomePage
	}


}

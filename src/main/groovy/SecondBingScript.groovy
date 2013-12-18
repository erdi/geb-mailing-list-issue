

import geb.Browser

/**
 * Date: 12/11/13
 * Time: 1:20 PM
 */

//System.setProperty("webdriver.chrome.driver", "C:\\Users\\mike.clovis\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");

Browser.drive{
    to BingHomePage
    assert at(BingHomePage)
    searchBox.value("foo")
    searchButton.click()
    waitFor {
        at BingResultsPage
    }
    assert firstResult.contains("Foo Fighters")
}

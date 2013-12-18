import geb.Page

/**
 * Date: 12/11/13
 * Time: 1:05 PM
 */
class BingHomePage extends Page{

    static url = "http://www.bing.com"

    static content={
        searchBox {
            $("input",name:"q")
         }
        searchButton(to: BingResultsPage){
            $("input",name:"go")
        }
    }

    static at ={
        title == "Bing"


     }


}

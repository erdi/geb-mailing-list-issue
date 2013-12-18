

import geb.Page

/**
 * Date: 12/11/13
 * Time: 1:14 PM
 */
class BingResultsPage extends Page {


   // static url = "http://www.bing.com"

    static content={
        searchBox {
            $("input",name:"q")
        }
        searchButton(to: BingResultsPage){
            $("input",name:"go")
        }
        firstResult {
            $("ol",id:"b_results").find("li",0).find("a",0)
        }
    }

    static at ={

        title == "foo - Bing"
//        def theTitle = title
//        theTitle.contains("Bing")
        firstResult.contains("Urban Dictionary")

    }
}

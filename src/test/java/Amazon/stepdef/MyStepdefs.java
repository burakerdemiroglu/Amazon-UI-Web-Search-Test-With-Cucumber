package Amazon.stepdef;

import Amazon.Pages.Homepage;
import Amazon.utils.Helper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    Helper _helper ;
    Homepage _homepage ;
    public MyStepdefs (){
        _helper =new Helper();
        _homepage =new Homepage();
    }
    @Given("I visit {string}")
    public void iVisit(String url) {
        _helper.navigateToUrl(url);
    }

    @And("I check that the home page is opened")
    public void iCheckThatTheHomePageIsOpened() {
        _homepage.checkHomePagOpen();
    }

    @And("I choose Accept Cookies from the cookie preferences")
    public void iChooseAcceptCookiesFromTheCookiePreferences() {
        _homepage.clickCookiebtn();
    }

    @When("I type {string} in the search field and click the search button")
    public void iTypeInTheSearchFieldAndClickTheSearchButton(String searchKeyword) {
        _homepage.clickSearchBox(searchKeyword);
        _homepage.clickSearchBtn();
    }

    @Then("I checking that {string} successfully listed")
    public void iCheckingThatSuccessfullyListed(String searchKeyword) {
        _homepage.checksearchKeyword(searchKeyword);
    }
}

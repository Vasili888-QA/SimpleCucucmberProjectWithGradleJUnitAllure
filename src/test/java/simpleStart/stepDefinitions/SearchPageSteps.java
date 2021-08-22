package simpleStart.stepDefinitions;

import io.cucumber.java.en.Given;
import simpleStart.pages.SearchPage;

public class SearchPageSteps {
    SearchPage searchPage = new SearchPage();

    @Given("I click to logo Google")
    public void iClickLogoGoogle() {
        searchPage.iClickLogoGoogle();
    }
}

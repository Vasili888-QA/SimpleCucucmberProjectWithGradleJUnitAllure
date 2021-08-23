package simpleStart.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import simpleStart.pages.GeneralPage;
import io.cucumber.java.en.Given;
import org.junit.jupiter.api.Test;

public class GeneralPageSteps {
    GeneralPage generalPage = new GeneralPage();

    @Given("Open google main page")
    public void openGooglePageByDirectLink() {
        generalPage.openGooglePageByDirectLink();
    }

    @When("I enter {string} in search field")
    public void iEnterInSearchField(String inputData) {
        generalPage.iEnterInSearchField(inputData);
    }

    @Then("Search result {string} is appear")
    public void searchResultIsAppear(String searchResult) {
        generalPage.searchResultAppear(searchResult);
    }

    @Then("Google main page is open")
    public void googleMainPageIsOpen() {
        generalPage.googleMainPageIsOpen();
    }

    @And("Step is fail")
    public void stepIsFail() {
        generalPage.stepIsFail();
    }
}
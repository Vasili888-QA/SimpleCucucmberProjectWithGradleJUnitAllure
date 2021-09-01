package simpleStart.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import simpleStart.pages.ElementsPage;

public class ElementsPageSteps {
    ElementsPage elementsPage = new ElementsPage();

    @Then("Elements page is open with title {string}")
    public void elementsPageIsOpenWithTitle(String titleName) {
        elementsPage.elementsPageIsOpenWithTitle(titleName);
    }
}

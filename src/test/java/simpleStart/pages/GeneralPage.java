package simpleStart.pages;

import com.codeborne.selenide.Selenide;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byTitle;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GeneralPage {

    public void openGooglePageByDirectLink() {
        //Selenide.open("https://www.google.com/");
        open(baseUrl);
    }

    public void iEnterInSearchField(String inputData) {
        $(byName("q")).setValue(inputData).pressEnter();
    }


    public void searchResultAppear(String searchResult) {
        $("#search").shouldHave(text(searchResult));
    }

    public void googleMainPageIsOpen() {
        //Selenide.sleep(3000);
        Selenide.$x("//img[@alt='Google'] | //div[contains(@id,'logo')]").shouldBe(visible, Duration.ofMillis(10000));
    }

    public void stepIsFail() {
        $(byTitle("Главная страница Google-brokenXPath")).shouldBe(visible);
    }
}

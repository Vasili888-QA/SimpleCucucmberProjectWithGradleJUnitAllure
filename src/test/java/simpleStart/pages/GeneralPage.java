package simpleStart.pages;

import com.codeborne.selenide.Selenide;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

public class GeneralPage {

    public void openGooglePageByDirectLink() {
        Selenide.open("https://www.google.com/");
    }

    public void iEnterInSearchField(String inputData) {
        $(byName("q")).setValue(inputData).pressEnter();
    }


    public void searchResultAppear(String searchResult) {
        $("#search").shouldHave(text(searchResult));
    }

    public void googleMainPageIsOpen() {
        //Selenide.sleep(3000);
        Selenide.$x("//img[@alt='Google']").shouldBe(visible, Duration.ofMillis(10000));
    }
}

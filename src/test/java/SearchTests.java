import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

@Epic("Some Epic")
@Feature("Feature On Allure - Tests with some action on Google Site")
public class SearchTests {
    //Run on Terminal command -> gradle clean test


    @Test
    @Story("Story-1 on Allure")
    @DisplayName("DisplayName on Allure - Description1")
    void selenideSearchTest() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open("https://www.google.com/");

        $(byName("q")).setValue("selenide").pressEnter();

        $("#search").shouldHave(text("selenide.org"));
    }

    @Test
    @Story("Story-2 on Allure")
    @DisplayName("DisplayName on Allure - Description2")
    void returnToGoogleMainPage() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        //HTML Элемент на странице -->
        // <a href="https://www.google.com/webhp?hl=ru&amp;sa=X&amp;ved=0ahUKEwiqzsTw47zyAhXm-yoKHXe9AVoQPAgI" title="Главная страница Google" id="logo" data-hveid="8">
        // варианты работы с элементом через:

        //ХPath locator->
        //Selenide.$x("//a[@id='logo']").click();
        //Selenide.$(By.xpath("//a[@id='logo']")).click();

        //CSS-selector
        //$("#logo").click();

        //по атрибуту
        //$(by("id","logo")).click();
        $(by("title", "Главная страница Google")).click();

        //через атрибут title, если тест падает то нужно добавить кодировку UTF-8 в build.gradle
        //$(byTitle("Главная страница Google")).click();

        //Selenide.sleep(3000);
        Selenide.$x("//img[@alt='Google-brokenXPath']").shouldBe(visible, Duration.ofMillis(5000));
    }
}
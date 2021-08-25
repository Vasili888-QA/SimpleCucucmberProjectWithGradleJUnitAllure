package simpleStart.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.$;

public class SearchPage {

    public void iClickLogoGoogle() {
        //HTML Элемент на странице -->
        // <a href="https://www.google.com/webhp?hl=ru&amp;sa=X&amp;ved=0ahUKEwiqzsTw47zyAhXm-yoKHXe9AVoQPAgI" title="Главная страница Google" id="logo" data-hveid="8">
        // варианты работы с элементом через:

        //ХPath locator->
        //Selenide.$x("//a[@id='logo']").click();
        Selenide.$(By.xpath("//a[@id='logo'] | //div[contains(@class,'logo')]//a[contains(@href,'https://www.google.com')]")).click();

        //CSS-selector
        //$("#logo").click();

        //по атрибуту
        //$(by("id","logo")).click();
        //$(by("title", "Главная страница Google")).click();

        //через атрибут title, если тест падает то нужно добавить кодировку UTF-8 в build.gradle
        //$(byTitle("Главная страница Google")).click();
    }
}

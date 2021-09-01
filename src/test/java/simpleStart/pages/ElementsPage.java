package simpleStart.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

public class ElementsPage {
    public void elementsPageIsOpenWithTitle(String titleName) {
        Selenide.sleep(3000);
        Selenide.$x("//div[@class='main-header'][contains(text(),'" + titleName + "')]")
                .shouldHave(Condition.visible, Condition.text(titleName));
    }
}

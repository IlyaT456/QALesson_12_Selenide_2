package basePage;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class BasePage {

    public BasePage menuSolutions() {
        $(withText("Solutions")).hover();
        return this;
    }

    public BasePage menuHoverEnterprise() {
        $(withText("Enterprise")).click();
        return this;
    }

    public SelenideElement square(String number) {
        return $("#column-"+number+"");
    }

    public BasePage dragAndDropByActions() {
        SelenideElement element = $("");
        actions().moveToElement(element).click().perform();
        return this;
    }

    public BasePage dragAndDrop(SelenideElement a, SelenideElement b) {
        a.dragAndDropTo(b);
        return this;
    }

}

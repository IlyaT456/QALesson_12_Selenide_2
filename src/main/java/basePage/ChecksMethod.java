package basePage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ChecksMethod {

    public ChecksMethod chekHeadingBuildLikeTheTest() {
        $("h1[class='h1-mktg mb-3 color-fg-default']").shouldHave(text("Build like the best"));
        return this;
    }

    public ChecksMethod chekDragAndSropSquarTest() {
        $("#column-a").shouldHave(text("b"));
        $("#column-b").shouldHave(text("a"));
        return this;
    }



}

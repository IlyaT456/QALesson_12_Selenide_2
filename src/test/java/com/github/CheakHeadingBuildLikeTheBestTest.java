package com.github;

import basePage.ChecksMethod;
import org.junit.jupiter.api.Test;
import basePage.BasePage;
import static com.codeborne.selenide.Selenide.*;

public class CheakHeadingBuildLikeTheBestTest {

    BasePage basePage = new BasePage();
    ChecksMethod checksMethod = new ChecksMethod();

    @Test
    public void checksHeadingBuildLikeTheBestTest() {
        open("https://github.com/");
        basePage.menuSolutions()
                .menuHoverEnterprise();
        checksMethod.chekHeadingBuildLikeTheTest();
    }
}

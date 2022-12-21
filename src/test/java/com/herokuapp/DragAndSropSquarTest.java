package com.herokuapp;

import basePage.ChecksMethod;
import org.junit.jupiter.api.Test;
import basePage.BasePage;

import static com.codeborne.selenide.Selenide.*;

public class DragAndSropSquarTest {

    BasePage basePage = new BasePage();
    ChecksMethod checksMethod = new ChecksMethod();

    @Test
    public void dragAndDropSquarTest() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        basePage.dragAndDrop(basePage.square("a"), basePage.square("b"));
        checksMethod.chekDragAndSropSquarTest();
    }
}

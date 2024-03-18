package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.DragAndDropOptions.to;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDrop {

    @BeforeAll

    static void setConfig() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        Configuration.baseUrl = "https://the-internet.herokuapp.com";
    }


    @Test
    void dragAndDropTest() {
        open("/drag_and_drop");
        actions().clickAndHold($("#column-a")).moveToElement($("#column-b")).release().perform();
        $("#column-b").shouldHave(text("A"));
        $("#column-b").dragAndDrop(to($("#column-a")));
        $("#column-b").shouldHave(text("B"));


    }
}

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.DragAndDropOptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
public class drag_and_drop {

    @BeforeAll
    static void resolutionAndUrl() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void herokuapp() {

        //Откройте https://the-internet.herokuapp.com/drag_and_drop
        open("https://the-internet.herokuapp.com/drag_and_drop");


        // Перенесите прямоугольник А на место В
        actions().clickAndHold($("#column-a")).moveToElement($("#column-b")).release().perform();


        //Проверьте, что прямоугольники действительно поменялись
        $("#column-b").shouldHave(text("A"));

        //В Selenide есть команда $(element).dragAndDrop($(to-element)), проверьте работает ли тест, если использовать её вместо actions()

        $("#column-b").dragAndDrop(DragAndDropOptions.to($("#column-a")));

        $("#column-b").shouldHave(text("B"));



    }
}

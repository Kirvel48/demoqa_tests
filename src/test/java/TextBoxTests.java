import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        Configuration.baseUrl = "https://demoqa.com";

    }


    @Test
    void fillFormTests() {
        open("/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");


        $("#firstName").setValue("Kir");
        $("#lastName").setValue("First");
        $("#userEmail").setValue("KirFirst@gmail.com");
        $("#userNumber").setValue("9159996655");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").click();
        $(".react-datepicker__year-select").$(byText("1990")).click();
        $(".react-datepicker__month-select").click();
        $(".react-datepicker__month-select").$(byText("August")).click();
        $(".react-datepicker__month").$(byText("4")).click();
        $("#genterWrapper").$(byText("Male")).click();
        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#subjectsInput").setValue("Maths").pressEnter();
        $("#subjectsInput").setValue("Hindi").pressEnter();
        $("#uploadPicture").uploadFromClasspath("Screenshot_6.jpg");
        $("#currentAddress").setValue("Russia,Moscow, Red Square,1");
        $("#state").click();
        $("#state").$(byText("Uttar Pradesh")).click();
        $("#city").click();
        $("#city").$(byText("Merrut")).click();
        $("#submit").click();

        $(".table-responsive").shouldHave(text("Kir First"),
                (text("KirFirst@gmail.com")),
                (text("Male")),
                (text("4 August,1990")),
                (text("9159996655")),
                (text("Maths")),
                (text("Hindi")),
                (text("Sports")),
                (text("Screenshot_6.jpg")),
                (text("Russia,Moscow, Red Square,1")),
                (text("Uttar Pradesh Merrut")));
        $(".modal-footer").$(byText("Close")).click();

    }
    }

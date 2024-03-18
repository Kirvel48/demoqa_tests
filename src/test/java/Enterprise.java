import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class Enterprise {
    @BeforeAll
    static void setConfig() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void openPageEnterprise() {
        open("https://github.com");
        $("header").$(withText("Solutions")).hover();
        $("[aria-labelledby=solutions-for-heading]").$(withText("Enterprise")).click();
        $(".font-mktg").shouldHave(Condition.text("To build, scale, and deliver secure software."));


    }


}

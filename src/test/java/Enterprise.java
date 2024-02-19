import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
public class Enterprise {
    @BeforeAll
    static void resolutionAndUrl() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://github.com";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void GitLabEnterprise() {
        // - Откройте страницу в Github
        open("https://github.com");


        //Выберите меню Solutions -> Enterprise
        $("header").$(withText("Solutions")).hover();
        $("[aria-labelledby=solutions-for-heading]").$(withText("Enterprise")).click();

        //Проверка перехода на страницу https://github.com/enterprise
        $(".font-mktg").shouldHave(Condition.text("To build, scale, and deliver secure software."));





    }


}

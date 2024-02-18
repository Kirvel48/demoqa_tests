import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


public class SoftAssertions{





    @BeforeAll
    static void resolutionAndUrl() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://github.com";
        Configuration.pageLoadStrategy="eager";
    }
    @Test
    void SimpleAssertins() {
// - Откройте страницу Selenide в Github
        open("/selenide/selenide");

        // - Перейдите в раздел Wiki проекта
        $("#wiki-tab").click();

        // - Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $("#wiki-pages-filter").setValue("SoftAssertions");

        // - Откройте страницу SoftAssertions,
        $("#wiki-pages-box").$(byText("SoftAssertions")).click();
        //Проверьте что внутри есть пример кода для JUnit5
        $(".markdown-body").shouldHave(text("@ExtendWith({SoftAssertsExtension.class})\n" +
        "class Tests {\n" +
        "  @Test\n" +
        "  void test() {\n" +
        "    Configuration.assertionMode = SOFT;\n" +
        "    open(\"page.html\");\n" +
        "\n" +
        "    $(\"#first\").should(visible).click();\n" +
        "    $(\"#second\").should(visible).click();\n" +
        "  }\n" +
        "}"));



    }

}

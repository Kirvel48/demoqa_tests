package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class PracticeFormPagePO {

    public final SelenideElement firstName = $("#firstName");
    private final SelenideElement lastName = $("#lastName");

    private final SelenideElement userEmail = $("#userEmail");
    private final SelenideElement userNumber = $("#userNumber");
    private final SelenideElement gender = $("#genterWrapper");
    private final SelenideElement subjects = $("#subjectsInput");
    private final SelenideElement hobbies = $("#hobbiesWrapper");
    private final SelenideElement upload = $("#uploadPicture");
    private final SelenideElement address = $("#currentAddress");
    private final SelenideElement state = $("#state");
    private final SelenideElement city = $("#city");
    private final SelenideElement submit = $("#submit");


    public PracticeFormPagePO openPage() {
        open("/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }


    public PracticeFormPagePO setFirstName(String value) {
        firstName.setValue(value);

        return this;
    }

    public PracticeFormPagePO setLastName(String value) {
        lastName.setValue(value);

        return this;

    }

    public PracticeFormPagePO setUserEmail(String value) {
        userEmail.setValue(value);
        return this;
    }

    public PracticeFormPagePO setUserNumber(String value) {
        userNumber.setValue(value);
        return this;
    }

    public PracticeFormPagePO setGender(String value) {
        gender.$(byText(value)).click();
        return this;
    }

    public PracticeFormPagePO setSubjects(String value) {
        subjects.setValue(value).pressEnter();
        return this;
    }

    public PracticeFormPagePO setHobbies(String value) {
        hobbies.$(byText(value)).click();
        return this;
    }

    public PracticeFormPagePO setAddress(String value) {
        address.setValue(value);
        return this;
    }

    public PracticeFormPagePO setState(String value) {
        state.click();
        state.$(byText(value)).click();
        return this;
    }

    public PracticeFormPagePO setCity(String value) {
        city.click();
        city.$(byText(value)).click();
        return this;
    }

    public PracticeFormPagePO clickSubmit() {
        submit.click();
        return this;
    }

    public PracticeFormPagePO uploadFile(String value) {
        upload.uploadFromClasspath(value);
        return this;
    }

    public PracticeFormPagePO clickClose() {
        $(".modal-footer").$(byText("Close")).click();
        return this;
    }

    public PracticeFormPagePO submitEnable() {
        $("#submit").isEnabled();
        return this;
    }

}



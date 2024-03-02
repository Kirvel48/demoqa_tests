package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class PracticeFormPage {
    private SelenideElement firstName =  $("#firstName"),
    lastName =  $("#lastName"),
            userEmail =  $("#userEmail"),
            userNumber =  $("#userNumber"),
            gender =  $("#genterWrapper"),
            subjects =  $("#subjectsInput"),
            hobbies =  $("#hobbiesWrapper"),
            upload =  $("#uploadPicture"),
            address =  $("#currentAddress"),
            state =  $("#state"),
            city =  $("#city"),
            submit =  $("#submit");

public PracticeFormPage openPage(){
    open("/automation-practice-form");
    executeJavaScript("$('#fixedban').remove()");
    executeJavaScript("$('footer').remove()");
return this;
}



    public PracticeFormPage setFirstName(String value) {
        firstName.setValue(value);

        return this;
    }

    public PracticeFormPage setLastName(String value) {
        lastName.setValue(value);

        return this;

        }
        public PracticeFormPage setUserEmail(String value){
        userEmail.setValue(value);
        return this;
    }

    public PracticeFormPage setUserNumber(String value) {
        userNumber.setValue(value);
    return this;
    }
        public PracticeFormPage setGender(String value) {
            gender.$(byText(value)).click();
            return this;
        }
        public PracticeFormPage setSubjects(String value) {
            subjects.setValue(value).pressEnter();
            return this;
        }
        public PracticeFormPage setHobbies(String value) {
            hobbies.$(byText(value)).click();
            return this;
        }
        public PracticeFormPage setAddress(String value) {
            address.setValue(value);
            return this;
        }
        public PracticeFormPage setState(String value) {
    state.click();
    state.$(byText(value)).click();
            return this;
        }
        public PracticeFormPage setCity(String value) {
    city.click();
            city.$(byText(value)).click();
            return this;
        }
        public PracticeFormPage clickSubmit() {
            submit.click();
            return this;
        }
        public PracticeFormPage uploadFile (String value) {
            upload.uploadFromClasspath(value);
            return this;
        }

    public PracticeFormPage clickClose (){
        $(".modal-footer").$(byText("Close")).click();
        return this;
    }
    public PracticeFormPage submitEnable (){
        $("#submit").isEnabled();
return this;
    }

}



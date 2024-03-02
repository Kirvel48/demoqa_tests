package tests;

import org.junit.jupiter.api.Test;
import pages.PracticeFormPage;
import pages.components.CalendarComponent;
import pages.components.TableResponseComponent;

import static com.codeborne.selenide.Selenide.$;

public class AutomationPracticeForm extends TestsBase {
    PracticeFormPage practiceFormPage = new PracticeFormPage();
    CalendarComponent calendarComponent = new CalendarComponent();
    TableResponseComponent tableResponseComponent = new TableResponseComponent();
    String firstName = "Kir";
    String lastName = "Vel";
    String userEmail = "KirVel@gmail.com";
    String userNumber = "9999999999";
    String gender = "Male";
    String hobbies = "Sports";
    String subject = "Maths";
    String address = "Russia,Moscow, Red Square,1";
    String state = "Uttar Pradesh";
    String city = "Merrut";
    String day = "30";
    String month = "May";
    String year = "1994";
    String fileName = "Screenshot_6.jpg";



    @Test
    void fillFormTests() {
        practiceFormPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setUserEmail(userEmail)
                .setUserNumber(userNumber)
                .setGender(gender)
                .setAddress(address)
                .setHobbies(hobbies)
                .setSubjects(subject)
                .setState(state)
                .setCity(city)
                .uploadFile(fileName);

        calendarComponent.setDate(day,month,year);
        practiceFormPage.clickSubmit();



        tableResponseComponent.checkResult(firstName)
                .checkResult(lastName)
                .checkResult(userEmail)
                .checkResult(userNumber)
                .checkResult(gender)
                .checkResult(subject)
                .checkResult(hobbies)
                .checkResult(city)
                .checkResult(state)
                .checkResult(address)
                .checkResult(day)
                .checkResult(month)
                .checkResult(year);

                practiceFormPage.clickClose();

    }

    @Test
    void fillFormTestsnegative() {
        practiceFormPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setUserEmail(userEmail)
                .setUserNumber(userNumber)
                .setGender(gender)
                .setAddress(address)
                .setHobbies(hobbies)
                .setSubjects(subject)
                .setState(state)
                .setCity(city)
                .uploadFile(fileName);

        calendarComponent.setDate(day,month,year);
        practiceFormPage.clickSubmit();

practiceFormPage.submitEnable();

    }
    @Test
    void fillFormTestsMandatory() {
practiceFormPage.openPage()
        .setFirstName(firstName)
        .setLastName(lastName)
        .setUserEmail(userEmail)
        .setUserNumber(userNumber)
        .setGender(gender)
        .clickSubmit();

tableResponseComponent.checkResult(firstName)
                .checkResult(lastName)
                .checkResult(userEmail)
                .checkResult(userNumber)
                .checkResult(gender);

    }
}

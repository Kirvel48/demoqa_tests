package tests;

import org.junit.jupiter.api.Test;
import pages.PracticeFormPage;
import pages.components.CalendarComponent;
import pages.components.TableResponseComponent;

import static tests.TestsData.*;


public class PracticeFormFaker extends TestsBase {
    PracticeFormPage practiceFormPage = new PracticeFormPage();
    TestsData testsData = new TestsData();

    CalendarComponent calendarComponent = new CalendarComponent();
    TableResponseComponent tableResponseComponent = new TableResponseComponent();
    String firstName = getFirstName();
    String lastName = getLastName();
    String userEmail = getUserEmail();
    String userNumber = getUserNumber();
    String gender = getGender();
    String hobbies = getHobbies();
    String subject = getSubject();
    String address = getAddress();
    String state = getState();
    String city = getCity();
    String day = getDay();
    String month = getMonth();
    String year = getYear();
    String fileName = getFileName();



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

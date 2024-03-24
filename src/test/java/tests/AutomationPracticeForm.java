package tests;

import org.junit.jupiter.api.Test;
import pages.PracticeFormPagePO;
import pages.components.CalendarComponent;
import pages.components.TableResponseComponent;
import TestsData.TeststDataPO;

import static TestsData.TeststDataPO.gender;
import static TestsData.TeststDataPO.lastName;

public class AutomationPracticeForm extends TestsBase {
    PracticeFormPagePO practiceFormPage = new PracticeFormPagePO();
    CalendarComponent calendarComponent = new CalendarComponent();
    TableResponseComponent tableResponseComponent = new TableResponseComponent();


    @Test
    void fillFormTests() {
        practiceFormPage.openPage()
                .setFirstName(TeststDataPO.firstName)
                .setLastName(lastName)
                .setUserEmail(TeststDataPO.userEmail)
                .setUserNumber(TeststDataPO.userNumber)
                .setGender(gender)
                .setAddress(TeststDataPO.address)
                .setHobbies(TeststDataPO.hobbies)
                .setSubjects(TeststDataPO.subject)
                .setState(TeststDataPO.state)
                .setCity(TeststDataPO.city)
                .uploadFile(TeststDataPO.fileName);

        calendarComponent.setDate(TeststDataPO.day, TeststDataPO.month, TeststDataPO.year);
        practiceFormPage.clickSubmit();


        tableResponseComponent.checkResult(TeststDataPO.firstName)
                .checkResult(lastName)
                .checkResult(TeststDataPO.userEmail)
                .checkResult(TeststDataPO.userNumber)
                .checkResult(gender)
                .checkResult(TeststDataPO.subject)
                .checkResult(TeststDataPO.hobbies)
                .checkResult(TeststDataPO.city)
                .checkResult(TeststDataPO.state)
                .checkResult(TeststDataPO.address)
                .checkResult(TeststDataPO.day)
                .checkResult(TeststDataPO.month)
                .checkResult(TeststDataPO.year);

        practiceFormPage.clickClose();

    }

    @Test
    void fillFormTestsnegative() {
        practiceFormPage.openPage()
                .setFirstName(TeststDataPO.firstName)
                .setLastName(lastName)
                .setUserEmail(TeststDataPO.userEmail)
                .setUserNumber(TeststDataPO.userNumber)
                .setGender(gender)
                .setAddress(TeststDataPO.address)
                .setHobbies(TeststDataPO.hobbies)
                .setSubjects(TeststDataPO.subject)
                .setState(TeststDataPO.state)
                .setCity(TeststDataPO.city)
                .uploadFile(TeststDataPO.fileName);

        calendarComponent.setDate(TeststDataPO.day, TeststDataPO.month, TeststDataPO.year);
        practiceFormPage.clickSubmit();

        practiceFormPage.submitEnable();

    }

    @Test
    void fillFormTestsMandatory() {
        practiceFormPage.openPage()
                .setFirstName(TeststDataPO.firstName)
                .setLastName(lastName)
                .setUserEmail(TeststDataPO.userEmail)
                .setUserNumber(TeststDataPO.userNumber)
                .setGender(gender)
                .clickSubmit();

        tableResponseComponent.checkResult(TeststDataPO.firstName)
                .checkResult(lastName)
                .checkResult(TeststDataPO.userEmail)
                .checkResult(TeststDataPO.userNumber)
                .checkResult(gender);

    }
}
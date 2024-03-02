package tests;
import com.github.javafaker.Faker;
import org.testng.annotations.Test;

import java.util.Locale;

import static java.lang.String.valueOf;

@Test
public class TestsData {
    static Faker faker = new Faker(new Locale("en"));
    static String firstName, lastName, userEmail, userNumber, gender, hobbies, subject, address,
            state, city, day, month, year,fileName;

    public static String getFirstName() {
        return firstName = faker.name().firstName();
    }

    public static String getLastName() {
        return lastName = faker.name().lastName();
    }

    public static String getUserEmail() {
        return userEmail = faker.internet().emailAddress();
    }

    public static String getUserNumber() {
        return userNumber = faker.phoneNumber().subscriberNumber(10);
    }

    public static String getAddress() {
        return address = faker.address().fullAddress();
    }

    public static String getDay() {
        return day = String.valueOf(faker.number().numberBetween(1, 28));

    }

    public static String getMonth() {
        return month = faker.options().option("January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December");
    }

    public static String getYear() {
        return year = String.valueOf(faker.number().numberBetween(1900, 2024));

    }

    public static String getHobbies() {
        return hobbies = faker.options().option("Sports", "Reading", "Music");
    }

    public static String getSubject() {
        return subject = faker.options().option("Biology", "Chemistry", "Economics", "English", "Hindi", "History", "Maths");
    }
    public static String getFileName() {
        return state = faker.options().option("Screenshot_6.jpg", "Screenshot_7.jpg");
    }

    public static String getGender() {
        return gender = faker.options().option("Male", "Female", "Other");
    }

    public static String getState() {
        return state = faker.options().option("NCR", "Uttar Pradesh", "Haryana", "Rajasthan");
    }

    public static String getCity(){
        switch (state) {
            case "NCR":
                return state = faker.options().option("Delhi", "Gurgaon", "Noida");
            case "Uttar Pradesh":
                return state = faker.options().option("Agra", "Lucknow", "Merrut");
            case "Haryana":
                return state = faker.options().option("Karnal", "Panipat");
            case "Rajasthan":
                return state = faker.options().option("Jaipur", "Jaiselmer");
        }
        return city;
    }
}




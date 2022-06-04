package tests;

import org.junit.jupiter.api.Test;

public class FormTests extends TestBase {



    @Test
    void successfulTest() {

        formPage.openPage()
                .setFirstName(testDataProfile.firstName)
                .setLastName(testDataProfile.lastName)
                .setEmail(testDataProfile.email)
                .setGender(testDataProfile.gender)
                .setPhone(testDataProfile.phone)
                .setDateOfBirth(testDataProfile.day, testDataProfile.month, testDataProfile.year)
                .setSubjects(testDataProfile.subShort, testDataProfile.subFull)
                .setHobbies(testDataProfile.hobbies)
                .uploadFile(testDataProfile.file)
                .setAddress(testDataProfile.address)
                .setState(testDataProfile.state)
                .setCity(testDataProfile.city)

                .clickSubmit()

                .checkResult("Student Name", testDataProfile.firstName + " " + testDataProfile.lastName)
                .checkResult("Student Email", testDataProfile.email)
                .checkResult("Gender", testDataProfile.gender)
                .checkResult("Mobile", testDataProfile.phone)
                .checkResult("Date of Birth", testDataProfile.day + " " + testDataProfile.month + "," + testDataProfile.year)
                .checkResult("Subjects", testDataProfile.subFull)
                .checkResult("Hobbies", testDataProfile.hobbies)
                .checkResult("Picture", testDataProfile.file)
                .checkResult("Address", testDataProfile.address)
                .checkResult("State and City", testDataProfile.state + " " + testDataProfile.city);

    }
}










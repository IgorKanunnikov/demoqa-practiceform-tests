package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.Calendar;
import pages.components.ResultTable;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FormPage {

    Calendar calendar = new Calendar();
    ResultTable resultTable = new ResultTable();

    SelenideElement firstNameInput = $("[id=firstName]"),
    lastNameInput = $("[id=lastName]"),
    email = $("[id=userEmail]"),
    phone = $("#userNumber"),
    dob = $("#dateOfBirthInput"),
    subj = $("#subjectsInput"),
    file = $("#uploadPicture"),
    address = $("#currentAddress"),
    state = $("#react-select-3-input"),
    city = $("#react-select-4-input"),
    submit = $("[id=submit]");

    public FormPage openPage() {
        open("automation-practice-form/");
        return this;
    }

    public FormPage setFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    public FormPage setLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    public FormPage setEmail(String value) {
        email.setValue(value);
        return this;
    }

    public FormPage setGender(String value) {
        $(byText(value)).click();
        return this;
    }

    public FormPage setPhone(String value) {
        phone.setValue(value);
        return this;
    }

    public FormPage setDateOfBirth(String day, String month, String year) {
        dob.click();
        calendar.setDate(day, month, year);
        return this;
    }

    public FormPage setSubjects(String symbol, String value) {
        subj.sendKeys(symbol);
        $(byText(value)).click();
        return this;
    }

    public FormPage setHobbies(String value) {
        $(byText(value)).click();
        return this;
    }

    public FormPage uploadFile(String value) {
        file.uploadFromClasspath(value);
        return this;
    }

    public FormPage setAddress(String value) {
        address.setValue(value);
      return this;
    }

    public FormPage setState(String value) {
        state.setValue(value).pressEnter();
        return this;
    }

    public FormPage setCity(String value) {
        city.setValue(value).pressEnter();
        return this;
    }

    public FormPage clickSubmit() {
        submit.click();
        return this;
    }

    public FormPage checkResult (String key, String value) {
        resultTable.checkResult(key, value);
        return this;
    }
}

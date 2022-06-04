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
    lastNameInput = $("[id=lastName]");

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
        $("[id=userEmail]").setValue(value);
        return this;
    }

    public FormPage setGender(String value) {
        $(byText(value)).click();
        return this;
    }

    public FormPage setPhone(String value) {
        $("#userNumber").setValue(value);
        return this;
    }

    public FormPage setDateOfBirth(String day, String month, String year) {
        $("#dateOfBirthInput").click();
        calendar.setDate(day, month, year);
        return this;
    }

    public FormPage setSubjects(String symbol, String value) {
        $("#subjectsInput").sendKeys(symbol);
        $(byText(value)).click();
        return this;
    }

    public FormPage setHobbies(String value) {
        $(byText(value)).click();
        return this;
    }

    public FormPage uploadFile(String value) {
        $("#uploadPicture").uploadFromClasspath(value);
        return this;
    }

    public FormPage setAddress(String value) {
        $("#currentAddress").setValue(value);
      return this;
    }

    public FormPage setState(String value) {
        $("#react-select-3-input").setValue(value).pressEnter();
        return this;
    }

    public FormPage setCity(String value) {
        $("#react-select-4-input").setValue(value).pressEnter();
        return this;
    }

    public FormPage clickSubmit() {
        $("[id=submit]").click();
        return this;
    }

    public FormPage checkResult (String key, String value) {
        resultTable.checkResult(key, value);
        return this;
    }
}

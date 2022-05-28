import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FormTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com/";
        Configuration.browserSize = "3840x2160";

        // Configuration.holdBrowserOpen = true;
    }

    @Test
    void successfulTest() {

        open("automation-practice-form/");

        $("[id=firstName]").setValue("John");
        $("[id=lastName]").setValue("Jumbo");
        $("[id=userEmail]").setValue("jjoff@testmail.io");

        $(byText("Male")).click();

        $("#userNumber").setValue("7000952953"); // с # вместо id=

        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("August"); // с . вместо class=
        $(".react-datepicker__year-select").selectOption("1990");
        $(".react-datepicker__day--011").click();

        $("#subjectsInput").sendKeys("E");
        $(byText("English")).click();

        $(byText("Music")).click();

        $("#uploadPicture").uploadFromClasspath("orig.jpg");

        $("#currentAddress").setValue("New-York 1/10");

        $("#react-select-3-input").setValue("Rajasthan").pressEnter();
        $("#react-select-4-input").setValue("Jaipur").pressEnter();

        $("[id=submit]").click();

        $(".table-responsive").shouldHave(

                text("John Jumbo"),
                text("jjoff@testmail.io"),
                text("Male"),
                text("7000952953"),
                text("11 August,1990"),
                text("English"),
                text("Music"),
                text("orig.jpg"),
                text("New-York 1/10"),
                text("Rajasthan Jaipur")

                );
    }


}










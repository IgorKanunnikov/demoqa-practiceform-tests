package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import pages.FormPage;

public class TestBase {
    FormPage formPage = new FormPage();
    TestDataProfile testDataProfile = new TestDataProfile();

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com/";
        Configuration.browserSize = "3840x2160";
        // Configuration.holdBrowserOpen = true;
    }
}

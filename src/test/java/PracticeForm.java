import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticeForm {
    @BeforeAll
    static void beforeAll(){
        Configuration.holdBrowserOpen = false;
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }
    @Test
    void practiceFormTest() {
        open("/automation-practice-form");

        $("#firstName").setValue("Ivan");
        $("#lastName").setValue("Ivanovich");
        $("#gender-radio-1").click();
        $("#userNumber").setValue("+712345674");
        $("#dateOfBirthInput").setValue("01 Aug 2001");
        $("#hobbies-checkbox-1").click();
//        $("#uploadPicture").uploadFile(new File(sample.png));
        $("#currentAddress").setValue("Current Address- address");
        $("#state").setValue("Haryana");
        $("#city").setValue("Karnal");
        $("#submit").click();
        $("#output #name").shouldHave(text("Ivan"));
        $("#output #userEmail").shouldHave(text("Ivan@ya.ru"));
        $("#output #currentAddress").shouldHave(text("Address info"));

    }
}



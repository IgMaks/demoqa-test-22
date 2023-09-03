import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {
    @BeforeAll
    static void beforeAll(){
//        Configuration.holdBrowserOpen = true;
//        Configuration.browserSize = "1920x1080";
//        Configuration.baseUrl = "https://demoqa.com";
//        Configuration.pageLoadStrategy="eager";
    }
    @Test
    void fillFormTest() {
        open("/text-box");

        $("#userName").setValue("Ivan");
        $("#userEmail").setValue("Ivan@ya.ru");
        $("#currentAddress").setValue("Address info");
        $("#permanentAddress").setValue("Permanent Address- address");
        $("#submit").click();
        $("#output").shouldBe(visible);
        $("#output #name").shouldHave(text("Ivan"));
        $("#output #email").shouldHave(text("Ivan@ya.ru"));
        $("#output #currentAddress").shouldHave(text("Address info"));

    }
}

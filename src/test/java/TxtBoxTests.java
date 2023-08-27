import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TxtBoxTests {
    @Test
    void fillFormTest() {
        open("https://demoqa.com/text-box");

        $("#userName").setValue("Ivan");
        $("#userEmail").setValue("Ivan@ya.ru");
        $("#currentAddress").setValue("Address info");
        $("#permanentAddress").setValue("Permanent Address- address");
        $("#submit").click();
        $("#output").shouldBe(visible);
    }
}

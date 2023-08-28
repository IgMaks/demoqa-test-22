import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;


public class PracticeForm {
    @BeforeAll
    static void beforeAll(){
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy="eager";
    }
    @Test
    void practiceFormTest() {
        open("/automation-practice-form");
//        sleep(5000);

        $("#firstName").setValue("Ivan");
        $("#lastName").setValue("Ivanovich");
        $("#userEmail").setValue("Ivanovich@ya.ru");
        $(".custom-control-label").click();
        $("#userNumber").setValue("9712345674");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("February");
        $(".react-datepicker__year-select").selectOption("2000");
        $(".react-datepicker__day--001").click();
        $("#subjectsInput").setValue("p").pressEnter();
//       Выбор хобби
        $x("//*[@id=hobbies-checkbox-1]").click();

        $("#uploadPicture").uploadFile(new File("src/resources/1.jpg"));
        $("#currentAddress").setValue("Current Address- address");
        $("#state").click();
        $("#state").setValue("NCR").click();
//        $("#city").click();
//        $("#city").setValue("Delhi").pressEnter();
//        $("#submit").click();
//        $("#output #name").shouldHave(text("Ivan"));
//        $("#output #userEmail").shouldHave(text("Ivan@ya.ru"));
//        $("#output #currentAddress").shouldHave(text("Address info"));
    }
}



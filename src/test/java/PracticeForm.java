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
        Configuration.holdBrowserOpen = false;
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy="eager";
    }
    @Test
    void practiceFormTest() {

        open("/automation-practice-form");

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
        $("label[for='hobbies-checkbox-2']").click();
        $("#uploadPicture").uploadFile(new File("src/resources/1.jpg"));
        $("#currentAddress").setValue("Current Address- address");
        $("#state").click();
        $("#react-select-3-input").setValue("NCR").pressEnter();
        $("#city").click();
        $("#react-select-4-input").setValue("Delhi").pressEnter();
        $("#submit").click();
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(
                text("Ivan Ivanovich"),
                text("Ivanovich@ya.ru"),
                text("Male"),
                text("9712345674"),
                text("Physics"),
                text("1.jpg"),
                text("Current Address- address"),
                text("NCR Delhi"));
        $("#closeLargeModal").click();
    }
}



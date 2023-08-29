import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class JUnit5Search {
    @Test
    void searchFindSoftAssertions(){
//       Откройте страницу Selenide в Github
        open("https://github.com/");
        $(".input-button").click();
        $("#query-builder-test").setValue("Selenide").pressEnter();
        $x("//a[@href='/selenide/selenide']").click();
//        Переход в wiki
        $("#wiki-tab").click();
//        Проверка налиия страницы Soft assertions
        $(".markdown-body").shouldHave(Condition.text("Soft assertions"));
//        Переход на страницу Soft Assertions
        $(".internal.present[href='/selenide/selenide/wiki/SoftAssertions']").click();
//        Проверка наличия раздела с кодом Junit5
        $("#wiki-body").shouldHave(Condition.text("Using JUnit5 extend test class:"));
    }
}

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class GitHubSearch {
    @BeforeAll

    static void beforeAll() {
//        Arrange
        Configuration.holdBrowserOpen = false;
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }
    @Test
    void shouldFindSelenideRepositoryAtTheTop(){
//        Открыть браузер github
        open("https://github.com/");
//        Ввести в строку поиска Selenide и кликнуть enter
        $(".input-button").click();
        $("#query-builder-test").setValue("Selenide").pressEnter();
//        в списке найденных репозиториев найти
        $x("//a[@href='/selenide/selenide']").click();

        $("#repository-container-header").shouldHave(text("selenide / selenide"));





    }


}

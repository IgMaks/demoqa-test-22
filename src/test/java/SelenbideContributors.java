import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenbideContributors {

    @Test
    void solntsevShouldBeTheTopContributors(){
//        Configuration.holdBrowserOpen = true;
        open("https://github.com/selenide/selenide");
        $(".Layout-sidebar").find(byText("Contributors"))
                .ancestor("div").$$("ul li").first().hover();
//        Поиск видимого элемента
        $$(".Popover").findBy(visible).shouldHave(text("Andrei Solntsev"));

    }
}

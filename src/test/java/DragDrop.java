import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DragDrop {
    @Test
     void dragDrop(){
        open("https://the-internet.herokuapp.com/drag_and_drop");

        $("[id=column-a]").shouldHave(text("A"));
        $("[id=column-b]").shouldHave(text("B"));
        $("[id=column-a]").dragAndDropTo($("[id=column-b]"));
        $("[id=column-a]").shouldHave(text("B"));
        $("[id=column-b]").shouldHave(text("A"));


    }

}

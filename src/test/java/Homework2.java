import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.DragAndDropOptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class Homework2 {
    @BeforeEach
    void setUp() {
        Configuration.pageLoadStrategy = "eager";
        Configuration.pageLoadTimeout = 60000; // 60 секунд (значение в миллисекундах)
    }
        @BeforeAll
    static void beforeALl() {Configuration.browserSize = "1920x1080";}

        @Test
        void homeShoulBeTheTopContributor(){
            Configuration.holdBrowserOpen = true;
            // открыть страницу https://the-internet.herokuapp.com/drag_and_drop
            open("https://the-internet.herokuapp.com/drag_and_drop");
            //Перенесите прямоугольник А на место В
           // actions().moveToElement($("#column-a")).clickAndHold().moveByOffset(250,0).release().perform();
            //Проверьте, что прямоугольники действительно поменялись
          // $("#column-a").shouldHave(text("B"));
            $("#column-a").dragAndDrop(DragAndDropOptions.to("#column-b"));
            $("#column-a").shouldHave(text("B"));

        }
}

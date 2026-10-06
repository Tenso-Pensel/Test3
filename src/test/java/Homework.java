import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.text;

public class Homework {
    @Test
    void homeShoulBeTheTopContributor(){
        Configuration.holdBrowserOpen = true;
        // открыть страницу github
        open("https://github.com/");
        //навестись на раздел Solution и кликнуть на Enterprize
        $(byText("Solutions")).hover();
        //кликаем по появившейся ссылке Enterprise
        $("[href*='enterprise']").click();
        //проверим что загрузилась нужная страница первый заголовок "GitHub Enterprise"
        $("[data-testid='hero-stacked']").shouldHave(text("GitHub Enterprise"));

    }

}

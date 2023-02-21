package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class ExampleTest {

    @BeforeAll
    static void configuration () {
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }
    @Test
    @DisplayName("Тест 1")
    public void mainPage() {
        open("http://vorobeyenglish.ru");
        //Selenide.sleep(3000);
        $(".link").click();
        $(".title_3").as("Ошибка в заголовке").shouldHave(text("Преимущества тестирования"));
    }

    @Test
    @DisplayName("Тест 2")
    public void mainPage1() {
        open("http://vorobeyenglish.ru");
       // Selenide.sleep(3000);
        $$(".link").get(1).click();
        $$(".title_3").get(1).as("Ошибка в заголовке").shouldHave(text("Уровни знания языка по Европейской системе"));

    }
}

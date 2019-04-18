package ru.vereshchagin.stepsPack;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;
import static ru.vereshchagin.stepsPack.LoginForm.login;
import static ru.vereshchagin.stepsPack.OpenBrowser.openWindow;


public class Test1 {

    @BeforeClass
    public static void Preapare() {
        openWindow();
        login();
    }

    @Test
    public void loginTry() {
//        $("title").shouldHave(text("Входящие - Почта Mail.Ru"));
        $$(By.cssSelector("#b-letters .b-datalist__body > div")).shouldHave(size(1));
        $$(By.cssSelector("#b-letters .b-datalist__body > div")).get(0).should(text("1 апр\n" + "Тест1Тест 1 -- Selenium Selenide\n" + "Selenium Selenide"));

    }


    @AfterClass
    public static void logout() {
        closeWebDriver();
    }


}

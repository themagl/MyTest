package ru.vereshchagin.stepsPack;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;
import static ru.vereshchagin.stepsPack.LoginForm.login;
import static ru.vereshchagin.stepsPack.LoginForm.notValidLogin;
import static ru.vereshchagin.stepsPack.OpenBrowser.openWindow;

public class Test2 {
    @BeforeClass
    public static void Preapare() {
        openWindow();
    }

    @Test
    public void loginTry() {
        notValidLogin();
        $(By.xpath("//div[contains(@id, 'mailbox:error') and text()='Неверное имя или пароль']")).shouldBe(visible);
    }


    @AfterClass
    public static void logout() {
        closeWebDriver();
    }

}

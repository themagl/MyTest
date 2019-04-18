package ru.vereshchagin.stepsPack;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;
import static ru.vereshchagin.stepsPack.EmailCreatePage.createEmail;
import static ru.vereshchagin.stepsPack.LoginForm.login;
import static ru.vereshchagin.stepsPack.MailBoxMainPage.createEmailButton;
import static ru.vereshchagin.stepsPack.OpenBrowser.openWindow;
import static ru.vereshchagin.stepsPack.TestData.userLogin;

public class Test3 {
    @BeforeClass
    public static void Preapare() {
        openWindow();
        login();
    }

    @Test
    public void loginTry() {
        createEmailButton();
        createEmail(userLogin, "Тема сообщения", "Это тестовое сообщение");
    }


    @AfterClass
    public static void logout() {
        closeWebDriver();
    }

}
package ru.vereshchagin.stepsPack;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;
import static ru.vereshchagin.stepsPack.LoginForm.login;
import static ru.vereshchagin.stepsPack.MailBoxMainPage.*;
import static ru.vereshchagin.stepsPack.OpenBrowser.openWindow;

public class Test3 {
    @BeforeClass
    public static void Preapare() {
        openWindow();
        login();
    }

    @Test
    public void loginTry() {
        MailBoxMainPage mailBoxMainPage = page(MailBoxMainPage.class);
//        Переходим в папку Отправленные
        mailMenuNavigate(sentFolder);
//        Переходим в папку Черновики
        mailMenuNavigate(draftFolder);
//        Переходим в папку Корзина
        mailMenuNavigate(garbageFolder);
//        Переходим в папку Входящие
        mailMenuNavigate(inputFolder);
    }


    @AfterClass
    public static void logout() {
        closeWebDriver();
    }

}
package ru.vereshchagin.stepsPack;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;
import static ru.vereshchagin.stepsPack.LoginForm.login;
import static ru.vereshchagin.stepsPack.LoginForm.notValidLogin;
import static ru.vereshchagin.stepsPack.MailBoxMainPage.*;
import static ru.vereshchagin.stepsPack.OpenBrowser.openWindow;
import static ru.vereshchagin.stepsPack.TestData.piCheck;



public class Test1 {

    @BeforeClass
    public static void Preapare() {
        openWindow();
    }

    @Test
    public void loginTry() {
//        Пробуем залогиниться с невалидными данными
        notValidLogin();
//        Пробуем залогиниться с валидными данными
        login();
//        Проверяем наличие двух писем в ящике
        messageListCount(2);
//        Проверяем содержание последнего письма письма
        messageContentCheck(messageList.size()-1, piCheck);
//        Проверяем начилие активной папки "Входящие" в меню навигации
        $$(By.cssSelector("#b-nav_folders .b-nav__item.js-href.b-nav__item_active > a > span")).shouldHave(size(1));
    }

    @AfterClass
    public static void logout() {
        closeWebDriver();
    }
}

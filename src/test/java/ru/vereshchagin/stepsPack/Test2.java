package ru.vereshchagin.stepsPack;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;
import static ru.vereshchagin.stepsPack.EmailCreatePage.createEmail;
import static ru.vereshchagin.stepsPack.LoginForm.login;
import static ru.vereshchagin.stepsPack.MailBoxMainPage.*;
import static ru.vereshchagin.stepsPack.OpenBrowser.openWindow;
import static ru.vereshchagin.stepsPack.TestData.*;

public class Test2 {
    @BeforeClass
    public static void Preapare() {
        openWindow();
    }

    @Test
    public void sendMessage() {
//        Пробуем залогиниться с валидными данными
        login();
//        Жмем кнопку "Написать письмо"
        createEmailButton();
//        Отправляем себе письмо
        createEmail(userLogin,messageSubject,messageText);
//        Переходим в папку входящие и проверяем наличие письма
        inputFolder.click();
        messageContentCheck(0,messageSubject + messageText);
//        Удаляем полученное письмо
        messageDelete(0);
    }

    @AfterClass
    public static void logout() {
        closeWebDriver();
    }
}

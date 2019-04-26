package ru.vereshchagin.stepsPack;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;
import static ru.vereshchagin.stepsPack.FolderSettingsPage.*;
import static ru.vereshchagin.stepsPack.LoginForm.login;
import static ru.vereshchagin.stepsPack.MailBoxMainPage.*;
import static ru.vereshchagin.stepsPack.OpenBrowser.openWindow;
import static ru.vereshchagin.stepsPack.TestData.*;

public class Test4 {
    @BeforeClass
    public static void Preapare() {
        openWindow();
    }

    @Test
    public void createFolder() {
        //        Пробуем залогиниться с валидными данными
        login();
        //        Проверяем начилие активной папки "Входящие" в меню навигации
        $$(By.cssSelector("#b-nav_folders .b-nav__item.js-href.b-nav__item_active > a > span")).shouldHave(size(1));
        //        Проверяем содержание последнего письма письма
        MailBoxMainPage mailBoxMainPage = page(MailBoxMainPage.class);
        messageContentCheck(messageList.size() - 1, piCheck);
        //        Переходим в настройки папок почтового ящика
        folderSettingsClick();
        //        Создаем новую папку
        createNewFolder(folderName);
        //        Переходим на главную страницу почтового ящика
        mailMainPageButton.click();
        //        Проверяем наличие созданной папки
        checkFolderConsistinList(folderName);
        //        Переходим в настройки папок почтового ящика
        folderSettingsClick();
        //        Наводим на строку с названием папки
        folderHover(folderName);
        //        Нажимаем на кнопку удаления папки
        deleteClick(folderName);
        //        Переходим на главную страницу почтового ящика
        mailMainPageButton.click();
        //        Проверяем, что папка была удалена
        checkFolderNotConsistinList(folderName);
    }

    @AfterClass
    public static void logout() {
        closeWebDriver();
    }
}

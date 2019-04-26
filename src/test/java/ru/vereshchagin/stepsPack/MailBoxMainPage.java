package ru.vereshchagin.stepsPack;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.page;

public class MailBoxMainPage {
    @FindBy(xpath = "//span[text()='Написать письмо']")
    public static SelenideElement emailCreateButton;

    @FindBy(xpath = "//span[contains(text(),'Отправленные')]")
    public static SelenideElement sentFolder;

    @FindBy(xpath = "//span[contains(text(),'Черновики')]")
    public static SelenideElement draftFolder;

    @FindBy(xpath = "//span[contains(text(),'Корзина')]")
    public static SelenideElement garbageFolder;

    @FindBy(xpath = "//span[contains(text(),'Входящие')]")
    public static SelenideElement inputFolder;

    @FindBy(xpath = "//*[@id=\"jsHtml\"]/head/title")
    public static SelenideElement mailBoxMainPageTitle;

    @FindBy(css = "#b-letters .b-datalist__body > div")
    public static ElementsCollection messageList;

    @FindBy(xpath = "//*[@class='b-nav__item__text']")
    public static ElementsCollection folderList;

    @FindBy(xpath = "//div[@class=\"js-checkbox b-checkbox\"]/div[@class=\"b-checkbox__box\"]")
    public static ElementsCollection messageListCheckbox;

    @FindBy(xpath = "//span[contains(text(),'Удалить')]")
    public static SelenideElement deleteButton;

    @FindBy(xpath = "//span[contains(text(),'Настроить папки')]")
    public static SelenideElement folderSettings;

    @FindBy(xpath = "//div[@class=\"b-nav__item js-href b-nav__item_no-bg b-nav__item_settings\"]")
    public static SelenideElement folderSettingsHover;

    @FindBy(xpath = "//span[text()='Письма']")
    public static SelenideElement mailMainPageButton;

    public static void folderSettingsClick() {
//        Наводим на поле настроек и нажимаем на кнопку "Настроить папки"
        folderSettingsHover.hover();
        folderSettings.click();
    }

    public static void checkFolderConsistinList(String name) {
//        Проверяем наличие папки по индексу и имени
        folderList.get(1).shouldHave(text(name));
    }

    public static void checkFolderNotConsistinList(String name) {
//        Проверяем отсутствие папки по индексу и имени
        folderList.get(1).shouldNotHave(text(name));
    }

    public static void messageDelete(int index) {
//        Удаляем письмо по индексу
        messageListCheckbox.get(index).click();
        deleteButton.click();
    }

    public static void messageListCount(int count) {
//        Считаем количество писем в списке
        MailBoxMainPage mailBoxMainPage = page(MailBoxMainPage.class);
        messageList.shouldHave(size(count));

    }

    public static void messageContentCheck(int index, String text) {
//        Проверяем содержание письма по индексу
        messageList.get(index).should(text(text));
    }

    public static void createEmailButton() {
//        Нажимаем кнопку "Создать письмо"
        MailBoxMainPage mailBoxMainPage = page(MailBoxMainPage.class);
        emailCreateButton.click();
    }

    public static void mailMenuNavigate(SelenideElement locator) {
//        Переходим по локатору
        locator.click();
    }
}

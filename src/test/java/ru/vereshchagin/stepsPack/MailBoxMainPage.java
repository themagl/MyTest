package ru.vereshchagin.stepsPack;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static ru.vereshchagin.stepsPack.TestData.userLogin;
import static ru.vereshchagin.stepsPack.TestData.userPassword;

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

    public static void createEmailButton() {
        MailBoxMainPage mailBoxMainPage = page(MailBoxMainPage.class);
        emailCreateButton.click();
    }

//    public static void checkEmailsConsists() {
//        $(By.id("b-letters")).should(visible);
//        $$(By.cssSelector("#b-letters .b-datalist__body > div")).shouldHave(size(2));
//        $$(By.cssSelector("#b-letters .b-datalist__body > div")).get(0).should(text("1 апреля\n" + "Тест 1 -- Selenium Selenide\n" + "Selenium Selenide"));
//    }
}

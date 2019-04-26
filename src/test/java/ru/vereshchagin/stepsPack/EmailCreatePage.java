package ru.vereshchagin.stepsPack;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.Selenide.switchTo;

public class EmailCreatePage {
    @FindBy(xpath = "//textarea[@class='js-input compose__labels__input'][1]")
    public static SelenideElement sendToField;

    @FindBy(xpath = "//input[@name='Subject']")
    public static SelenideElement subjectField;

    @FindBy(xpath = "//body[@id='tinymce']")
    public static SelenideElement inputMessageField;

    @FindBy(xpath = "//div[@class='b-toolbar']//span[text()='Отправить']")
    public static SelenideElement sendButton;

    @FindBy(xpath = "//div[@class='b-toolbar']//span[text()='Отмена']")
    public static SelenideElement cancelButton;

    @FindBy(xpath = "//iframe[starts-with(@id,'toolkit')]")
    public static SelenideElement Iframe;

    @FindBy(xpath = "//*[@id=\"b-compose__sent\"]/div/div[1]/div")
    public static SelenideElement messageSentTitle;

    public static void createEmail(String s1, String s2, String s3) {
//        Вводим при создании письма адрес, тему и текст письма
        EmailCreatePage emailCreatePage = page(EmailCreatePage.class);
        sendToField.setValue(s1);
        subjectField.click();
        subjectField.setValue(s2);
        switchTo().frame(Iframe);
        inputMessageField.click();
        inputMessageField.sendKeys(Keys.PAGE_UP);
        inputMessageField.sendKeys(s3);
        switchTo().defaultContent();
        sendButton.click();
    }
}

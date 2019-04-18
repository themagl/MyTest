package ru.vereshchagin.stepsPack;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class EmailCreatePage {
    @FindBy(xpath = "//textarea[@class='js-input compose__labels__input'][1]")
    public static SelenideElement sendToField;

    @FindBy(xpath = "//input[@name='Subject']")
    public static SelenideElement subjectField;

    @FindBy(css = "tinymce")
    public static SelenideElement inputMessageField;

    @FindBy(xpath = "//div[@class='b-toolbar']//span[text()='Отправить']")
    public static SelenideElement sendButton;

    @FindBy(xpath = "//div[@class='b-toolbar']//span[text()='Отмена']")
    public static SelenideElement cancelButton;

    public static void createEmail(String s1, String s2, String s3) {
        EmailCreatePage emailCreatePage = page(EmailCreatePage.class);
        sendToField.setValue(s1);
        subjectField.click();
        subjectField.setValue(s2);
        inputMessageField.click();
        inputMessageField.setValue(s3);
        sendButton.click();
    }
}

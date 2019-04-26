package ru.vereshchagin.stepsPack;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.page;

public class FolderSettingsPage {
    @FindBy(xpath = "//span[text()=\"Добавить папку\"]")
    public static SelenideElement folderAddButton;

    @FindBy(xpath = "//input[@name=\"name\"]")
    public static SelenideElement popupNewFolderName;

    @FindBy(xpath = "//span[text()=\"Добавить\"]")
    public static SelenideElement popupNewFolderAddButton;

    @FindBy(xpath = "//div[text()='NewTestFolder']")
    public static SelenideElement newFolderLine;

    @FindBy(xpath = "//span[text()='Удалить']")
    public static SelenideElement popupDeleteFolderConfirm;

    public static void createNewFolder(String name) {
//        Создаем новую папку
        FolderSettingsPage folderSettingsPage = page(FolderSettingsPage.class);
        folderAddButton.click();
        popupNewFolderName.setValue(name);
        popupNewFolderAddButton.click();
    }

    public static void folderHover(String name) {
//        Наводим мышь на нужную строку папки
        SelenideElement folderNeedToHover = $x("//div[text()='" + name + "']");
        folderNeedToHover.hover();
    }

    public static void deleteClick(String name) {
//        Нажимаем на кнопку удаления папки и подтверждаем удаление
        SelenideElement folderDeleteButton = $x("//div[text()='" + name + "']/preceding-sibling::div/following::div[@data-name='remove']");
        folderDeleteButton.click();
        popupDeleteFolderConfirm.click();
    }
}

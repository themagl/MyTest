package ru.vereshchagin.stepsPack;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;
import static ru.vereshchagin.stepsPack.TestData.userLogin;
import static ru.vereshchagin.stepsPack.TestData.userPassword;

public class LoginForm {

    @FindBy(xpath = "//input[@placeholder='Имя ящика']")
    public static SelenideElement loginSpace;

    @FindBy(xpath = "//input[@placeholder='Пароль']")
    public static SelenideElement passwordSpace;

    @FindBy(xpath = "//input[@value='Войти']")
    public static SelenideElement loginButton;

    @FindBy(xpath = "(//input[@id='mailbox:saveauth']")
    public static SelenideElement loginRememberCheckbox;

    public static void login() {
//        Вводим валидные данные в поля "Логин" и "Пароль"
        LoginForm loginForm = page(LoginForm.class);
        loginSpace.setValue(userLogin);
        passwordSpace.setValue(userPassword);
        loginButton.click();
    }

    public static void notValidLogin() {
//        Вводим невалидные данные в поля "Логин" и "Пароль"
        LoginForm loginForm = page(LoginForm.class);
        loginSpace.setValue("1" + userLogin);
        passwordSpace.setValue("1" + userPassword);
        loginButton.click();
    }
}

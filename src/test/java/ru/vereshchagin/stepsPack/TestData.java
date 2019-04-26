package ru.vereshchagin.stepsPack;

import java.util.Date;

public class TestData {

    static String userLogin = "theselenidetest@mail.ru";
    static String userPassword = "Autotest1";
    static String messageSubject = "Это тестовое письмо";
    static String messageText = new Date().toString();
    // Переменная Число Пи для проверки содержания письма
    static String piCheck = Double.toString(Math.PI);
    static String folderName = "NewTestFolder";

}

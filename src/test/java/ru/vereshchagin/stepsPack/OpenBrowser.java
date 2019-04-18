package ru.vereshchagin.stepsPack;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Selenide.open;

public class OpenBrowser {

    public static void openWindow() {
        timeout = 10000;
        baseUrl = "http://mail.ru";
        startMaximized = true;
        browser = "chrome";
//        browserPosition = "890x10";
//        browserSize = "780x950";
//        addListener(new Highlighter());

        open("/");

//        waitUntilPagesIsLoaded();
    }

//    protected static void waitUntilPagesIsLoaded() {
//        $(byText("Loading")).waitUntil(disappears, 20000);
//    }
}

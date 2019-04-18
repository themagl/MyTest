//package ru.vereshchagin.stepsPack;
//
//import cucumber.api.java.ru.Дано;
//import cucumber.api.java.ru.Когда;
//import cucumber.api.java.ru.Тогда;
//import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import static com.codeborne.selenide.Condition.*;
//import static com.codeborne.selenide.Selenide.*;
//
//public class StepImplementation {
//
////    static Webdriver driver;
//
////    public static Webdriver getDriver(){
////        if (driver == null){
////            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
////            ChromeOptions options = new ChromeOptions();
////            options.addArguments("-incognito");
////            options.addArguments("start-maximized");
////            options.addArguments("dom.webnotifications.enabled");
////            driver = new ChromeDriver(options);
////            driver.manage().deleteAllCookies();
////        }
////        return driver;
////    }
//
//
//
//
//
//    @Дано("^открыт браузер и осуществлен переход по ссылке$")
//    public void openBrowser() throws Throwable {
//        open("http://mail.ru");
//    }
//
//    @Тогда("^открывается главная страница \"([^\"]*)\"$")
//    public void checkLogo(String arg1) throws Throwable {
//        Webelement el = driver.findElement(By.xpath("//title[text()=\"Mail.ru: почта, поиск в интернете, новости, игры\"]"));
//        (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(el));
//        el.isDisplayed();
//
//    }
//
//    @Тогда("^на странице содержатся поля для ввода логина и пароля$")
//    public void checkLogPassBox() throws Throwable {
//        Webelement el = driver.findElement(By.xpath("//input[@placeholder=\"Имя ящика\"]"));
//        (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(el));
//        Webelement el2 = driver.findElement(By.xpath("//input[@placeholder=\"Пароль\"]"));
//        (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(el2));
//        el.isDisplayed();
//        el2.isDisplayed();
//
//
//    }
//
//    @Когда("^пользователь вводит валидные логин и пароль в соответствующие поля$")
//    public void ValideLogin() throws Throwable {
////        $(By.name("login")).sendKeys("theselenidetest@mail.ru");
////        $(By.name("password")).sendKeys("Autotest1");
//        setValue(By.name("login"), "theselenidetest@mail.ru");
//        setValue(By.name("password"), "Autotest1");
//        $("##mailbox\\3a submit > input").click();
//
//    }
//
//    @Тогда("^в браузере открывается страница почтового ящика$")
//    public void checkMailEnter() throws Throwable {
////        Webelement el = driver.findElement(By.xpath("//title[contains(text(),\"Входящие - Почта Mail.Ru\")]"));
////        (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(el));
////        el.isDisplayed();
//        $("#head > title").shouldHave(text("Hello, Johny!"));
//    }
//
//    @Тогда("^меню в левой части содержит папку \"([^\"]*)\" и \"([^\"]*)\" и \"([^\"]*)\" и \"([^\"]*)\" и \"([^\"]*)\"$")
//    public void checkMailMenu(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//    }
//}

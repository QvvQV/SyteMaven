package ru.tutor.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.tutor.page.WikiLoginPage;
import ru.tutor.page.WikiMainPage;
import org.junit.Test;
import org.junit.Assert;

import java.time.Duration;

public class WikiLoginTest {
    public static WebDriver driver;
    public static WikiLoginPage wikiLoginPage;
    public static WikiMainPage wikiMainPage;
    public static String url = "https://ru.wikipedia.org/w/index.php?title=Служебная:Вход&returnto=Заглавная+страница";
    public static String name = "your_name";
    public static String password = "your_password";

    @BeforeClass
    public static void openWikiLoginPage() {
//        System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(url);

        wikiLoginPage = new WikiLoginPage(driver);
        wikiMainPage = new WikiMainPage(driver);
    }

    @AfterClass
    public static void quitDriver() {
        driver.quit();
    }
@Test
public void wikiLoginTest() {
    wikiLoginPage.inputName(name);
    wikiLoginPage.inputPassword(password);
    wikiLoginPage.clickLoginButton();

    Assert.assertEquals(wikiMainPage.getUserName(), name);
}

}

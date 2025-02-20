package ru.tutor.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.tutor.page.*;

import java.time.Duration;

//import static org.graalvm.compiler.nodeinfo.InputType.Condition;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.open;

public class DeleteProd {

    public static WebDriver driver;
    public static String url = "https://client.dev.tutorplace.ru/login";

    @Before
    public void setupAll() {
        driver = new ChromeDriver();
        ClientPrime Client = new ClientPrime(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(url);
    }


    @After
    public void quitDriver() {
        driver.close();
    }

    @Test
    @DisplayName("Should delete prod Prime")
    public void ShouldDeleteProdPrime(){
        ClientPrime.getEmail();
        ClientPrime.getPassword();
        ClientPrime.btnEnter();
        ClientPrime.setLoad();
        ClientPrime.contBtn();
        ClientPrime.setNextBtn();
        ClientPrime.setClose();
//        ClientPrime.setAsk();
        ClientPrime.setSearchBtn();
        ClientPrime.getNameSearchEx();
        ClientPrime.setExcel_table();
        ClientPrime.getExel();
        ClientPrime.setOstat();
        ClientPrime.getNameSearchNot();
        ClientPrime.setNotionBtn();
        ClientPrime.setPlusNotion();
        ClientPrime.setOstat();
        ClientPrime.setMenuNotion();
        ClientPrime.setDelete();
        Assert.assertEquals("Notion", ClientPrime.getMenuSearch());
    }

    @Test
    @DisplayName("Should delete prod Lite")
    public void ShouldDeleteProdLite(){
        ClientPrime.getEmail();
        ClientPrime.getPassword();
        ClientPrime.btnEnter();
        ClientPrime.setLoad();
        driver.get("https://client.dev.tutorplace.ru/user/settings/subscription");
        ClientPrime.getChangeLite();
//        ClientPrime.getChangeLite();
//        driver.get("https://client.dev.tutorplace.ru/user/settings/profile");
    }
}

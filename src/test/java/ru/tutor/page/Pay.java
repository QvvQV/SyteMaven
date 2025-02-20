package ru.tutor.page;

import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.closeWebDriver;

public class Pay extends Driver {

    public Pay(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"order\"]/div/div/div[1]/h2/text")
    private static WebElement figure;

    @FindBy(xpath = "//*[@id=\"order\"]/div/div/div[1]/h2/b")
    private static WebElement akchia;

    @FindBy(xpath = "//*[@id=\"order\"]/div/div/div[2]/div[1]/div[1]/b")
    private static WebElement dostup;

    @FindBy(xpath = "//*[@id=\"order\"]/div/div/div[2]/div[1]/div[1]/h4")
    private static WebElement oneRubl;

    @FindBy(xpath = "//*[@id=\"bottom\"]/p/text")
    private static WebElement uslovie;

    @FindBy(id = "email")
    private static WebElement putEmail;

    @FindBy(id = "mainFormaSubmitBtn")
    private static WebElement mainBtn;

    @FindBy(xpath = "//*[@id=\"bottom\"]/div[3]/p[2]/text")
    private static WebElement twiceUsl;

    @FindBy(xpath = "//*[@id=\"bottom\"]/div[3]/p[2]/span/text[1]")
    private static WebElement
}

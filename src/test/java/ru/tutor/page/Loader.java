package ru.tutor.page;

import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.closeWebDriver;

public class Loader extends Driver {

    public Loader(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

//    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[12]/div/div/div[2]/div[1]/div[2]/h2")
//    private static WebElement Header10;
//
//    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[12]/div/div/div[2]/div[1]/button")
//    private static WebElement disableBtn;
//
//    @FindBy(tagName = "button")
//    private static WebElement Btn;
//
//    @FindBy(tagName = "input")
//    private static WebElement Color;
//
//    @FindBy(id = "q10__2")
//    private static WebElement Q10_2;
//
//    @FindBy(xpath = "//*[@id=\"q10__2\"]")
//    private static WebElement GrQ10_2;

    @FindBy(id = "load-percentage")
    private static WebElement load;

//    public static void setLoad(WebElement load) {
//        Loader.load = load;
//        if (load < 100) {

        }
//    }
//}

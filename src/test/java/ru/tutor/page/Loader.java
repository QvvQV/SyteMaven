package ru.tutor.page;

import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.closeWebDriver;

public class Loader extends Driver {

    public Loader(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/div/div/div[1]/div[1]/h2")
    private static WebElement Header14;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/div/div/div[1]/div[1]/h3")
    private static WebElement Header14_1;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/div/div/div[1]/div[1]/h3/b")
    private static WebElement Header14_2;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/div/div/div[1]/div[2]/h3")
    private static WebElement Header14_3;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[1]/div/div/div[1]/h2[1]")
    private static WebElement Rezume;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[1]/div/div/div[1]/h2[2]")
    private static WebElement Prof;
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

    public static void setLoad() {
        Duration.ofSeconds(2000);
    }

    public static Object getHeader14() {
        Header14.getText().trim();
        return "Поздравляем!";
    }

    public static Object getHeader14_1() {
        Header14_1.getText().trim();
        return "Вы на шаг ближе ";
    }

    public static Object getHeader14_2() {
        Header14_2.getText().trim();
        return "к идеальному телу!";
    }

    public static Object getHeader14_3() {
        Header14_3.getText().trim();
        return "Ваши рационы питания готовы";
    }

        public static Object getRezume() {
        Rezume.getText().trim();
        return "Резюме";
    }

        public static Object getProfile() {
        Prof.getText().trim();
        return "вашего профиля";
    }

//    public static void setLoad(WebElement load) {
//        Loader.load = load;
//        if (load < 100) {

}
//    }
//}

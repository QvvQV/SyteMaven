package ru.tutor.page;

import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Objects;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.closeWebDriver;

public class Page8 extends Driver {

    public Page8(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[9]/div/div/div/h2")
    private static WebElement Header7_1;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[9]/div/div/div/p")
    private static WebElement Header7_2;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[9]/div/div/div/button")
    private static WebElement Continue8;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[10]/div/div/div[2]/div[1]/div[2]/h2")
    private static WebElement Header8;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[10]/div/div/div[2]/div[1]/div[2]/div[1]/label")
    private static WebElement Q8_1;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[10]/div/div/div[2]/div[1]/div[2]/div[2]/label")
    private static WebElement Q8_2;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[10]/div/div/div[2]/div[1]/div[2]/div[3]/label")
    private static WebElement Q8_3;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[10]/div/div/div[2]/div[1]/div[2]/div[4]/label")
    private static WebElement Q8_4;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[10]/div/div/div[2]/div[1]/div[3]/button")
    private static WebElement Back7;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[10]/div/div/div[2]/div[1]/div[3]/div/div")
    private static WebElement Count;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[10]/div/div/div[2]/div[1]/div[3]/button[2]")
    private static WebElement Continue7;

    public static Object getHeader7_1() {
        Header7_1.getText().trim();
        return "Решение этих проблем лежит в правильной организации питания и выборе рациона";
    }

    public static Object getHeader7_2() {
        Header7_2.getText().trim();
        return "Мы покажем, как это сделать";
    }

    public static Object getContinue8() {
        Continue8.getText().trim();
        return "Продолжить";
    }

    public static void clickContinue8() {
        Continue8.click();
    }

    public static Object getHeader8() {
        Header8.getText().trim();
        return "Чего вы хотите достичь?";
    }

    public static Object getQ8_1() {
        Q8_1.getText().trim();
        return "Сбросить лишний вес";
    }

    public static Object getQ8_2() {
        Q8_2.getText().trim();
        return "Улучшить здоровье и самочувствие";
    }

    public static Object getQ8_3() {
        Q8_3.getText().trim();
        return "Набрать мышечную массу";
    }

    public static Object getQ8_4() {
        Q8_4.getText().trim();
        return "Научиться правильно питаться для себя и семьи";
    }

    public static Object getCount() {
        Count.getText().trim();
        return "8/10";
    }

    public static void clickBack7() {
        Back7.click();
    }

    public static void clickQ8_1() {
        Q8_1.click();
    }

    public static void clickQ8_2() {
        Q8_2.click();
    }

    public static void clickQ8_3() {
        Q8_3.click();
    }

    public static void clickQ8_4() {
        Q8_4.click();
    }

    public static void clickContinue7() {
        Continue7.click();
    }

}

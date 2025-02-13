package ru.tutor.page;

import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.closeWebDriver;

public class Page6 extends Driver {

    public Page6(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[7]/div/div/div[2]/div[1]/div[2]/h2")
    private static WebElement Header6;
    
    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[7]/div/div/div[2]/div[1]/div[3]/button")
    private static WebElement Back5;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[7]/div/div/div[2]/div[1]/div[2]/div[1]/label")
    private static WebElement Q6_1;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[7]/div/div/div[2]/div[1]/div[2]/div[2]/label")
    private static WebElement Q6_2;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[7]/div/div/div[2]/div[1]/div[2]/div[3]/label")
    private static WebElement Q6_3;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[7]/div/div/div[2]/div[1]/div[2]/div[4]/label")
    private static WebElement Q6_4;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[7]/div/div/div[2]/div[1]/div[3]/div/div")
    private static WebElement Count;

    public static Object getHeader6() {
        Header6.getText().trim();
        return "Пробовали ли вы диеты? Если да, то с каким опытом столкнулись?";
    }

    public static Object getQ6_1() {
        Q6_1.getText().trim();
        return "Я никогда не сидел на диетах";
    }

    public static Object getQ6_2() {
        Q6_2.getText().trim();
        return "Я пробовал диеты, но они не дали результата";
    }

    public static Object getQ6_3() {
        Q6_3.getText().trim();
        return "Диеты помогали, но результат быстро возвращался";
    }

        public static Object getQ6_4() {
        Q6_4.getText().trim();
        return "Я до сих пор пытаюсь соблюдать диету";
    }

    public static Object getCount() {
        Count.getText().trim();
        return "6/10";
    }

    public static void clickBack5() {
        Back5.click();
    }

        public static void clickQ6_1() {
        Q6_1.click();
    }

        public static void clickQ6_2() {
        Q6_2.click();
    }

        public static void clickQ6_3() {
        Q6_3.click();
    }

    public static void clickQ6_4() {
        Q6_4.click();
    }

}

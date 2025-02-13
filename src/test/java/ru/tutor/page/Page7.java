package ru.tutor.page;

import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.closeWebDriver;

public class Page7 extends Driver {

    public Page7(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[8]/div/div/div[2]/div[1]/div[2]/h2")
    private static WebElement Header7;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[8]/div/div/div[2]/div[1]/div[3]/button")
    private static WebElement Back6;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[8]/div/div/div[2]/div[1]/div[2]/div[1]/label")
    private static WebElement Q7_1;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[8]/div/div/div[2]/div[1]/div[2]/div[2]/label")
    private static WebElement Q7_2;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[8]/div/div/div[2]/div[1]/div[2]/div[3]/label")
    private static WebElement Q7_3;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[8]/div/div/div[2]/div[1]/div[2]/div[4]/label")
    private static WebElement Q7_4;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[8]/div/div/div[2]/div[1]/div[3]/div/div")
    private static WebElement Count;

    public static Object getHeader7() {
        Header7.getText().trim();
        return "С чем вы сталкиваетесь чаще всего?";
    }

    public static Object getQ7_1() {
        Q7_1.getText().trim();
        return "Переедаю и не могу остановиться";
    }

    public static Object getQ7_2() {
        Q7_2.getText().trim();
        return "Постоянно хочу сладкое или фастфуд";
    }

    public static Object getQ7_3() {
        Q7_3.getText().trim();
        return "Не знаю, как правильно сочетать продукты";
    }

        public static Object getQ7_4() {
        Q7_4.getText().trim();
        return "Нет времени готовить";
    }

    public static Object getCount() {
        Count.getText().trim();
        return "7/10";
    }

    public static void clickBack6() {
        Back6.click();
    }

        public static void clickQ7_1() {
        Q7_1.click();
    }

        public static void clickQ7_2() {
        Q7_2.click();
    }

        public static void clickQ7_3() {
        Q7_3.click();
    }

    public static void clickQ7_4() {
        Q7_4.click();
    }

}

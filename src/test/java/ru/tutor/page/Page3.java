package ru.tutor.page;

import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.closeWebDriver;

public class Page3 extends Driver {

    public Page3(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[3]/div/div/div[2]/div[1]/div[2]/h2")
    private static WebElement Header3;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[3]/div/div/div[2]/div[1]/div[3]/button")
    private static WebElement Back2;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[3]/div/div/div[2]/div[1]/div[2]/div[1]/label")
    private static WebElement Q3_1;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[3]/div/div/div[2]/div[1]/div[2]/div[2]/label")
    private static WebElement Q3_2;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[3]/div/div/div[2]/div[1]/div[2]/div[3]/label")
    private static WebElement Q3_3;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[3]/div/div/div[2]/div[1]/div[2]/div[4]/label")
    private static WebElement Q3_4;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[3]/div/div/div[2]/div[1]/div[3]/div/div")
    private static WebElement Count;

    public static Object getHeader3() {
        Header3.getText().trim();
        return "Есть ли у вас привычки, которые мешают правильно питаться?";
    }

    public static Object getQ3_1() {
        Q3_1.getText().trim();
        return "Я ем поздно вечером";
    }

    public static Object getQ3_2() {
        Q3_2.getText().trim();
        return "Я ем «на бегу» и много перекусываю";
    }

    public static Object getQ3_3() {
        Q3_3.getText().trim();
        return "Я ем сладкое";
    }

        public static Object getQ3_4() {
        Q3_4.getText().trim();
        return "У меня нет таких привычек";
    }

    public static Object getCount() {
        Count.getText().trim();
        return "3/10";
    }

    public static void clickBack2() {
        Back2.click();
    }

        public static void clickQ3_1() {
        Q3_1.click();
    }

        public static void clickQ3_2() {
        Q3_2.click();
    }

        public static void clickQ3_3() {
        Q3_3.click();
    }

    public static void clickQ3_4() {
        Q3_4.click();
    }

}

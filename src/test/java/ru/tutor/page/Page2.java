package ru.tutor.page;

import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.closeWebDriver;

public class Page2 extends Driver {

    public Page2(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[2]/div/div/div[2]/div[1]/div[2]/h2")
    private static WebElement Header2;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[2]/div/div/div[2]/div[1]/div[3]/button")
    private static WebElement Back1;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[2]/div/div/div[2]/div[1]/div[2]/div[1]/label")
    private static WebElement Q2_1;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[2]/div/div/div[2]/div[1]/div[2]/div[2]/label")
    private static WebElement Q2_2;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[2]/div/div/div[2]/div[1]/div[2]/div[3]/label")
    private static WebElement Q2_3;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[2]/div/div/div[2]/div[1]/div[3]/div/div")
    private static WebElement Count;

    public static Object getHeader2() {
        Header2.getText().trim();
        return "Какой у вас ритм жизни?";
    }

    public static Object getQ2_1() {
        Q2_1.getText().trim();
        return "Малоподвижный";
    }

    public static Object getQ2_2() {
        Q2_2.getText().trim();
        return "Средняя активность";
    }

    public static Object getQ2_3() {
        Q2_3.getText().trim();
        return "Высокая активность";
    }

    public static Object getCount() {
        Count.getText().trim();
        return "2/10";
    }

    public static void clickBack1() {
        Back1.click();
    }

        public static void clickQ2_1() {
        Q2_1.click();
    }

        public static void clickQ2_2() {
        Q2_2.click();
    }

        public static void clickQ2_3() {
        Q2_3.click();
    }

}

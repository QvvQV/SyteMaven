package ru.tutor.page;

import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.closeWebDriver;

public class Page9 extends Driver {

    public Page9(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[11]/div/div/div[2]/div[1]/div[2]/h2")
    private static WebElement Header9;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[11]/div/div/div[2]/div[1]/div[3]/button")
    private static WebElement Back8;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[11]/div/div/div[2]/div[1]/div[2]/div[1]/label")
    private static WebElement Q9_1;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[11]/div/div/div[2]/div[1]/div[2]/div[2]/label")
    private static WebElement Q9_2;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[11]/div/div/div[2]/div[1]/div[2]/div[3]/label")
    private static WebElement Q9_3;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[11]/div/div/div[2]/div[1]/div[3]/div/div")
    private static WebElement Count;

    public static Object getHeader9() {
        Header9.getText().trim();
        return "Как вы оцениваете свои знания о правильном питании?";
    }

    public static Object getQ9_1() {
        Q9_1.getText().trim();
        return "Ничего не знаю";
    }

    public static Object getQ9_2() {
        Q9_2.getText().trim();
        return "Знаю основы, но часто ошибаюсь";
    }

    public static Object getQ9_3() {
        Q9_3.getText().trim();
        return "Разбираюсь, но не всегда удается применять на практике";
    }

    public static Object getCount() {
        Count.getText().trim();
        return "9/10";
    }

    public static void clickBack8() {
        Back8.click();
    }

        public static void clickQ9_1() {
        Q9_1.click();
    }

        public static void clickQ9_2() {
        Q9_2.click();
    }

        public static void clickQ9_3() {
        Q9_3.click();
    }

}

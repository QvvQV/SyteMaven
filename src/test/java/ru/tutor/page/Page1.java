package ru.tutor.page;

import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.closeWebDriver;

public class Page1 extends Driver {
//    public WebDriver driver;

    public Page1(WebDriver driver) {
        PageFactory.initElements(driver, this);
//        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[1]/div/div/div[1]/div[1]/h1")
    private static WebElement Header1;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[1]/div/div/div[1]/div[1]/h2/b")
    private static WebElement Minus;

    @FindBy(xpath = "/html/body/div/main/div/section[1]/div/div/div[1]/div[1]/h2/br")
    private static WebElement month;

    @FindBy(xpath = "/html/body/div/main/div/section[1]/div/div/div[1]/div[1]/h3/br")
    private static WebElement person;

    @FindBy(xpath = "/html/body/div/main/div/section[1]/div/div/div[1]/div[1]/h3")
    private static WebElement razion;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[1]/div/div/div[1]/div[2]/div[2]/div[2]/label")
    private static WebElement male;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[1]/div/div/div[1]/div[2]/div[2]/div[1]/label")
    private static WebElement female;

    public static Object getHeader1() {
        Header1.getText().trim();
        return "Секрет стройности:";
    }

    public static Object getMinus() {
        Minus.getText().trim();
        return "минус 2 размера";
    }

    public static Object getMonth() {
        month.getText().trim();
        return "за месяц";
    }

    public static Object getPerson() {
        person.getText().trim();
        return "Пройдите тест и получите персональные";
    }

    public static Object getRazion() {
        razion.getText().trim();
        return "рационы питания для похудения";
    }

    public static Object getFemale() {
        female.getText().trim();
        return "Женский";
    }

    public static Object clickFemale() {
        female.click();
        return female;
    }

    public static Object getMale() {
        male.getText().trim();
        return "Мужской";
    }

    public static Object clickMale() {
        male.click();
        return male;
    }

}

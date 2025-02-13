package ru.tutor.page;

import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Objects;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.closeWebDriver;

public class Page5 extends Driver {

    public Page5(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[5]/div/div/div/h2")
    private static WebElement Header5;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[5]/div/div/div/p")
    private static WebElement Header5_1;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[5]/div/div/div/button")
    private static WebElement Continue6;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[6]/div/div/div[2]/div[1]/div[3]/button[2]")
    private static WebElement disableBtn;

    @FindBy(tagName = "button")
    private static WebElement Btn;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[6]/div/div/div[2]/div[1]/div[2]/h2")
    private static WebElement Header6;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[6]/div/div/div[2]/div[1]/div[2]/p")
    private static WebElement Header6_1;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[6]/div/div/div[2]/div[1]/div[2]/div[1]/label")
    private static WebElement Q6_1;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[6]/div/div/div[2]/div[1]/div[2]/div[2]/label")
    private static WebElement Q6_2;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[6]/div/div/div[2]/div[1]/div[2]/div[3]/label")
    private static WebElement Q6_3;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[6]/div/div/div[2]/div[1]/div[2]/div[4]/label")
    private static WebElement Q6_4;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[6]/div/div/div[2]/div[1]/div[3]/button")
    private static WebElement Back4;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[6]/div/div/div[2]/div[1]/div[3]/div/div")
    private static WebElement Count;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[6]/div/div/div[2]/div[1]/div[3]/button[2]")
    private static WebElement Continue7;

    public static Object getHeader5() {
        Header5.getText().trim();
        return "Рационы питания влияют";
    }

    public static Object getHeader5_1() {
        Header5_1.getText().trim();
        return "на ваш уровень энергии, здоровье и скорость достижения целей";
    }

    public static Object getContinue6() {
        Continue6.getText().trim();
        return "Продолжить";
    }

    public static void clickContinue6() {
        Continue6.click();
    }

    public static Object getHeader6() {
        Header6.getText().trim();
        return "Что для вас важнее всего в питании?";
    }

    public static Object getHeader6_1() {
        Header6_1.getText().trim();
        return "Вы можете выбрать несколько вариантов";
    }

    public static Object getQ6_1() {
        Q6_1.getText().trim();
        return "Простота и быстрота приготовления";
    }

    public static Object getQ6_2() {
        Q6_2.getText().trim();
        return "Вкусные блюда, которые приносят удовольствие";
    }

    public static Object getQ6_3() {
        Q6_3.getText().trim();
        return "Экономия на продуктах";
    }

    public static Object getQ6_4() {
        Q6_4.getText().trim();
        return "Максимальная польза для здоровья";
    }

    public static Object getCount() {
        Count.getText().trim();
        return "5/10";
    }

    public static void clickBack4() {
        Back4.click();
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

    public static void clickContinue7() {
        Continue7.click();
    }

    public static WebElement chechBtn() {
        Btn.getAttribute("disabled");
        return Btn;
    }

    public static boolean chechDisBtn(){
        if(Objects.equals(chechBtn(), "disabled")){
            return false;
        } else return disableBtn.isEnabled();
    }
}

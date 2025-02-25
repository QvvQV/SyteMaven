package ru.tutor.page;

import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v131.indexeddb.model.Key;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.closeWebDriver;

public class Body extends Driver {

    public Body(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[1]/div/div/div[2]/div[5]/div[1]/div/h3")
    private static WebElement NormKal;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[1]/div/div/div[2]/div[5]/div[5]/p")
    private static WebElement kkal;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[1]/div/div/div[2]/div[6]/div[1]/div/h3")
    private static WebElement Zone;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[1]/div/div/div[2]/div[6]/div[3]/div[1]/p")
    private static WebElement face;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[1]/div/div/div[2]/div[6]/div[3]/div[3]/p")
    private static WebElement stomach;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[1]/div/div/div[2]/div[6]/div[3]/div[4]/p")
    private static WebElement leg;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[1]/div/div/div[2]/div[6]/div[3]/div[2]/p")
    private static WebElement arms;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[1]/div/div/div[2]/div[5]/div[6]/h2")
    private static WebElement numberKkal;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[1]/div/div/div[2]/div[5]/div[6]/div[2]/div[1]/p[1]")
    private static WebElement zeroKkal;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[1]/div/div/div[2]/div[5]/div[6]/div[2]/div[1]/p[2]")
    private static WebElement nameZero;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[1]/div/div/div[2]/div[5]/div[6]/div[2]/div[2]/p[1]")
    private static WebElement fiveThousendKkal;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[1]/div/div/div[2]/div[5]/div[6]/div[2]/div[2]/p[2]")
    private static WebElement nameFive;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[2]/div/div/div[2]/div[1]/div[2]/div[1]")
    private static WebElement firstLesson;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[2]/div/div/div[2]/div[1]/div[2]/div[2]")
    private static WebElement vvedRaz;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[2]/div/div/div[2]/div[2]/div[2]/div[1]")
    private static WebElement secondLesson;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[2]/div/div/div[2]/div[2]/div[2]/div[2]")
    private static WebElement balanse;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[2]/div/div/div[1]/h2[1]/b")
    private static WebElement Programm;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[2]/div/div/div[1]/h2[1]")
    private static WebElement kurs;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[2]/div/div/div[1]/h2[2]")
    private static WebElement yourRoad;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[2]/div/div/div[1]/h2[2]")
    private static WebElement zdorFood;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[2]/div/div/div[2]/a")
    private static WebElement btnPoluchit;


    public static String getNormKal() {
        NormKal.getText().trim();
        return "Норма калорий";
    }

    public static String getBalanse() {
        balanse.getText().trim();
        return "1772 ккал";
    }

    public static String getSecondLesson() {
        secondLesson.getText().trim();
        return "Урок 2";
    }

    public static String getVvedRaz() {
        vvedRaz.getText().trim();
        return "Введение в рацион питания";
    }

    public static String getFirstLesson() {
        firstLesson.getText().trim();
        return "Урок 1";
    }

    public static String getNameFive() {
        nameFive.getText().trim();
        return "Калорий";
    }

    public static String getFiveThousendKkal() {
        fiveThousendKkal.getText().trim();
        return "5000";
    }

    public static String getNameZero() {
        nameZero.getText().trim();
        return "Калорий";
    }

    public static String getZeroKkal() {
        zeroKkal.getText().trim();
        return "0";
    }

    public static String getNumberKkal() {
        numberKkal.getText().trim();
        return "1772 ккал";
    }

    public static String getArms() {
        arms.getText().trim();
        return "Руки";
    }

    public static String getLeg() {
        leg.getText().trim();
        return "Ноги";
    }

    public static String getStomach() {
        stomach.getText().trim();
        return "Живот";
    }

    public static String getFace() {
        face.getText().trim();
        return "Лицо";
    }

    public static String getZone() {
        Zone.getText().trim();
        return "Зоны похудения";
    }

    public static String getKkal() {
        kkal.getText().trim();
        return "Норма калорий";
    }

    public static String getKurs() {
        kurs.getText().trim();
        return "курса";
    }

    public static String getYourRoad() {
        yourRoad.getText().trim();
        return "С чего начинается ваш путь";
    }

    public static String getZdorFood() {
        zdorFood.getText().trim();
        return "к здоровым отношениям с едой?";
    }

    public static String getTextBtnPoluchit() {
        btnPoluchit.getText().trim();
        return "Получить доступ";
    }

    public static void PageDownBtn(){
        btnPoluchit.sendKeys(Keys.PAGE_DOWN);
    }

    public static void EndBtn(){
        btnPoluchit.sendKeys(Keys.END);
    }

    public static void clickBtnPoluchit() {
        btnPoluchit.click();
    }
}
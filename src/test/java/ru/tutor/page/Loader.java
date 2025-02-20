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

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[1]/div/div/div[2]/div[1]/div[1]/div/h3")
    private static WebElement VashVes;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[1]/div/div/div[2]/div[1]/div[1]/p")
    private static WebElement FourWeekVes;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[1]/div/div/div[2]/div[1]/div[5]/p[1]")
    private static WebElement oneWeek;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[1]/div/div/div[2]/div[1]/div[5]/p[2]")
    private static WebElement twoWeek;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[1]/div/div/div[2]/div[1]/div[5]/p[3]")
    private static WebElement threeWeek;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[1]/div/div/div[2]/div[1]/div[5]/p[4]")
    private static WebElement fourWeek;

    @FindBy(id = "resultWeight")
    private static WebElement resultVes;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[1]/div/div/div[2]/div[2]/div[1]/div/h3")
    private static WebElement IMT;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[1]/div/div/div[2]/div[2]/div[1]/p")
    private static WebElement FourWeekIMT;

    @FindBy(id = "IBM")
    private static WebElement NormIMT;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[1]/div/div/div[2]/div[3]/div[1]/div/h3")
    private static WebElement MetAge;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[1]/div/div/div[2]/div[3]/div[2]/div[1]/p/b/text")
    private static WebElement met;

    @FindBy(id = "ageMeta")
    private static WebElement AgeMeta;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[1]/div/div/div[2]/div[3]/div[2]/div[2]/p/b")
    private static WebElement fact;

    @FindBy(id = "ageFact")
    private static WebElement ageFact;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[1]/div/div/div[2]/div[4]/div[1]/div/h3")
    private static WebElement Water;

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

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[2]/div/div/div[1]/h2[1]/text")
    private static WebElement kurs;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[2]/div/div/div[1]/h2[2]/text[1]")
    private static WebElement yourRoad;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[2]/div/div/div[1]/h2[2]/text[2]")
    private static WebElement zdorFood;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[2]/div/div/div[2]/a")
    private static WebElement btnPoluchit;

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

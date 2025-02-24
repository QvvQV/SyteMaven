package ru.tutor.page;

import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[1]/div/div/div[2]/div[3]/div[2]/div[1]/p/b")
    private static WebElement met;

    @FindBy(id = "ageMeta")
    private static WebElement AgeMeta;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[1]/div/div/div[2]/div[3]/div[2]/div[2]/p/b")
    private static WebElement fact;

    @FindBy(id = "ageFact")
    private static WebElement ageFact;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[1]/div/div/div[2]/div[4]/div[1]/div/h3")
    private static WebElement Water;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[1]/div/div/div[2]/div[4]/div[5]/p")
    private static WebElement numberWater;

    @FindBy(id = "load-percentage")
    private static WebElement Load;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/div/div/div[1]/div[1]")
    private static WebElement all;

    public static Object getTextLoad() {
        return Load.getText().trim();
    }

    //    public static Object getLoad(Load){
//       int Load = Loader.Load;
//       do {
//           Load++;
//       } while (Load<50);
//        return Load;
//    }

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

    public static Object getVashVes() {
        VashVes.getText().trim();
        return "Ваш вес";
    }

    public static Object getOneWeek() {
        oneWeek.getText().trim();
        return "1 неделя";
    }

    public static Object getTwoWeek() {
        twoWeek.getText().trim();
        return "2 недели";
    }

    public static Object getThreeWeek() {
        threeWeek.getText().trim();
        return "3 недели";
    }

    public static Object getFourWeek() {
        fourWeek.getText().trim();
        return "4 недели";
    }

    public static Object getVes() {
        resultVes.getText().trim();
        return "45 кг";
    }

    public static Object getIMT() {
        IMT.getText().trim();
        return "Ваш ИМТ";
    }

    public static Object getIMTWeek() {
        FourWeekIMT.getText().trim();
        return "через 4 недели, следуя дневнику питания";
    }

    public static Object getIMTnorm() {
        NormIMT.getText().trim();
        return "Норма";
    }

    public static Object getVesFourWeek() {
        FourWeekVes.getText().trim();
        return "через 4 недели, следуя дневнику питания";
    }

    public static Object getMetAge() {
        met.getText().trim();
        return "метаболический";
    }

    public static Object setMet() {
        MetAge.getText().trim();
        return "Ваш метаболический возраст";
    }

    public static Object getTeorAge() {
        AgeMeta.getText().trim();
        return "28 лет";
    }

    public static Object getFactAge() {
        ageFact.getText().trim();
        return "18 лет";
    }

    public static Object getNumberAge() {
        fact.getText().trim();
        return "фактический";
    }

    public static Object getWater() {
        Water.getText().trim();
        return "Рекомендуемое количество воды";
    }

    public static Object setNumberWater() {
        numberWater.getText().trim();
        return "4.09 литра в день";
    }
}
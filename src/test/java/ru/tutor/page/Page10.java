package ru.tutor.page;

import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Objects;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.closeWebDriver;

public class Page10 extends Driver {

    public Page10(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[12]/div/div/div[2]/div[1]/div[2]/h2")
    private static WebElement Header10;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[12]/div/div/div[2]/div[1]/button")
    private static WebElement disableBtn;

    @FindBy(tagName = "button")
    private static WebElement Btn;

    @FindBy(id = "q10__2")
    private static WebElement Q10_2;

    @FindBy(id = "q10__1")
    private static WebElement Q10_1;

    @FindBy(id = "q10__3")
    private static WebElement Q10_3;

    @FindBy(id = "q10__4")
    private static WebElement Q10_4;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[12]/div/div/div[2]/div[1]/div[3]/button")
    private static WebElement Back9;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[12]/div/div/div[2]/div[1]/div[3]/div/div")
    private static WebElement Count;

    public static Object getHeader10() {
        Header10.getText().trim();
        return "Укажите ваши параметры";
    }

//    public static Object getHeader10_1() {
//        Header10_1.getText().trim();
//        return "на ваш уровень энергии, здоровье и скорость достижения целей";
//    }

    public static Object getContinue11() {
        disableBtn.getText().trim();
        return "Продолжить";
    }

//    public static void clickContinue6() {
//        Continue6.click();
//    }

    public static Object getQ10_2() {
        Q10_2.getText().trim();
        return "Возраст";
    }

    public static Object getQ10_1() {
        Q10_1.getText().trim();
        return "Рост";
    }

    public static Object getQ10_3() {
        Q10_3.getText().trim();
        return "Вес";
    }

    public static Object getQ10_4() {
        Q10_4.getText().trim();
        return "Желаемый вес";
    }

    public static Object getCount() {
        Count.getText().trim();
        return "10/10";
    }

    public static void clickBack9() {
        Back9.click();
    }

//    public static void clickQ6_1() {
//        Q6_1.click();
//    }
//
//    public static void clickQ6_2() {
//        Q6_2.click();
//    }
//
//    public static void clickQ6_3() {
//        Q6_3.click();
//    }
//
//    public static void clickQ6_4() {
//        Q6_4.click();
//    }

    public static void clickContinue11() {
        disableBtn.click();
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

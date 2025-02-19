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

    @FindBy(tagName = "input")
    private static WebElement Color;

    @FindBy(id = "q10__2")
    private static WebElement Q10_2;

    @FindBy(xpath = "//*[@id=\"q10__2\"]")
    private static WebElement GrQ10_2;

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

    public static void send17KeysQ10_2() {
        Q10_2.sendKeys("17");
    }

    public static void send100KeysQ10_2() {
        Q10_2.sendKeys("100");
    }

    public static void send18KeysQ10_2() {
        Q10_2.sendKeys("18");
    }

    public static void send99KeysQ10_2() {
        Q10_2.sendKeys("99");
    }

    // Color Green: "rgba(0, 128, 0, 1)"
    // Color Red: "rgba(255, 0, 0, 1)"
    public static Object getItemQ10_2() {
        Q10_2.getAttribute("style");
        return Q10_2.getCssValue("color");
    }

    public static void ClearQ10_2() {
        Q10_2.clear();
    }

    public static Object getQ10_1() {
        Q10_1.getText().trim();
        return "Рост";
    }

    public static void send119KeysQ10_1() {
        Q10_1.sendKeys("119");
    }

    public static void send251KeysQ10_1() {
        Q10_1.sendKeys("251");
    }

    public static void send120KeysQ10_1() {
        Q10_1.sendKeys("120");
    }

    public static void send250KeysQ10_1() {
        Q10_1.sendKeys("250");
    }

    public static Object getItemQ10_1() {
        Q10_1.getAttribute("style");
        return Q10_1.getCssValue("color");
    }

    public static void ClearQ10_1() {
        Q10_1.clear();
    }

    public static Object getQ10_3() {
        Q10_3.getText().trim();
        return "Вес";
    }

    public static void send39KeysQ10_3() {
        Q10_3.sendKeys("39");
    }

    public static void send401KeysQ10_3() {
        Q10_3.sendKeys("401");
    }

    public static void send40KeysQ10_3() {
        Q10_3.sendKeys("40");
    }

    public static void send400KeysQ10_3() {
        Q10_3.sendKeys("400");
    }

    public static Object getItemQ10_3() {
        Q10_3.getAttribute("style");
        return Q10_3.getCssValue("color");
    }

    public static void ClearQ10_3() {
        Q10_3.clear();
    }

    public static Object getQ10_4() {
        Q10_4.getText().trim();
        return "Желаемый вес";
    }

    public static void send39KeysQ10_4() {
        Q10_4.sendKeys("39");
    }

    public static void send401KeysQ10_4() {
        Q10_4.sendKeys("401");
    }

    public static void send40KeysQ10_4() {
        Q10_4.sendKeys("40");
    }

    public static void send400KeysQ10_4() {
        Q10_4.sendKeys("400");
    }

    public static Object getItemQ10_4() {
        Q10_4.getAttribute("style");
        return Q10_4.getCssValue("color");
    }

    public static void ClearQ10_4() {
        Q10_4.clear();
    }

    public static Object getCount() {
        Count.getText().trim();
        return "10/10";
    }

    public static void clickBack9() {
        Back9.click();
    }

//    public static String ifSendKeysQ10_2False17() {
//        int i = 17;

    /// /       int i = sendKeysQ10_2();
//        if (18 <= i & i <= 99) {
//            return "green";
//        }
//        return "red";
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

    public static boolean chechDisBtn() {
        if (Objects.equals(chechBtn(), "disabled")) {
            return false;
        } else return disableBtn.isEnabled();
    }

//    public static void time() throws InterruptedException {
//     Q10_2(Condition.visible, Duration.ofSeconds(15));
//    }

}

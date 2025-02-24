package ru.tutor.page;

import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.closeWebDriver;

public class Pay extends Driver {

    public Pay(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"order\"]/div/div/div[1]/h2")
    private static WebElement figure;

    @FindBy(xpath = "//*[@id=\"order\"]/div/div/div[1]/h2/b")
    private static WebElement akchia;

    @FindBy(xpath = "//*[@id=\"order\"]/div/div/div[2]/div[1]/div[1]/b")
    private static WebElement dostup;

    @FindBy(xpath = "//*[@id=\"order\"]/div/div/div[2]/div[1]/div[1]/h4")
    private static WebElement oneRubl;

    @FindBy(xpath = "//*[@id=\"bottom\"]/p/text")
    private static WebElement uslovie;

    @FindBy(id = "email")
    private static WebElement putEmail;

    @FindBy(xpath = "//*[@id=\"bottom\"]/div[2]/p")
    private static WebElement error;

    @FindBy(id = "mainFormaSubmitBtn")
    private static WebElement mainBtn;

    @FindBy(xpath = "//*[@id=\"bottom\"]/div[3]/p[2]/text")
    private static WebElement twiceUsl;

    @FindBy(xpath = "//*[@id=\"bottom\"]/div[3]/p[2]/span/text[1]")
    private static WebElement podtvOznak;

    @FindBy(xpath = "//*[@id=\"bottom\"]/div[3]/p[2]/span/a[1]")
    private static WebElement oferta;

    @FindBy(xpath = "//*[@id=\"bottom\"]/div[3]/p[2]/span/text[2]")
    private static WebElement soglasiy;

    @FindBy(xpath = "//*[@id=\"bottom\"]/div[3]/p[2]/span/a[2]")
    private static WebElement persDan;

    public static Object getFigure() {
        figure.getText().trim();
        return "Фигура мечты почти ваша! Успейте забрать";
    }

    public static Object getAkchia() {
        akchia.getText().trim();
        return "рационы питания по акции!";
    }

    public static Object getDostup() {
        dostup.getText().trim();
        return "Только сейчас: доступ к курсу";
    }

    public static Object getOneRubl() {
        oneRubl.getText().trim();
        return "Всего за 1 ₽*";
    }

    public static Object getUsl() {
        uslovie.getText().trim();
        return "*Первые 7 дней, далее 399₽ или 99₽ раз в 30 дней или в зависимости от условий. Отмена в любой момент.";
    }

    public static void setEmailValid() {
        putEmail.sendKeys("golod35@test.ru");
    }

    public static void setEmailEmpty() {
        putEmail.sendKeys("");
    }

    public static Object getErrorText() {
        error.getText().trim();
        return "Укажите корректный email";
    }

    public static Object getErrorDisplay() {
        error.getAttribute("style");
        return error.getCssValue("display");
    }

    public static Object getBtnText() {
        mainBtn.getText().trim();
        return "Получить доступ";
    }

    public static void clickMainBtn() {
        mainBtn.click();
    }

    public static Object getTwiseUslText() {
        twiceUsl.getText().trim();
        return "Нажимая кнопку  \"Получить доступ\" ";
    }

    public static Object getOznakText() {
        podtvOznak.getText().trim();
        return "вы подтверждаете ознакомление с";
    }

    public static Object getOferta() {
        oferta.getText().trim();
        return "офертой и тарифами";
    }

    public static Object getSoglasye() {
        soglasiy.getText().trim();
        return ", а также даете согласие на  ";
    }

    public static Object getPersDan() {
        persDan.getText().trim();
        return "обработку персональных данных";
    }
}

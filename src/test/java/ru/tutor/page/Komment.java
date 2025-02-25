package ru.tutor.page;

import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.closeWebDriver;

public class Komment extends Driver {

    public Komment(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[3]/div/div/div/h2[1]")
    private static WebElement numberPeople;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[3]/div/div/div/h2[2]")
    private static WebElement hvast;

    @FindBy(xpath = "//*[@id=\"slick-slide11\"]/div[2]/h3")
    private static WebElement mihail;

    @FindBy(xpath = "//*[@id=\"slick-slide11\"]/div[2]/h3/b")
    private static WebElement mihail25;

    @FindBy(xpath = "//*[@id=\"slick-slide11\"]/div[2]")
    private static WebElement komentMihail;

    @FindBy(xpath = "//*[@id=\"slick-slide12\"]/div[2]/h3")
    private static WebElement georg;

    @FindBy(xpath = "//*[@id=\"slick-slide12\"]/div[2]/h3/b")
    private static WebElement georg53;

    @FindBy(xpath = "//*[@id=\"slick-slide12\"]/div[2]")
    private static WebElement kommentGeorg;

    @FindBy(xpath = "//*[@id=\"slick-slide13\"]/div[2]/h3")
    private static WebElement evgeny;

    @FindBy(xpath = "//*[@id=\"slick-slide13\"]/div[2]")
    private static WebElement kommentEvg;

    @FindBy(xpath = "//*[@id=\"slick-slide10\"]/div[2]/h3")
    private static WebElement alexsey;

    @FindBy(xpath = "//*[@id=\"slick-slide10\"]/div[2]")
    private static WebElement kommentAlexsey;

    @FindBy(xpath = "/html/body/div/main/div/section[14]/section/section[3]/div/ul[2]/button[2]")
    private static WebElement bntCont;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[3]/div/ul[2]/button[1]")
    private static WebElement btnBack;

    public static String setNumber() {
        numberPeople.getText().trim();
        return "> 10 000 похудели благодаря рационам питания!";
    }

    public static String setHvast() {
        hvast.getText().trim();
        return "Мы не хвастаемся. За нас это делают наши пользователи!";
    }

    public static String getMichail() {
        mihail.getText().trim();
        return "Михаил,";
    }

        public static String getMichail25() {
        mihail25.getText().trim();
        return "25 лет";
    }

    public static String getKommitMichail() {
        komentMihail.getText().trim();
        return "Курс помог мне осознать важность баланса между белками, жирами и углеводами. " +
                "Автор научила меня готовить полезные блюда, которые не только вкусны, но и полезны для организма. " +
                "Вес начал снижаться, улучшилось настроение и общее состояние здоровья.";
    }

    public static String getGeorg() {
        georg.getText().trim();
        return "Георгий,";
    }

        public static String getGeorg53() {
        georg53.getText().trim();
        return "53 года";
    }

    public static String getKommitGeorg() {
        kommentGeorg.getText().trim();
        return "Отличный курс по рационам питания! " +
                "Помог разобраться в принципах здорового питания и подобрать оптимальный рацион для снижения веса. " +
                "Автор очень грамотная, объясняет всё доступно. " +
                "Результатом доволен, вес уходит постепенно, но уверенно.";
    }

    public static String getAlex() {
        alexsey.getText().trim();
        return "Алексей, 27 лет";
    }

        public static String getKommitAlex() {
        kommentAlexsey.getText().trim();
        return "Курс изменил мою жизнь! До этого питался как попало, не задумываясь о последствиях. " +
                "После курса понял, что правильное питание — это основа здоровья и долголетия. " +
                "Во время обучения я составил рацион, который учитывает мои особенности и потребности. " +
                "Заметил улучшение самочувствия и повышение энергии.";
    }

    public static String getEvgen() {
        evgeny.getText().trim();
        return "Евгений, 34 года";
    }

    public static String getKommitEvgen() {
        kommentEvg.getText().trim();
        return "Курс по рационам питания — это инвестиция в своё здоровье! " +
                "Он помог мне определить причины лишнего веса и разработать стратегию его снижения. " +
                "Рацион сбалансирован, блюда разнообразные и вкусные. " +
                "Результаты радуют, вес уходит медленно, но верно.";
    }

    public static void clickBtnCont() {
        bntCont.click();
    }

    public static void clickBtnBack() {
        btnBack.click();
    }
}

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

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[3]/div/div/div/h2[1]/b")
    private static WebElement numberPeople;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[3]/div/div/div/h2[1]/text[1]")
    private static WebElement hudenie;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[3]/div/div/div/h2[1]/text[2]")
    private static WebElement razPit;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[3]/div/div/div/h2[2]")
    private static WebElement hvast;

    @FindBy(xpath = "//*[@id=\"slick-slide11\"]/div[2]/h3/text")
    private static WebElement mihail;

    @FindBy(xpath = "//*[@id=\"slick-slide11\"]/div[2]/h3/b")
    private static WebElement mihail25;

    @FindBy(xpath = "//*[@id=\"slick-slide11\"]/div[2]/p/text")
    private static WebElement komentMihail;

    @FindBy(xpath = "//*[@id=\"slick-slide12\"]/div[2]/h3/text")
    private static WebElement georg;

    @FindBy(xpath = "//*[@id=\"slick-slide12\"]/div[2]/h3/b")
    private static WebElement georg53;

    @FindBy(xpath = "//*[@id=\"slick-slide12\"]/div[2]/p")
    private static WebElement kommentGeorg;

    @FindBy(xpath = "//*[@id=\"slick-slide13\"]/div[2]/h3/text")
    private static WebElement evgeny;

    @FindBy(xpath = "//*[@id=\"slick-slide13\"]/div[2]/h3/b")
    private static WebElement evgeny34;

    @FindBy(xpath = "//*[@id=\"slick-slide13\"]/div[2]/p")
    private static WebElement kommentEvg;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[3]/div/ul[2]/div/div/li[7]/div[2]/h3/text")
    private static WebElement alexsey;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[3]/div/ul[2]/div/div/li[7]/div[2]/h3/b")
    private static WebElement alexsey27;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[3]/div/ul[2]/div/div/li[7]/div[2]/p")
    private static WebElement kommentAlexsey;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[3]/div/ul[2]/button[2]")
    private static WebElement bntCont;

    @FindBy(xpath = "//*[@id=\"app\"]/main/div/section[14]/section/section[3]/div/ul[2]/button[1]")
    private static WebElement btnBack;
}

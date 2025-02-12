package ru.tutor.page;

import com.github.dockerjava.api.model.Driver;

//public class Page1 {
//   public static final String HeaderP1 = "//*[@id=\"app\"]/main/div/section[1]/div/div/div[1]/div[1]/h1";
//   var actualTextP1St1 = HeaderP1.getText().trim();
//}
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

    @FindBy (xpath = "//*[@id=\"app\"]/main/div/section[1]/div/div/div[1]/div[1]/h1")
   private static WebElement Header1;

    @FindBy (xpath = "//*[@id=\"app\"]/main/div/section[1]/div/div/div[1]/div[1]/h2/b")
    private static WebElement Minus;

    public static Object getHeader1(){
        Header1.getText().trim();
        return "Секрет стройности:";
    }

        public static Object getMinus(){
        Minus.getText().trim();
        return "минус 2 размера";
    }

}

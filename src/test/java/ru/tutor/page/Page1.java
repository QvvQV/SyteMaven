package ru.tutor.page;

import com.github.dockerjava.api.model.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;

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
   private WebElement Header1;

    public void getHeader1(){
        Header1.getText().trim();
    }
}

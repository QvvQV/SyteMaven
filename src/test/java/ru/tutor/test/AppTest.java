package ru.tutor.test;

import org.junit.*;
import ru.tutor.page.Page1;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

//import static org.graalvm.compiler.nodeinfo.InputType.Condition;
//import static com.codeborne.selenide.Selenide.*;
//import static com.codeborne.selenide.Selenide.open;

public class AppTest {

    public static WebDriver driver;
    public static String url = "https://dietsw.tutorplace.ru/";

    @Before
    public void setupAll() {
//        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        Page1 Page1 = new Page1(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(url);
    }


    @After
    public void quitDriver() {
        driver.close();
    }

    @Test
    @DisplayName("Should get text first page")
    public void ShouldGetTextFirstPage() {

        Assert.assertEquals("Секрет стройности:", Page1.getHeader1());
        Assert.assertEquals("минус 2 размера",Page1.getMinus());
        Assert.assertEquals("за месяц",Page1.getMonth());
        Assert.assertEquals("Пройдите тест и получите персональные",Page1.getPerson());
        Assert.assertEquals("рационы питания для похудения",Page1.getRazion());
        Assert.assertEquals("Женский",Page1.getFemale());
        Assert.assertEquals("Мужской",Page1.getMale());

    }

    @Test
    @DisplayName("Should get func first page")
    public void ShouldGetFuncFirstPage() {

//        WebElement btnMale = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[1]/div/div/div[1]/div[2]/div[2]/div[2]/label"));
//        btnMale.click();

        Page1.clickFemale();

        var actualTextElement = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[2]/div/div/div[2]/div[1]/div[2]/h2"));
        var actualText = actualTextElement.getText().trim();
        assertEquals("Какой у вас ритм жизни?", actualText);
        assertTrue(actualTextElement.isDisplayed());

        WebElement backP1 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[2]/div/div/div[2]/div[1]/div[3]/button"));
        backP1.click();

        Page1.clickMale();

    }

    @Test
    @DisplayName("Should get text two page")

    public void ShouldGetTextTwoPage() {

        WebElement btnMale = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[1]/div/div/div[1]/div[2]/div[2]/div[2]/label"));
        btnMale.click();

        WebElement sedentary = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[2]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        var actualTextSedentary = sedentary.getText().trim();
        assertEquals("Малоподвижный", actualTextSedentary);
        assertTrue(sedentary.isDisplayed());

        WebElement averageActivity = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[2]/div/div/div[2]/div[1]/div[2]/div[2]/label"));
        var actualTextAverage = averageActivity.getText().trim();
        assertEquals("Средняя активность", actualTextAverage);
        assertTrue(averageActivity.isDisplayed());

        WebElement highActivity = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[2]/div/div/div[2]/div[1]/div[2]/div[3]/label"));
        var actualTextHigh = highActivity.getText().trim();
        assertEquals("Высокая активность", actualTextHigh);
        assertTrue(highActivity.isDisplayed());

    }

    @Test
    @DisplayName("Should get funct two page")

    public void ShouldGetFunctTwotPage() {

        WebElement btnMale = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[1]/div/div/div[1]/div[2]/div[2]/div[2]/label"));
        btnMale.click();

        WebElement sedentary = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[2]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        sedentary.click();
        WebElement backP2 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[3]/div/div/div[2]/div[1]/div[3]/button"));
        backP2.click();

        WebElement averageActivity = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[2]/div/div/div[2]/div[1]/div[2]/div[2]/label"));
        averageActivity.click();
        backP2.click();

        WebElement highActivity = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[2]/div/div/div[2]/div[1]/div[2]/div[3]/label"));
        highActivity.click();
        backP2.click();

    }

    @Test
    @DisplayName("Should get text three page")

    public void ShouldGetTextThreePage() {

        WebElement btnMale = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[1]/div/div/div[1]/div[2]/div[2]/div[2]/label"));
        btnMale.click();

        WebElement sedentary = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[2]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        sedentary.click();

        WebElement HederPage3 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[3]/div/div/div[2]/div[1]/div[2]/h2"));
        var actualTextPage3 = HederPage3.getText().trim();
        assertEquals("Есть ли у вас привычки, которые мешают правильно питаться?", actualTextPage3);
        assertTrue(HederPage3.isDisplayed());

        WebElement EatEavning = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[3]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        var actualEavning = EatEavning.getText().trim();
        assertEquals("Я ем поздно вечером", actualEavning);
        assertTrue(EatEavning.isDisplayed());

        WebElement EatRun = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[3]/div/div/div[2]/div[1]/div[2]/div[2]/label"));
        var Run = EatRun.getText().trim();
        assertEquals("Я ем «на бегу» и много перекусываю", Run);
        assertTrue(EatRun.isDisplayed());

        WebElement EatSweet = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[3]/div/div/div[2]/div[1]/div[2]/div[3]/label"));
        var sweet = EatSweet.getText().trim();
        assertEquals("Я ем сладкое", sweet);
        assertTrue(EatSweet.isDisplayed());

        WebElement nothingHabit = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[3]/div/div/div[2]/div[1]/div[2]/div[4]/label"));
        var habit = nothingHabit.getText().trim();
        assertEquals("У меня нет таких привычек", habit);
        assertTrue(nothingHabit.isDisplayed());

    }

    @Test
    @DisplayName("Should get funct three page")

    public void ShouldGetFunctThreePage() {

        WebElement btnMale = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[1]/div/div/div[1]/div[2]/div[2]/div[2]/label"));
        btnMale.click();

        WebElement sedentary = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[2]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        sedentary.click();

        WebElement EatEavning = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[3]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        EatEavning.click();
        WebElement backP3 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[4]/div/div/div[2]/div[1]/div[3]/button"));
        backP3.click();

        WebElement EatRun = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[3]/div/div/div[2]/div[1]/div[2]/div[2]/label"));
        EatRun.click();
        backP3.click();

        WebElement EatSweet = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[3]/div/div/div[2]/div[1]/div[2]/div[3]/label"));
        EatSweet.click();
        backP3.click();

        WebElement nothingHabit = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[3]/div/div/div[2]/div[1]/div[2]/div[4]/label"));
        nothingHabit.click();
        backP3.click();

    }

    @Test
    @DisplayName("Should get fourth  page")

    public void ShouldGetTextFourthPage() {

        WebElement btnMale = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[1]/div/div/div[1]/div[2]/div[2]/div[2]/label"));
        btnMale.click();

        WebElement sedentary = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[2]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        sedentary.click();

        WebElement EatEavning = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[3]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        EatEavning.click();

        WebElement HeaderFourPage = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[4]/div/div/div[2]/div[1]/div[2]/h2"));
        var FourPage = HeaderFourPage.getText().trim();
        assertEquals("Сколько раз вы обычно едите за день?", FourPage);
        assertTrue(HeaderFourPage.isDisplayed());

        WebElement One = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[4]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        var FirstAns = One.getText().trim();
        assertEquals("1-2 раза", FirstAns);
        assertTrue(One.isDisplayed());

        WebElement Two = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[4]/div/div/div[2]/div[1]/div[2]/div[2]/label"));
        var TwiceAns = Two.getText().trim();
        assertEquals("3 раза", TwiceAns);
        assertTrue(Two.isDisplayed());

        WebElement Three = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[4]/div/div/div[2]/div[1]/div[2]/div[3]/label"));
        var ThreeAns = Three.getText().trim();
        assertEquals("4-5 раз", ThreeAns);
        assertTrue(Three.isDisplayed());

        WebElement Four = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[4]/div/div/div[2]/div[1]/div[2]/div[4]/label"));
        var FourAns = Four.getText().trim();
        assertEquals("Более 5 раз", FourAns);
        assertTrue(Four.isDisplayed());

    }

    @Test
    @DisplayName("Should get func fourth  page")

    public void ShouldGetFuncFourthPage() {

        WebElement btnMale = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[1]/div/div/div[1]/div[2]/div[2]/div[2]/label"));
        btnMale.click();

        WebElement sedentary = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[2]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        sedentary.click();

        WebElement EatEavning = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[3]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        EatEavning.click();

        WebElement One = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[4]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        One.click();

        WebElement HeaderP5 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[5]/div/div/div/h2"));
        var H5 = HeaderP5.getText().trim();
        assertEquals("Рационы питания влияют", H5);
        assertTrue(HeaderP5.isDisplayed());

        WebElement HeaderP51 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[5]/div/div/div/p"));
        var H51 = HeaderP51.getText().trim();
        assertEquals("на ваш уровень энергии, здоровье и скорость достижения целей", H51);
        assertTrue(HeaderP51.isDisplayed());

        WebElement cont = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[5]/div/div/div/button/span"));
        var P5 = cont.getText().trim();
        assertEquals("Продолжить", P5);
        assertTrue(cont.isDisplayed());
        cont.click();

        WebElement backP4 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[6]/div/div/div[2]/div[1]/div[3]/button[1]"));
        backP4.click();

        WebElement Two = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[4]/div/div/div[2]/div[1]/div[2]/div[2]/label"));
        Two.click();
        cont.click();
        backP4.click();

        WebElement Three = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[4]/div/div/div[2]/div[1]/div[2]/div[3]/label"));
        Three.click();
        cont.click();
        backP4.click();

        WebElement Four = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[4]/div/div/div[2]/div[1]/div[2]/div[4]/label"));
        Four.click();
        cont.click();
        backP4.click();

    }

    @Test
    @DisplayName("Should get text five  page")

    public void ShouldGetTextFivePage() {

        WebElement btnMale = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[1]/div/div/div[1]/div[2]/div[2]/div[2]/label"));
        btnMale.click();

        WebElement sedentary = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[2]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        sedentary.click();

        WebElement EatEavning = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[3]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        EatEavning.click();

        WebElement One = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[4]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        One.click();

        WebElement cont = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[5]/div/div/div/button/span"));
        cont.click();

        WebElement HeaderP5 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[6]/div/div/div[2]/div[1]/div[2]/h2"));
        var H5 = HeaderP5.getText().trim();
        assertEquals("Что для вас важнее всего в питании?", H5);
        assertTrue(HeaderP5.isDisplayed());

        WebElement HeaderP51 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[6]/div/div/div[2]/div[1]/div[2]/p"));
        var H51 = HeaderP51.getText().trim();
        assertEquals("Вы можете выбрать несколько вариантов", H51);
        assertTrue(HeaderP51.isDisplayed());

        WebElement q51 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[6]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        var Q51 = q51.getText().trim();
        assertEquals("Простота и быстрота приготовления", Q51);
        assertTrue(q51.isDisplayed());

        WebElement q52 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[6]/div/div/div[2]/div[1]/div[2]/div[2]/label"));
        var Q52 = q52.getText().trim();
        assertEquals("Вкусные блюда, которые приносят удовольствие", Q52);
        assertTrue(q52.isDisplayed());

        WebElement q53 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[6]/div/div/div[2]/div[1]/div[2]/div[3]/label"));
        var Q53 = q53.getText().trim();
        assertEquals("Экономия на продуктах", Q53);
        assertTrue(q53.isDisplayed());

        WebElement q54 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[6]/div/div/div[2]/div[1]/div[2]/div[4]/label"));
        var Q54 = q54.getText().trim();
        assertEquals("Максимальная польза для здоровья", Q54);
        assertTrue(q54.isDisplayed());

    }

    @Test
    @DisplayName("Should get func five  page")

    public void ShouldGetFuncFivePage() {

        WebElement btnMale = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[1]/div/div/div[1]/div[2]/div[2]/div[2]/label"));
        btnMale.click();

        WebElement sedentary = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[2]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        sedentary.click();

        WebElement EatEavning = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[3]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        EatEavning.click();

        WebElement One = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[4]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        One.click();

        WebElement cont = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[5]/div/div/div/button/span"));
        cont.click();

        WebElement q51 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[6]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        q51.click();

        WebElement backP5 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[7]/div/div/div[2]/div[1]/div[3]/button"));
        WebElement contP5 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[6]/div/div/div[2]/div[1]/div[3]/button[2]"));

        contP5.click();
        backP5.click();

        WebElement q52 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[6]/div/div/div[2]/div[1]/div[2]/div[2]/label"));
        q52.click();
        contP5.click();
        backP5.click();

        WebElement q53 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[6]/div/div/div[2]/div[1]/div[2]/div[3]/label"));
        q53.click();
        contP5.click();
        backP5.click();

        WebElement q54 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[6]/div/div/div[2]/div[1]/div[2]/div[4]/label"));
        q54.click();
        contP5.click();
        backP5.click();

        q51.click();
        q53.click();
        contP5.click();
        backP5.click();

        q52.click();
        q54.click();
        contP5.click();

    }

    @Test
    @DisplayName("Should get text six  page")

    public void ShouldGetTextSixPage() {

        WebElement btnMale = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[1]/div/div/div[1]/div[2]/div[2]/div[2]/label"));
        btnMale.click();

        WebElement sedentary = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[2]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        sedentary.click();

        WebElement EatEavning = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[3]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        EatEavning.click();

        WebElement One = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[4]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        One.click();

        WebElement cont = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[5]/div/div/div/button/span"));
        cont.click();

        WebElement q51 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[6]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        q51.click();

        WebElement contP5 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[6]/div/div/div[2]/div[1]/div[3]/button[2]"));
        contP5.click();

        WebElement HeaderP6 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[7]/div/div/div[2]/div[1]/div[2]/h2"));
        var H6 = HeaderP6.getText().trim();
        assertEquals("Пробовали ли вы диеты? Если да, то с каким опытом столкнулись?", H6);
        assertTrue(HeaderP6.isDisplayed());

        WebElement q61 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[7]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        var Q61 = q61.getText().trim();
        assertEquals("Я никогда не сидел на диетах", Q61);
        assertTrue(q61.isDisplayed());

        WebElement q62 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[7]/div/div/div[2]/div[1]/div[2]/div[2]/label"));
        var Q62 = q62.getText().trim();
        assertEquals("Я пробовал диеты, но они не дали результата", Q62);
        assertTrue(q62.isDisplayed());

        WebElement q63 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[7]/div/div/div[2]/div[1]/div[2]/div[3]/label"));
        var Q63 = q63.getText().trim();
        assertEquals("Диеты помогали, но результат быстро возвращался", Q63);
        assertTrue(q63.isDisplayed());

        WebElement q64 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[7]/div/div/div[2]/div[1]/div[2]/div[4]/label"));
        var Q64 = q64.getText().trim();
        assertEquals("Я до сих пор пытаюсь соблюдать диету", Q64);
        assertTrue(q64.isDisplayed());

    }

    @Test
    @DisplayName("Should get func six  page")

    public void ShouldGetFuncSixPage() {

        WebElement btnMale = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[1]/div/div/div[1]/div[2]/div[2]/div[2]/label"));
        btnMale.click();

        WebElement sedentary = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[2]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        sedentary.click();

        WebElement EatEavning = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[3]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        EatEavning.click();

        WebElement One = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[4]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        One.click();

        WebElement cont = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[5]/div/div/div/button/span"));
        cont.click();

        WebElement q51 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[6]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        q51.click();

        WebElement contP5 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[6]/div/div/div[2]/div[1]/div[3]/button[2]"));
        contP5.click();

        WebElement backP6 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[8]/div/div/div[2]/div[1]/div[3]/button"));


        WebElement q61 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[7]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        q61.click();
        backP6.click();

        WebElement q62 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[7]/div/div/div[2]/div[1]/div[2]/div[2]/label"));

        q62.click();
        backP6.click();

        WebElement q63 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[7]/div/div/div[2]/div[1]/div[2]/div[3]/label"));
        q63.click();
        backP6.click();

        WebElement q64 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[7]/div/div/div[2]/div[1]/div[2]/div[4]/label"));
        q64.click();
        backP6.click();

    }

    @Test
    @DisplayName("Should get text seven  page")

    public void ShouldGetTextSevenPage() {

        WebElement btnMale = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[1]/div/div/div[1]/div[2]/div[2]/div[2]/label"));
        btnMale.click();

        WebElement sedentary = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[2]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        sedentary.click();

        WebElement EatEavning = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[3]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        EatEavning.click();

        WebElement One = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[4]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        One.click();

        WebElement cont = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[5]/div/div/div/button/span"));
        cont.click();

        WebElement q51 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[6]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        q51.click();

        WebElement contP5 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[6]/div/div/div[2]/div[1]/div[3]/button[2]"));
        contP5.click();

        WebElement backP6 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[8]/div/div/div[2]/div[1]/div[3]/button"));

        WebElement q61 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[7]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        q61.click();

        WebElement HeaderP7 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[8]/div/div/div[2]/div[1]/div[2]/h2"));
        var H7 = HeaderP7.getText().trim();
        assertEquals("С чем вы сталкиваетесь чаще всего?", H7);
        assertTrue(HeaderP7.isDisplayed());

        WebElement q71 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[8]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        var Q71 = q71.getText().trim();
        assertEquals("Переедаю и не могу остановиться", Q71);
        assertTrue(q71.isDisplayed());

        WebElement q72 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[8]/div/div/div[2]/div[1]/div[2]/div[2]/label"));
        var Q72 = q72.getText().trim();
        assertEquals("Постоянно хочу сладкое или фастфуд", Q72);
        assertTrue(q72.isDisplayed());

        WebElement q73 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[8]/div/div/div[2]/div[1]/div[2]/div[3]/label"));
        var Q73 = q73.getText().trim();
        assertEquals("Не знаю, как правильно сочетать продукты", Q73);
        assertTrue(q73.isDisplayed());

        WebElement q74 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[8]/div/div/div[2]/div[1]/div[2]/div[4]/label"));
        var Q74 = q74.getText().trim();
        assertEquals("Нет времени готовить", Q74);
        assertTrue(q74.isDisplayed());

        q74.click();

        WebElement HeaderP8 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[9]/div/div/div/h2"));
        var H8 = HeaderP8.getText().trim();
        assertEquals("Решение этих проблем лежит в правильной организации питания и выборе рациона", H8);
        assertTrue(HeaderP8.isDisplayed());


        WebElement HeaderP81 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[9]/div/div/div/p"));
        var H81 = HeaderP81.getText().trim();
        assertEquals("Мы покажем, как это сделать", H81);
        assertTrue(HeaderP81.isDisplayed());

        WebElement contP8 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[9]/div/div/div/button"));
        contP8.click();

    }

    @Test
    @DisplayName("Should get func seven  page")

    public void ShouldGetFuncSevenPage() {

        WebElement btnMale = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[1]/div/div/div[1]/div[2]/div[2]/div[2]/label"));
        btnMale.click();

        WebElement sedentary = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[2]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        sedentary.click();

        WebElement EatEavning = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[3]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        EatEavning.click();

        WebElement One = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[4]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        One.click();

        WebElement cont = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[5]/div/div/div/button/span"));
        cont.click();

        WebElement q51 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[6]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        q51.click();

        WebElement contP5 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[6]/div/div/div[2]/div[1]/div[3]/button[2]"));
        contP5.click();

        WebElement q61 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[7]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        q61.click();

        WebElement q71 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[8]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        q71.click();

        WebElement contP8 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[9]/div/div/div/button"));
        contP8.click();

        WebElement backP7 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[10]/div/div/div[2]/div[1]/div[3]/button"));
        backP7.click();

        WebElement q72 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[8]/div/div/div[2]/div[1]/div[2]/div[2]/label"));
        q72.click();
        contP8.click();
        backP7.click();

        WebElement q73 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[8]/div/div/div[2]/div[1]/div[2]/div[3]/label"));
        q73.click();
        contP8.click();
        backP7.click();

        WebElement q74 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[8]/div/div/div[2]/div[1]/div[2]/div[4]/label"));
        q74.click();
        contP8.click();
        backP7.click();

    }

    @Test
    @DisplayName("Should get text eight  page")

    public void ShouldGetTextEightPage() {

        WebElement btnMale = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[1]/div/div/div[1]/div[2]/div[2]/div[2]/label"));
        btnMale.click();

        WebElement sedentary = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[2]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        sedentary.click();

        WebElement EatEavning = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[3]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        EatEavning.click();

        WebElement One = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[4]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        One.click();

        WebElement cont = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[5]/div/div/div/button/span"));
        cont.click();

        WebElement q51 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[6]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        q51.click();

        WebElement contP5 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[6]/div/div/div[2]/div[1]/div[3]/button[2]"));
        contP5.click();

        WebElement q61 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[7]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        q61.click();

        WebElement q71 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[8]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        q71.click();

        WebElement contP8 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[9]/div/div/div/button"));
        contP8.click();

        WebElement HeaderP8 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[10]/div/div/div[2]/div[1]/div[2]/h2"));
        var H8 = HeaderP8.getText().trim();
        assertEquals("Чего вы хотите достичь?", H8);
        assertTrue(HeaderP8.isDisplayed());

        WebElement q81 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[10]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        var Q81 = q81.getText().trim();
        assertEquals("Сбросить лишний вес", Q81);
        assertTrue(q81.isDisplayed());

        WebElement q82 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[10]/div/div/div[2]/div[1]/div[2]/div[2]/label"));
        var Q82 = q82.getText().trim();
        assertEquals("Улучшить здоровье и самочувствие", Q82);
        assertTrue(q82.isDisplayed());

        WebElement q83 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[10]/div/div/div[2]/div[1]/div[2]/div[3]/label"));
        var Q83 = q83.getText().trim();
        assertEquals("Набрать мышечную массу", Q83);
        assertTrue(q83.isDisplayed());

        WebElement q84 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[10]/div/div/div[2]/div[1]/div[2]/div[4]/label"));
        var Q84 = q84.getText().trim();
        assertEquals("Научиться правильно питаться для себя и семьи", Q84);
        assertTrue(q84.isDisplayed());
    }

    @Test
    @DisplayName("Should get func eight  page")

    public void ShouldGetFuncEightPage() {

        WebElement btnMale = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[1]/div/div/div[1]/div[2]/div[2]/div[2]/label"));
        btnMale.click();

        WebElement sedentary = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[2]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        sedentary.click();

        WebElement EatEavning = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[3]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        EatEavning.click();

        WebElement One = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[4]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        One.click();

        WebElement cont = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[5]/div/div/div/button/span"));
        cont.click();

        WebElement q51 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[6]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        q51.click();

        WebElement contP5 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[6]/div/div/div[2]/div[1]/div[3]/button[2]"));
        contP5.click();

        WebElement q61 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[7]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        q61.click();

        WebElement q71 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[8]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        q71.click();

        WebElement contP8 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[9]/div/div/div/button"));
        contP8.click();

        WebElement q81 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[10]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        q81.click();
        WebElement backP8 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[11]/div/div/div[2]/div[1]/div[3]/button"));
        backP8.click();

        WebElement q82 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[10]/div/div/div[2]/div[1]/div[2]/div[2]/label"));
        q82.click();
        backP8.click();

        WebElement q83 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[10]/div/div/div[2]/div[1]/div[2]/div[3]/label"));
        q83.click();
        backP8.click();

        WebElement q84 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[10]/div/div/div[2]/div[1]/div[2]/div[4]/label"));
        q84.click();
        backP8.click();
    }

    @Test
    @DisplayName("Should get text nine page")

    public void ShouldGetTextNinePage() {

        WebElement btnMale = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[1]/div/div/div[1]/div[2]/div[2]/div[2]/label"));
        btnMale.click();

        WebElement sedentary = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[2]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        sedentary.click();

        WebElement EatEavning = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[3]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        EatEavning.click();

        WebElement One = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[4]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        One.click();

        WebElement cont = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[5]/div/div/div/button/span"));
        cont.click();

        WebElement q51 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[6]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        q51.click();

        WebElement contP5 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[6]/div/div/div[2]/div[1]/div[3]/button[2]"));
        contP5.click();

        WebElement q61 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[7]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        q61.click();

        WebElement q71 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[8]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        q71.click();

        WebElement contP8 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[9]/div/div/div/button"));
        contP8.click();

        WebElement q81 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[10]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        q81.click();

        WebElement HeaderP9 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[11]/div/div/div[2]/div[1]/div[2]/h2"));
        var H9 = HeaderP9.getText().trim();
        assertEquals("Как вы оцениваете свои знания о правильном питании?", H9);
        assertTrue(HeaderP9.isDisplayed());

        WebElement q91 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[11]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        var Q91 = q91.getText().trim();
        assertEquals("Ничего не знаю", Q91);
        assertTrue(q91.isDisplayed());

        WebElement q92 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[11]/div/div/div[2]/div[1]/div[2]/div[2]/label"));
        var Q92 = q92.getText().trim();
        assertEquals("Знаю основы, но часто ошибаюсь", Q92);
        assertTrue(q92.isDisplayed());

        WebElement q93 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[11]/div/div/div[2]/div[1]/div[2]/div[3]/label"));
        var Q93 = q93.getText().trim();
        assertEquals("Разбираюсь, но не всегда удается применять на практике", Q93);
        assertTrue(q93.isDisplayed());
    }

    @Test
    @DisplayName("Should get func nine page")

    public void ShouldGetFuncNinePage() {

        WebElement btnMale = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[1]/div/div/div[1]/div[2]/div[2]/div[2]/label"));
        btnMale.click();

        WebElement sedentary = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[2]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        sedentary.click();

        WebElement EatEavning = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[3]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        EatEavning.click();

        WebElement One = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[4]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        One.click();

        WebElement cont = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[5]/div/div/div/button/span"));
        cont.click();

        WebElement q51 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[6]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        q51.click();

        WebElement contP5 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[6]/div/div/div[2]/div[1]/div[3]/button[2]"));
        contP5.click();

        WebElement q61 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[7]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        q61.click();

        WebElement q71 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[8]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        q71.click();

        WebElement contP8 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[9]/div/div/div/button"));
        contP8.click();

        WebElement q81 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[10]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        q81.click();

        WebElement q91 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[11]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        q91.click();

        WebElement backP9 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[12]/div/div/div[2]/div[1]/div[3]/button"));
        backP9.click();

        WebElement q92 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[11]/div/div/div[2]/div[1]/div[2]/div[2]/label"));
        q92.click();
        backP9.click();

        WebElement q93 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[11]/div/div/div[2]/div[1]/div[2]/div[3]/label"));
        q93.click();
        backP9.click();

    }

    //    @Test
    @DisplayName("Should get func ten page")

    public void ShouldGetFuncTenPage() {

        WebElement btnMale = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[1]/div/div/div[1]/div[2]/div[2]/div[2]/label"));
        btnMale.click();

        WebElement sedentary = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[2]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        sedentary.click();

        WebElement EatEavning = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[3]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        EatEavning.click();

        WebElement One = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[4]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        One.click();

        WebElement cont = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[5]/div/div/div/button/span"));
        cont.click();

        WebElement q51 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[6]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        q51.click();

        WebElement contP5 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[6]/div/div/div[2]/div[1]/div[3]/button[2]"));
        contP5.click();

        WebElement q61 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[7]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        q61.click();

        WebElement q71 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[8]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        q71.click();

        WebElement contP8 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[9]/div/div/div/button"));
        contP8.click();

        WebElement q81 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[10]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        q81.click();

        WebElement q91 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[11]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
        q91.click();

        WebElement HeaderP10 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[12]/div/div/div[2]/div[1]/div[2]/h2"));
        var H10 = HeaderP10.getText().trim();
        assertEquals("Укажите ваши параметры", H10);
        assertTrue(HeaderP10.isDisplayed());


        WebElement Age = driver.findElement(By.tagName("Возраст"));
        var age = Age.getText().trim();
        assertEquals("Возраст", age);
        assertTrue((Age.isDisplayed()));
//        driver.findElement(By.id("q10__2")).sendKeys("45");
//        q101.click();
//        q101.getText();

    }
}
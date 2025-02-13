package ru.tutor.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.tutor.page.*;

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
        driver = new ChromeDriver();
        Page1 Page1 = new Page1(driver);
        Page2 Page2 = new Page2(driver);
        Page3 Page3 = new Page3(driver);
        Page4 Page4 = new Page4(driver);
        Page5 Page5 = new Page5(driver);
        Page6 Page6 = new Page6(driver);
        Page7 Page7 = new Page7(driver);
        Page8 Page8 = new Page8(driver);
        Page9 Page9 = new Page9(driver);
        Page10 Page10 = new Page10(driver);
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
        Assert.assertEquals("минус 2 размера", Page1.getMinus());
        Assert.assertEquals("за месяц", Page1.getMonth());
        Assert.assertEquals("Пройдите тест и получите персональные", Page1.getPerson());
        Assert.assertEquals("рационы питания для похудения", Page1.getRazion());
        Assert.assertEquals("Женский", Page1.getFemale());
        Assert.assertEquals("Мужской", Page1.getMale());

    }

    @Test
    @DisplayName("Should get func first page")
    public void ShouldGetFuncFirstPage() {

        Page1.clickFemale();
        Assert.assertEquals("Какой у вас ритм жизни?", Page2.getHeader2());
        Assert.assertEquals("2/10", Page2.getCount());
        Page2.clickBack1();
        Assert.assertEquals("Секрет стройности:", Page1.getHeader1());
        Page1.clickMale();
        Assert.assertEquals("Малоподвижный", Page2.getQ2_1());
        Assert.assertEquals("Средняя активность", Page2.getQ2_2());
        Assert.assertEquals("Высокая активность", Page2.getQ2_3());

    }

    @Test
    @DisplayName("Should get funct two page")

    public void ShouldGetFunctTwotPage() {

        Page1.clickMale();
        Page2.clickQ2_1();
        Assert.assertEquals("Есть ли у вас привычки, которые мешают правильно питаться?", Page3.getHeader3());
        Assert.assertEquals("3/10", Page3.getCount());
        Page3.clickBack2();
        Assert.assertEquals("Какой у вас ритм жизни?", Page2.getHeader2());
        Page2.clickQ2_2();
        Assert.assertEquals("Я ем поздно вечером", Page3.getQ3_1());
        Assert.assertEquals("Я ем «на бегу» и много перекусываю", Page3.getQ3_2());
        Page3.clickBack2();
        Page2.clickQ2_3();
        Assert.assertEquals("Я ем сладкое", Page3.getQ3_3());
        Assert.assertEquals("У меня нет таких привычек", Page3.getQ3_4());
        Page3.clickBack2();

    }

    @Test
    @DisplayName("Should get funct three page")

    public void ShouldGetFunctThreePage() {

        Page1.clickMale();
        Page2.clickQ2_1();
        Page3.clickQ3_1();
        Assert.assertEquals("Сколько раз вы обычно едите за день?", Page4.getHeader4());
        Assert.assertEquals("4/10", Page4.getCount());
        Page4.clickBack3();
        Assert.assertEquals("Есть ли у вас привычки, которые мешают правильно питаться?", Page3.getHeader3());
        Page3.clickQ3_2();
        Assert.assertEquals("1-2 раза", Page4.getQ4_1());
        Assert.assertEquals("3 раза", Page4.getQ4_2());
        Page4.clickBack3();
        Page3.clickQ3_3();
        Assert.assertEquals("4-5 раз", Page4.getQ4_3());
        Assert.assertEquals("Более 5 раз", Page4.getQ4_4());
        Page4.clickBack3();
        Page3.clickQ3_4();
        Assert.assertEquals("Сколько раз вы обычно едите за день?", Page4.getHeader4());
    }

    @Test
    @DisplayName("Should get func fourth  page")

    public void ShouldGetFuncFourthPage() {

        Page1.clickMale();
        Page2.clickQ2_1();
        Page3.clickQ3_1();
        Page4.clickQ4_1();
        Assert.assertEquals("Рационы питания влияют", Page5.getHeader5());
        Assert.assertEquals("на ваш уровень энергии, здоровье и скорость достижения целей", Page5.getHeader5_1());
        Assert.assertEquals("Продолжить", Page5.getContinue6());
        Page5.clickContinue6();
        Assert.assertEquals("Что для вас важнее всего в питании?", Page5.getHeader6());
        Assert.assertEquals("Вы можете выбрать несколько вариантов", Page5.getHeader6_1());
        Page5.clickBack4();
        Assert.assertEquals("Сколько раз вы обычно едите за день?", Page4.getHeader4());
        Page4.clickQ4_2();
        Page5.clickContinue6();
        Assert.assertEquals("Простота и быстрота приготовления", Page5.getQ6_1());
        Assert.assertEquals("Вкусные блюда, которые приносят удовольствие", Page5.getQ6_2());
        Page5.clickBack4();
        Page4.clickQ4_3();
        Page5.clickContinue6();
        Assert.assertEquals("Экономия на продуктах", Page5.getQ6_3());
        Assert.assertEquals("Максимальная польза для здоровья", Page5.getQ6_4());
        Page5.clickBack4();
        Page4.clickQ4_4();
        Page5.clickContinue6();
        Assert.assertEquals("Что для вас важнее всего в питании?", Page5.getHeader6());
        Assert.assertEquals("5/10", Page5.getCount());

    }

    @Test
    @DisplayName("Should get text five  page")

    public void ShouldGetTextFivePage() {

        Page1.clickMale();
        Page2.clickQ2_1();
        Page3.clickQ3_1();
        Page4.clickQ4_1();
        Page5.clickContinue6();
        Assert.assertEquals("Что для вас важнее всего в питании?", Page5.getHeader6());
        Assert.assertEquals(false, Page5.chechDisBtn());
        Page5.clickQ6_1();
        Assertions.assertEquals(true, Page5.chechDisBtn());
        Page5.clickContinue7();
        Assert.assertEquals("Пробовали ли вы диеты? Если да, то с каким опытом столкнулись?", Page6.getHeader6());
        Page6.clickBack5();
        Page5.clickQ6_2();
        Assert.assertEquals(true, Page5.chechDisBtn());
        Page5.clickQ6_3();
        Assertions.assertEquals(true, Page5.chechDisBtn());
        Page5.clickContinue7();
        Assert.assertEquals("Я никогда не сидел на диетах", Page6.getQ6_1());
        Assert.assertEquals("Я пробовал диеты, но они не дали результата", Page6.getQ6_2());
        Assert.assertEquals("Диеты помогали, но результат быстро возвращался", Page6.getQ6_3());
        Assert.assertEquals("Я до сих пор пытаюсь соблюдать диету", Page6.getQ6_4());
        Page6.clickBack5();
        Page5.clickQ6_4();
        Assertions.assertEquals(true, Page5.chechDisBtn());
        Page5.clickContinue7();
        Assert.assertEquals("6/10", Page6.getCount());
        Page6.clickBack5();
        Page5.clickQ6_1();
        Page5.clickQ6_2();
        Page5.clickQ6_3();
        Page5.clickQ6_4();
        Assert.assertEquals(false, Page5.chechDisBtn());
    }

    @Test
    @DisplayName("Should get func five  page")

    public void ShouldGetFuncFivePage() {

        Page1.clickMale();
        Page2.clickQ2_1();
        Page3.clickQ3_1();
        Page4.clickQ4_1();
        Page5.clickContinue6();
        Page5.clickQ6_1();
        Page5.clickContinue7();
        Assert.assertEquals("С чем вы сталкиваетесь чаще всего?", Page7.getHeader7());
        Assert.assertEquals("Переедаю и не могу остановиться", Page7.getQ7_1());
        Assert.assertEquals("Постоянно хочу сладкое или фастфуд", Page7.getQ7_2());
        Assert.assertEquals("Не знаю, как правильно сочетать продукты", Page7.getQ7_3());
        Assert.assertEquals("Нет времени готовить", Page7.getQ7_4());
        Assert.assertEquals("7/10", Page7.getCount());

    }

    @Test
    @DisplayName("Should get text six  page")

    public void ShouldGetTextSixPage() {

        Page1.clickMale();
        Page2.clickQ2_1();
        Page3.clickQ3_1();
        Page4.clickQ4_1();
        Page5.clickContinue6();
        Page5.clickQ6_1();
        Page5.clickContinue7();
        Page6.clickQ6_1();
        Assert.assertEquals("С чем вы сталкиваетесь чаще всего?", Page7.getHeader7());
        Page7.clickQ7_1();
        Assert.assertEquals("Решение этих проблем лежит в правильной организации питания и выборе рациона", Page8.getHeader7_1());
        Page8.clickContinue8();
        Assert.assertEquals("Чего вы хотите достичь?", Page8.getHeader8());
        Page8.clickBack7();
        Page7.clickQ7_2();
        Assert.assertEquals("Мы покажем, как это сделать", Page8.getHeader7_2());
        Page8.clickContinue8();
        Assert.assertEquals("Сбросить лишний вес", Page8.getQ8_1());
        Page8.clickBack7();
        Page7.clickQ7_3();
        Assert.assertEquals("Продолжить", Page8.getContinue8());
        Page8.clickContinue8();
        Assert.assertEquals("Улучшить здоровье и самочувствие", Page8.getQ8_2());
        Assert.assertEquals("Набрать мышечную массу", Page8.getQ8_3());
        Page8.clickBack7();
        Page7.clickQ7_4();
        Page8.clickContinue8();
        Assert.assertEquals("Научиться правильно питаться для себя и семьи",Page8.getQ8_4());
        Assert.assertEquals("8/10",Page8.getCount());
        Page8.clickBack7();
        Assert.assertEquals("С чем вы сталкиваетесь чаще всего?", Page7.getHeader7());
         }

    @Test
    @DisplayName("Should get func eight + text Nine page")

    public void ShouldGetFuncEightPage() {

        Page1.clickMale();
        Page2.clickQ2_1();
        Page3.clickQ3_1();
        Page4.clickQ4_1();
        Page5.clickContinue6();
        Page5.clickQ6_1();
        Page5.clickContinue7();
        Page6.clickQ6_1();
        Page7.clickQ7_1();
        Page8.clickContinue8();
        Assert.assertEquals("Чего вы хотите достичь?", Page8.getHeader8());
        Page8.clickQ8_1();
        Assert.assertEquals("Как вы оцениваете свои знания о правильном питании?", Page9.getHeader9());
        Page9.clickBack8();
        Page8.clickQ8_2();
        Assert.assertEquals("Ничего не знаю", Page9.getQ9_1());
        Page9.clickBack8();
        Page8.clickQ8_3();
        Assert.assertEquals("Знаю основы, но часто ошибаюсь", Page9.getQ9_2());
        Page9.clickBack8();
        Page8.clickQ8_4();
        Assert.assertEquals("Разбираюсь, но не всегда удается применять на практике", Page9.getQ9_3());
        Assert.assertEquals("9/10",Page9.getCount());
    }

    @Test
    @DisplayName("Should get text seven  page")

    public void ShouldGetTextSevenPage() {

        Page1.clickMale();
        Page2.clickQ2_1();
        Page3.clickQ3_1();
        Page4.clickQ4_1();
        Page5.clickContinue6();
        Page5.clickQ6_1();
        Page5.clickContinue7();
        Page6.clickQ6_1();
        Page7.clickQ7_1();
        Page8.clickContinue8();
        Page8.clickQ8_1();
        Assert.assertEquals("Как вы оцениваете свои знания о правильном питании?", Page9.getHeader9());
        Page9.clickQ9_1();
        Assert.assertEquals("Укажите ваши параметры", Page10.getHeader10());
        Page10.clickBack9();
        Page9.clickQ9_2();
        Assert.assertEquals("Продолжить", Page10.getContinue11());
        Page10.clickBack9();
        Page9.clickQ9_3();
        Assert.assertEquals("10/10", Page10.getCount());

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
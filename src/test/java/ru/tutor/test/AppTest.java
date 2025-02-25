package ru.tutor.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.tutor.page.*;

import java.time.Duration;

import static java.lang.Thread.sleep;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

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
        Loader Loader = new Loader(driver);
        Body Body = new Body(driver);
        Komment komment = new Komment(driver);
        Pay Pay = new Pay(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(url);
    }


    @After
    public void quitDriver() {
        driver.close();
    }

    @Test
    @DisplayName("Should get text First page")
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
    @DisplayName("Should get func First page + text Two")
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
    @DisplayName("Should get funct Two page + text Three")

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
    @DisplayName("Should get funct Three page + text Fourth")

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
    @DisplayName("Should get func Fourth page + text Five")

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
    @DisplayName("Should get func Five page + text Six")

    public void ShouldGetFuncFivePage() {

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
    @DisplayName("Should get text Seven page")

    public void ShouldGetTextSevenPage() {

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
    @DisplayName("Should get func Seven text eight page")

    public void ShouldGetFuncSevenPage() {

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
        Assert.assertEquals("Научиться правильно питаться для себя и семьи", Page8.getQ8_4());
        Assert.assertEquals("8/10", Page8.getCount());
        Page8.clickBack7();
        Assert.assertEquals("С чем вы сталкиваетесь чаще всего?", Page7.getHeader7());
    }

    @Test
    @DisplayName("Should get func Eight + text Nine page")

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
        Assert.assertEquals("9/10", Page9.getCount());
    }

    @Test
    @DisplayName("Should get func Nine page + text Ten Page")

    public void ShouldGetFuncNinePage() throws InterruptedException {

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
        Assert.assertEquals("Возраст", Page10.getQ10_2());
        Assert.assertEquals("Рост", Page10.getQ10_1());
        Assert.assertEquals("Вес", Page10.getQ10_3());
        Assert.assertEquals("Желаемый вес", Page10.getQ10_4());
        Assert.assertEquals(false, Page10.chechDisBtn());

//        System.out.println(Page10.chechNameColor());
    }

    @Test
    @DisplayName("Should get funct ten page Disable1")
    public void ShouldFunctTenPageDisable1() {
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
        Page9.clickQ9_1();
        Assert.assertEquals("Укажите ваши параметры", Page10.getHeader10());
        Page10.send17KeysQ10_2();
//        System.out.println(Page10.getItemQ10_2());
        Assert.assertEquals("rgba(255, 0, 0, 1)", Page10.getItemQ10_2());
        Page10.send119KeysQ10_1();
        Assert.assertEquals("rgba(255, 0, 0, 1)", Page10.getItemQ10_1());
        Page10.send39KeysQ10_3();
        Assert.assertEquals("rgba(255, 0, 0, 1)", Page10.getItemQ10_3());
        Page10.send39KeysQ10_4();
        Assert.assertEquals("rgba(255, 0, 0, 1)", Page10.getItemQ10_4());
        Assert.assertEquals(false, Page10.chechDisBtn());
        Page10.clickContinue11();
    }

    @Test
    @DisplayName("Should get funct ten page Disable2")
    public void ShouldFunctTenPageDisable2() {
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
        Page9.clickQ9_1();
        Assert.assertEquals("Укажите ваши параметры", Page10.getHeader10());
        Page10.send100KeysQ10_2();
        Assert.assertEquals("rgba(255, 0, 0, 1)", Page10.getItemQ10_2());
        Page10.send251KeysQ10_1();
        Assert.assertEquals("rgba(255, 0, 0, 1)", Page10.getItemQ10_1());
        Page10.send401KeysQ10_3();
        Assert.assertEquals("rgba(255, 0, 0, 1)", Page10.getItemQ10_3());
        Page10.send401KeysQ10_4();
        Assert.assertEquals("rgba(255, 0, 0, 1)", Page10.getItemQ10_4());
        Assert.assertEquals(false, Page10.chechDisBtn());
        Page10.clickContinue11();
    }

    @Test
    @DisplayName("Should get funct ten page Ebale1")
    public void ShouldFunctTenPageEbale1() {
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
        Page9.clickQ9_1();
        Assert.assertEquals("Укажите ваши параметры", Page10.getHeader10());
        Page10.send18KeysQ10_2();
        Assert.assertEquals("rgba(0, 128, 0, 1)", Page10.getItemQ10_2());
        Page10.send120KeysQ10_1();
        Assert.assertEquals("rgba(0, 128, 0, 1)", Page10.getItemQ10_1());
        Page10.send40KeysQ10_3();
        Assert.assertEquals("rgba(0, 128, 0, 1)", Page10.getItemQ10_3());
        Page10.send40KeysQ10_4();
        Assert.assertEquals("rgba(0, 128, 0, 1)", Page10.getItemQ10_4());
        Assert.assertEquals(true, Page10.chechDisBtn());
        Page10.clickContinue11();
    }

    @Test
    @DisplayName("Should get funct ten page Ebale2")
    public void ShouldFunctTenPageEbale2() {
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
        Page9.clickQ9_1();
        Assert.assertEquals("Укажите ваши параметры", Page10.getHeader10());
        Page10.send99KeysQ10_2();
        Assert.assertEquals("rgba(0, 128, 0, 1)", Page10.getItemQ10_2());
        Page10.send250KeysQ10_1();
        Assert.assertEquals("rgba(0, 128, 0, 1)", Page10.getItemQ10_1());
        Page10.send400KeysQ10_3();
        Assert.assertEquals("rgba(0, 128, 0, 1)", Page10.getItemQ10_3());
        Page10.send400KeysQ10_4();
        Assert.assertEquals("rgba(0, 128, 0, 1)", Page10.getItemQ10_4());
        Assert.assertEquals(true, Page10.chechDisBtn());
        Page10.clickContinue11();
    }

    @Test
    @DisplayName("Should get funct ten page Ebale1+Dis1")
    public void ShouldFunctTenPageEbale1Dis1() {
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
        Page9.clickQ9_1();
        Assert.assertEquals("Укажите ваши параметры", Page10.getHeader10());
        Page10.send18KeysQ10_2();
        Page10.send120KeysQ10_1();
        Page10.send39KeysQ10_3();
        Page10.send39KeysQ10_4();
        Assert.assertEquals(false, Page10.chechDisBtn());
        Page10.clickContinue11();
    }

    @Test
    @DisplayName("Should get funct ten page Ebale1+Dis1")
    public void ShouldFunctTenPageEbale2Dis2() {
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
        Page9.clickQ9_1();
        Assert.assertEquals("Укажите ваши параметры", Page10.getHeader10());
        Page10.send100KeysQ10_2();
        Page10.send251KeysQ10_1();
        Page10.send40KeysQ10_3();
        Page10.send400KeysQ10_4();
        Assert.assertEquals(false, Page10.chechDisBtn());
        Page10.clickContinue11();
    }

    @Test
    @DisplayName("Should get funct Loader page")
    public void ShouldFunctLoaderPage() {
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
        Page9.clickQ9_1();
        Page10.send18KeysQ10_2();
        Page10.send120KeysQ10_1();
        Page10.send40KeysQ10_3();
        Page10.send400KeysQ10_4();
        Page10.clickContinue11();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7500));
        wait.until(visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/main/div/section[14]/section/div/div/div[1]/div[1]/h2")));

        Assert.assertEquals("Поздравляем!", Loader.getHeader14());
        Assert.assertEquals("Вы на шаг ближе ", Loader.getHeader14_1());
        Assert.assertEquals("к идеальному телу!", Loader.getHeader14_2());
        Assert.assertEquals("Ваши рационы питания готовы", Loader.getHeader14_3());
        Assert.assertEquals("Резюме", Loader.getRezume());
        Assert.assertEquals("вашего профиля", Loader.getProfile());
        Assert.assertEquals("Ваш вес", Loader.getVashVes());
        Assert.assertEquals("через 4 недели, следуя дневнику питания", Loader.getVesFourWeek());
        Assert.assertEquals("1 неделя", Loader.getOneWeek());
        Assert.assertEquals("2 недели", Loader.getTwoWeek());
        Assert.assertEquals("3 недели", Loader.getThreeWeek());
        Assert.assertEquals("4 недели", Loader.getFourWeek());
        Assert.assertEquals("45 кг", Loader.getVes());
        Assert.assertEquals("Ваш ИМТ", Loader.getIMT());
        Assert.assertEquals("через 4 недели, следуя дневнику питания", Loader.getIMTWeek());
        Assert.assertEquals("Норма", Loader.getIMTnorm());
        Assert.assertEquals("Ваш метаболический возраст", Loader.setMet());
        Assert.assertEquals("метаболический", Loader.getMetAge());
        Assert.assertEquals("28 лет", Loader.getTeorAge());
        Assert.assertEquals("фактический", Loader.getNumberAge());
        Assert.assertEquals("18 лет", Loader.getFactAge());
        Assert.assertEquals("Рекомендуемое количество воды", Loader.getWater());
        Assert.assertEquals("4.09 литра в день", Loader.setNumberWater());
//        System.out.println(Loader.setLoad());
    }

    @Test
    @DisplayName("Should get funct Loader page")
    public void ShouldFunctLoaderPageBody() {
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
        Page9.clickQ9_1();
        Page10.send18KeysQ10_2();
        Page10.send120KeysQ10_1();
        Page10.send40KeysQ10_3();
        Page10.send400KeysQ10_4();
        Page10.clickContinue11();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6000));
        wait.until(visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/main/div/section[14]/section/div/div/div[1]/div[2]/h3")));
        Body.PageDownBtn();
        Body.PageDownBtn();
        Body.PageDownBtn();
        Body.PageDownBtn();
        Assert.assertEquals("Норма калорий", Body.getNormKal());
        Assert.assertEquals("1772 ккал", Body.getBalanse());
        Assert.assertEquals("1772 ккал", Body.getNumberKkal());
        Assert.assertEquals("0", Body.getZeroKkal());
        Assert.assertEquals("Калорий", Body.getNameZero());
        Assert.assertEquals("5000", Body.getFiveThousendKkal());
        Assert.assertEquals("Калорий", Body.getNameFive());
        Assert.assertEquals("Зоны похудения", Body.getZone());
        Assert.assertEquals("Руки", Body.getArms());
        Assert.assertEquals("Ноги", Body.getLeg());
        Assert.assertEquals("Живот", Body.getStomach());
        Assert.assertEquals("Лицо", Body.getFace());
        Assert.assertEquals("курса", Body.getKurs());
        Assert.assertEquals("С чего начинается ваш путь", Body.getYourRoad());
        Assert.assertEquals("к здоровым отношениям с едой?", Body.getZdorFood());
        Assert.assertEquals("Урок 1", Body.getFirstLesson());
        Assert.assertEquals("Введение в рацион питания", Body.getVvedRaz());
        Assert.assertEquals("Урок 2", Body.getSecondLesson());
        Assert.assertEquals("Получить доступ", Body.getTextBtnPoluchit());
        Body.clickBtnPoluchit();
        Assert.assertEquals("Фигура мечты почти ваша! Успейте забрать", Pay.getFigure());
    }

    @Test
    @DisplayName("Should get funct Loader-Komment page")
    public void ShouldFunctLoaderKommentPageBody() throws InterruptedException {
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
        Page9.clickQ9_1();
        Page10.send18KeysQ10_2();
        Page10.send120KeysQ10_1();
        Page10.send40KeysQ10_3();
        Page10.send400KeysQ10_4();
        Page10.clickContinue11();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6000));
        wait.until(visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/main/div/section[14]/section/div/div/div[1]/div[2]/h3")));
        Body.PageDownBtn();
        Body.PageDownBtn();
        Body.PageDownBtn();
        sleep(1000);
        Body.PageDownBtn();
        Body.PageDownBtn();
        Assert.assertEquals("> 10 000 похудели благодаря рационам питания!", Komment.setNumber());
        Assert.assertEquals("Мы не хвастаемся. За нас это делают наши пользователи!", Komment.setHvast());
        Body.PageDownBtn();
        Assert.assertEquals("Алексей, 27 лет", Komment.getAlex());
        Assert.assertEquals("Курс изменил мою жизнь! До этого питался как попало, не задумываясь о последствиях. После курса понял, что правильное питание — это основа здоровья и долголетия. Во время обучения я составил рацион, который учитывает мои особенности и потребности. Заметил улучшение самочувствия и повышение энергии.", Komment.getKommitAlex());
        Assert.assertEquals("Михаил,", Komment.getMichail());
        Assert.assertEquals("25 лет", Komment.getMichail25());
        Assert.assertEquals("Курс помог мне осознать важность баланса между белками, жирами и углеводами. Автор научила меня готовить полезные блюда, которые не только вкусны, но и полезны для организма. Вес начал снижаться, улучшилось настроение и общее состояние здоровья.", Komment.getKommitMichail());
        sleep(1000);
        Assert.assertEquals("Георгий,", Komment.getGeorg());
        Assert.assertEquals("53 года", Komment.getGeorg53());
        Assert.assertEquals("Отличный курс по рационам питания! Помог разобраться в принципах здорового питания и подобрать оптимальный рацион для снижения веса. Автор очень грамотная, объясняет всё доступно. Результатом доволен, вес уходит постепенно, но уверенно.", Komment.getKommitGeorg());
        Komment.clickBtnCont();
        Assert.assertEquals("Евгений, 34 года", Komment.getEvgen());
        Assert.assertEquals("Курс по рационам питания — это инвестиция в своё здоровье! Он помог мне определить причины лишнего веса и разработать стратегию его снижения. Рацион сбалансирован, блюда разнообразные и вкусные. Результаты радуют, вес уходит медленно, но верно.", Komment.getKommitEvgen());
        Komment.clickBtnBack();
        Assert.assertEquals("Георгий,", Komment.getGeorg());
        Komment.clickBtnBack();
        Assert.assertEquals("Михаил,", Komment.getMichail());
    }

    @Test
    @DisplayName("Should get funct Pay page")
    public void ShouldFunctPay() throws InterruptedException {
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
        Page9.clickQ9_1();
        Page10.send18KeysQ10_2();
        Page10.send120KeysQ10_1();
        Page10.send40KeysQ10_3();
        Page10.send400KeysQ10_4();
        Page10.clickContinue11();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6000));
        wait.until(visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/main/div/section[14]/section/div/div/div[1]/div[2]/h3")));
        Body.EndBtn();
        sleep(1000);
        Pay.PageUpBtn();
        sleep(2500);
        Assert.assertEquals("Фигура мечты почти ваша! Успейте забрать", Pay.getFigure());
        Assert.assertEquals("рационы питания по акции!", Pay.getAkchia());
        Assert.assertEquals("Только сейчас: доступ к курсу", Pay.getDostup());
        Assert.assertEquals("Всего за 1 ₽*", Pay.getOneRubl());
        Assert.assertEquals("*Первые 7 дней, далее 399₽ или 99₽ раз в 30 дней или в зависимости от условий. Отмена в любой момент.", Pay.getUsl());
        Assert.assertEquals("Получить доступ", Pay.getBtnText());
        Assert.assertEquals("none",Pay.getErrorDisplay());
        Pay.clickMainBtn();
        Assert.assertEquals("Укажите корректный email", Pay.getErrorText());
        Assert.assertEquals("Нажимая кнопку  \"Получить доступ\" вы подтверждаете ознакомление с офертой и тарифами, а также даете согласие на обработку персональных данных.", Pay.getTwiseUslText());
        Pay.setEmailValid();
        Pay.clickMainBtn();
    }
}
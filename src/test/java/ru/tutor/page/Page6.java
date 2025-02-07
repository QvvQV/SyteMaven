import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
////package ru.tutor.page;
//
////
//public void ShouldGetFuncSixthPage() {
//
//    WebElement HeaderP6 = driver.findElement(By.xpath("//*[@id="app"]/main/div/section[7]/div/div/div[2]/div[1]/div[2]/h2"));
//    var H6 = HeaderP6.getText().trim();
//    assertEquals("Пробовали ли вы диеты? Если да, то с каким опытом столкнулись?", H6);
//    assertTrue(HeaderP6.isDisplayed());
//
//    WebElement q61 = driver.findElement(By.xpath("//*[@id="app"]/main/div/section[7]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
//    var Q61 = q61.getText().trim();
//    assertEquals("Я никогда не сидел на диетах", Q61);
//    assertTrue(q61.isDisplayed());
//
//    WebElement q62 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[7]/div/div/div[2]/div[1]/div[2]/div[2]/label"));
//    var Q62 = q62.getText().trim();
//    assertEquals("Я пробовал диеты, но они не дали результата", Q62);
//    assertTrue(q62.isDisplayed());
//
//    WebElement q63 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[7]/div/div/div[2]/div[1]/div[2]/div[3]/label"));
//    var Q63 = q63.getText().trim();
//    assertEquals("Диеты помогали, но результат быстро возвращался", Q63);
//    assertTrue(q63.isDisplayed());
//
//    WebElement q64 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[7]/div/div/div[2]/div[1]/div[2]/div[4]/label"));
//    var Q64 = q64.getText().trim();
//    assertEquals("Я до сих пор пытаюсь соблюдать диету", Q64);
//    assertTrue(q64.isDisplayed());
//
//    WebElement backP6 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[8]/div/div/div[2]/div[1]/div[3]/button"));
//    backP6.click();
//
//
//}
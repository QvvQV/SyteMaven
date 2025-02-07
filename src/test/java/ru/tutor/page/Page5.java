//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
////package ru.tutor.page;
//
////
//public void ShouldGetFuncFivethPage() {
//
//    WebElement HeaderP5 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[6]/div/div/div[2]/div[1]/div[2]/h2"));
//    var H5 = HeaderP5.getText().trim();
//    assertEquals("Что для вас важнее всего в питании?", H5);
//    assertTrue(HeaderP5.isDisplayed());
//
//    WebElement HeaderP51 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[6]/div/div/div[2]/div[1]/div[2]/p"));
//    var H51 = HeaderP51.getText().trim();
//    assertEquals("Вы можете выбрать несколько вариантов", H51);
//    assertTrue(HeaderP51.isDisplayed());
//
//    WebElement q51 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[6]/div/div/div[2]/div[1]/div[2]/div[1]/label"));
//    var Q51 = q51.getText().trim();
//    assertEquals("Простота и быстрота приготовления", Q51);
//    assertTrue(q51.isDisplayed());
//
//    WebElement q52 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[6]/div/div/div[2]/div[1]/div[2]/div[2]/label"));
//    var Q52 = q52.getText().trim();
//    assertEquals("Вкусные блюда, которые приносят удовольствие", Q52);
//    assertTrue(q52.isDisplayed());
//
//    WebElement q53 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[6]/div/div/div[2]/div[1]/div[2]/div[3]/label"));
//    var Q53 = q53.getText().trim();
//    assertEquals("Экономия на продуктах", Q53);
//    assertTrue(q53.isDisplayed());
//
//    WebElement q54 = driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/section[6]/div/div/div[2]/div[1]/div[2]/div[4]/label"));
//    var Q54 = q54.getText().trim();
//    assertEquals("Максимальная польза для здоровья", Q54);
//    assertTrue(q54.isDisplayed());
//
//
//    WebElement contP5 = driver.findElement(By.xpath("//*[@id="app"]/main/div/section[6]/div/div/div[2]/div[1]/div[3]/button[2]"));
//    contP5.click();
//
//    WebElement backP5 = driver.findElement(By.xpath("//*[@id="app"]/main/div/section[7]/div/div/div[2]/div[1]/div[3]/button"));
//    backP5.click();
//
//
//}

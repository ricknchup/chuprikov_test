package ru.ptqa.pft.webtest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class UntitledTestCase {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new ChromeDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitledTestCase() throws Exception {
    driver.get("https://hr.preprod.iconjob.co/chat");
    driver.findElement(By.id("hrAppRoot")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Диалоги'])[1]/following::span[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Поиск резюме'])[2]/following::input[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Поиск резюме'])[2]/following::div[10]")).click();
    driver.findElement(By.linkText("Работодателям")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Цены'])[1]/following::button[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Работодателям'])[1]/following::span[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Сбросить фильтры'])[1]/following::div[8]")).click();
    driver.findElement(By.linkText("Работодателям")).click();
    driver.findElement(By.linkText("Работодателям")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Цены'])[1]/following::span[2]")).click();
    driver.findElement(By.id("field_id1")).click();
    driver.findElement(By.id("field_id1")).clear();
    driver.findElement(By.id("field_id1")).sendKeys("+7 (999) 888 22 22");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Ваш номер мобильного телефона:'])[1]/following::span[2]")).click();
    driver.findElement(By.id("field_id2")).clear();
    driver.findElement(By.id("field_id2")).sendKeys("1234");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Выслать ещё раз (2:56)'])[1]/following::span[2]")).click();
    driver.findElement(By.name("name")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("dart");
    driver.findElement(By.name("surname")).clear();
    driver.findElement(By.name("surname")).sendKeys("w");
    driver.findElement(By.name("companyName")).clear();
    driver.findElement(By.name("companyName")).sendKeys("ws");
    driver.findElement(By.id("field_id3")).clear();
    driver.findElement(By.id("field_id3")).sendKeys("ws@ws.ru");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Email'])[1]/following::button[1]")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}

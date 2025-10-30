package lesson_09Tests;

import lesson_09.Lesson09;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class Lesson09Tests {
    Lesson09 lesson09 = new Lesson09();
    WebDriver webDriver = lesson09.getWebDriver();

    @Test
    public void checkServiceName() {
        WebElement string = webDriver.findElement(By.xpath("//div[@class='pay__wrapper']/h2"));
        Assertions.assertEquals(string.getText(), "Онлайн пополнение\n" +
                "без комиссии");
        webDriver.quit();
    }

    @Test
    public void checkPayPartners() {
        List<WebElement> list = webDriver.findElements(By.xpath("//div[@class='pay__partners']/ul/li/img"));
        String visa = "Visa";
        String verifiedByVisa = "Verified By Visa";
        String masterCard = "MasterCard";
        String masterCardSecureCode = "MasterCard Secure Code";
        String belCard = "Белкарт";
        Assertions.assertEquals(visa, list.get(0).getAttribute("alt"));
        Assertions.assertEquals(verifiedByVisa, list.get(1).getAttribute("alt"));
        Assertions.assertEquals(masterCard, list.get(2).getAttribute("alt"));
        Assertions.assertEquals(masterCardSecureCode, list.get(3).getAttribute("alt"));
        Assertions.assertEquals(belCard, list.get(4).getAttribute("alt"));
        webDriver.quit();
    }

    @Test
    public void checkLink() {
        String aboutServiceLink = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
        WebElement href = webDriver.findElement(By.xpath("//div[@class='pay__wrapper']/a"));
        href.click();
        Assertions.assertEquals(webDriver.getCurrentUrl(), aboutServiceLink);
        webDriver.quit();
    }

    @Test
    public void checkAddMoneyForm() {
        String rub = "10";
        WebElement phone = webDriver.findElement(By.xpath("//div[@class='input-wrapper input-wrapper_label-left']/input"));
        phone.click();
        phone.sendKeys("297777777");
        WebElement money = webDriver.findElement(By.xpath("//div[@class='input-wrapper input-wrapper_label-right']/input"));
        money.click();
        money.sendKeys(rub);
        WebElement button = webDriver.findElement(By.xpath("//button[@class='button button__default ']"));
        button.click();
        webDriver.quit();
    }
}

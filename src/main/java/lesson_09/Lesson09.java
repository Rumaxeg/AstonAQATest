package lesson_09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Lesson09 {
    WebDriver webDriver;
    String s;
    public Lesson09() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        this.webDriver = new ChromeDriver();
        webDriver.get("https://www.mts.by/");
        webDriver.manage().window().maximize();
        WebElement cookieAccept = webDriver.findElement(By.xpath("//button[@class='btn btn_black cookie__ok']"));
        cookieAccept.click();
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public void execute(){
        webDriver.quit();
    }
}

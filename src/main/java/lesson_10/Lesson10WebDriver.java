package lesson_10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson10WebDriver {

    public WebDriver driver;

    public Lesson10WebDriver(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        driver.manage().window().maximize();
    }

    public WebDriver getDriver() {
        return driver;
    }
}

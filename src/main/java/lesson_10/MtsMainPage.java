package lesson_10;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MtsMainPage {

    public WebDriver webDriver;
    @Getter
    public By cookieOKButton = By.xpath("//button[@class='btn btn_black cookie__ok']");
    @Getter
    public By servicePayName = By.xpath("//div[@class='pay__wrapper']/h2");
    @Getter
    public String servicePayPartners = "//div[@class='pay__partners']/ul/li/img";
    @Getter
    public By serviceLinkAboutService = By.xpath("//div[@class='pay__wrapper']/a");
    @Getter
    public String payValue = "123";
    @Getter
    public String phoneNumber = "297777777";
    @Getter
    public By phoneInputField = By.xpath("//div[@class='input-wrapper input-wrapper_label-left']/input");
    @Getter
    public By moneyInputField = By.xpath("//div[@class='input-wrapper input-wrapper_label-right']/input");
    @Getter
    public By emailInputField = By.xpath("//div[@class='input-wrapper']//input[@id='connection-email']");
    @Getter
    public By continueButton = By.xpath("//form[@id='pay-connection']//button[@class='button button__default ']");
    @Getter
    public String aboutServiceLink = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
    @Getter
    public String payFrame = "//iframe[@class='bepaid-iframe']";
    @Getter
    public By selectButton = By.xpath("//div[@class='select__wrapper']/button");
    @Getter
    public String choiceInternet = "//ul[@class='select__list']/li/p[text()='Домашний интернет']";
    @Getter
    public String choiceInstallment = "//ul[@class='select__list']/li/p[text()='Рассрочка']";
    @Getter
    public String choiceDebt = "//ul[@class='select__list']/li/p[text()='Задолженность']";
    @Getter
    public By frameNumber = By.xpath("//div[@class='pay-description__text']/span");

    public MtsMainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public MtsMainPage typePhone(String phone) {
        webDriver.findElement(phoneInputField).sendKeys(phone);
        return this;
    }

    public MtsMainPage typeMoneyValue(String value) {
        webDriver.findElement(moneyInputField).sendKeys(value);
        return this;
    }

    public MtsMainPage choiceSelect(String value) {
        webDriver.findElement(selectButton).click();
        webDriver.findElement(By.xpath(value)).click();
        return this;
    }

    public MtsMainPage switchFrame() {
        WebDriverWait wait = new WebDriverWait(webDriver, 15L);
        WebElement el = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(payFrame)));
        webDriver.switchTo().frame(el);
        return this;
    }

}

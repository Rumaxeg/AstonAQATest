package lesson_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Steps {

    public WebDriver webDriver;
    public MtsMainPage mtsMainPage;

    public Steps(MtsMainPage page) {
        this.mtsMainPage = page;
        this.webDriver = page.webDriver;
    }

    public void cookieAcept() {
        webDriver.findElement(mtsMainPage.cookieOKButton).click();
    }

    public String getServiceName() {
        return webDriver.findElement(mtsMainPage.servicePayName).getText();
    }

    public List<WebElement> getPartnersList() {
        return webDriver.findElements(By.xpath(mtsMainPage.servicePayPartners));
    }

    public String getLink() {
        webDriver.findElement(mtsMainPage.serviceLinkAboutService).click();
        return webDriver.getCurrentUrl();
    }

    public void payFormContinueButtonClick() {
        webDriver.findElement(mtsMainPage.continueButton).click();
    }

    public void typePayForm() {
        mtsMainPage.typePhone(mtsMainPage.phoneNumber).typeMoneyValue(mtsMainPage.payValue);
    }

    public String matcher(String text) {
        Pattern pattern = Pattern.compile("(\\d+\\.\\d{2})\\s+BYN");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            String amount = matcher.group();
            return amount;
        }
        return null;
    }

}

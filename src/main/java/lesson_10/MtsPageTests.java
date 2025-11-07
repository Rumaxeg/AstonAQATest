package lesson_10;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

public class MtsPageTests {

    public Lesson10WebDriver wb = new Lesson10WebDriver();
    public WebDriver webDriver = wb.getDriver();
    public MtsMainPage mtsMainPage = new MtsMainPage(webDriver);
    public Steps steps = new Steps(mtsMainPage);

    @BeforeEach
    public void cookieacept() {
        steps.cookieAcept();
    }

    @AfterEach
    public void execute() {
        webDriver.quit();
    }

    @Test
    public void checkServiceName() {
        Assertions.assertEquals("Онлайн пополнение\n" +
                "без комиссии", steps.getServiceName());
    }

    @Test
    public void checkPayPartners() {
        List<WebElement> list = steps.getPartnersList();
        Assertions.assertTrue(list.get(0).isDisplayed());
        Assertions.assertTrue(list.get(1).isDisplayed());
        Assertions.assertTrue(list.get(2).isDisplayed());
        Assertions.assertTrue(list.get(3).isDisplayed());
        Assertions.assertTrue(list.get(4).isDisplayed());
    }

    @Test
    public void checkLink() {
        Assertions.assertEquals(mtsMainPage.aboutServiceLink, steps.getLink());
    }

    @Test
    public void checkAddMoneyForm() {
        steps.typePayForm();
        steps.payFormContinueButtonClick();
    }

    @Test
    public void checkPhonePlaceholder() {
        Assertions.assertEquals("Номер телефона", webDriver.findElement(By.xpath("//input[@id='connection-phone']")).getAttribute("placeholder"));
        Assertions.assertEquals("Сумма", webDriver.findElement(By.xpath("//input[@id='connection-sum']")).getAttribute("placeholder"));
        Assertions.assertEquals("E-mail для отправки чека", webDriver.findElement(By.xpath("//input[@id='connection-email']")).getAttribute("placeholder"));
    }

    @Test
    public void checkHomeInternetPlaceholder() {
        mtsMainPage.choiceSelect(mtsMainPage.choiceInternet);
        Assertions.assertEquals("Номер абонента", webDriver.findElement(By.xpath("//input[@id='internet-phone']")).getAttribute("placeholder"));
        Assertions.assertEquals("Сумма", webDriver.findElement(By.xpath("//input[@id='internet-sum']")).getAttribute("placeholder"));
        Assertions.assertEquals("E-mail для отправки чека", webDriver.findElement(By.xpath("//input[@id='internet-email']")).getAttribute("placeholder"));
    }

    @Test
    public void checkHomeInstallmentPlaceholder() {
        mtsMainPage.choiceSelect(mtsMainPage.choiceInstallment);
        Assertions.assertEquals("Номер счета на 44", webDriver.findElement(By.xpath("//input[@id='score-instalment']")).getAttribute("placeholder"));
        Assertions.assertEquals("Сумма", webDriver.findElement(By.xpath("//input[@id='instalment-sum']")).getAttribute("placeholder"));
        Assertions.assertEquals("E-mail для отправки чека", webDriver.findElement(By.xpath("//input[@id='instalment-email']")).getAttribute("placeholder"));
    }

    @Test
    public void checkHomeDebtPlaceholder() {
        mtsMainPage.choiceSelect(mtsMainPage.choiceDebt);
        Assertions.assertEquals("Номер счета на 2073", webDriver.findElement(By.xpath("//input[@id='score-arrears']")).getAttribute("placeholder"));
        Assertions.assertEquals("Сумма", webDriver.findElement(By.xpath("//input[@id='arrears-sum']")).getAttribute("placeholder"));
        Assertions.assertEquals("E-mail для отправки чека", webDriver.findElement(By.xpath("//input[@id='arrears-email']")).getAttribute("placeholder"));
    }

    @Test
    public void checkPayFrameMoney() {
        steps.typePayForm();
        steps.payFormContinueButtonClick();
        mtsMainPage.switchFrame();
        WebDriverWait wait = new WebDriverWait(webDriver, 15L);
        String moneyInserted = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='ng-star-inserted']"))).getText();
        String moneyButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='colored disabled']/span"))).getText();
        String moneyFutter = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='card-page__agreement ng-star-inserted']/span"))).getText();
        Assertions.assertEquals(mtsMainPage.payValue + ".00 BYN", moneyInserted);
        Assertions.assertEquals("Оплатить " + mtsMainPage.payValue + ".00 BYN", moneyButton);
        Assertions.assertEquals(mtsMainPage.payValue + ".00 BYN", steps.matcher(moneyFutter));
    }

    @Test
    public void checkPayFramePlaceHolders() {
        steps.typePayForm();
        steps.payFormContinueButtonClick();
        mtsMainPage.switchFrame();
        WebDriverWait wait = new WebDriverWait(webDriver, 15L);
        String cardNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='ng-tns-c2312288139-3 ng-star-inserted']"))).getText();
        String cardDate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='ng-tns-c2312288139-6 ng-star-inserted']"))).getText();
        String cardCVC = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='ng-tns-c2312288139-7 ng-star-inserted']"))).getText();
        String cardFIO = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='ng-tns-c2312288139-5 ng-star-inserted']"))).getText();
        Assertions.assertEquals("Номер карты", cardNumber);
        Assertions.assertEquals("Срок действия", cardDate);
        Assertions.assertEquals("CVC", cardCVC);
        Assertions.assertEquals("Имя и фамилия на карте", cardFIO);
    }

    @Test
    public void checkPayFrameDinamicPartners() {
        steps.typePayForm();
        steps.payFormContinueButtonClick();
        mtsMainPage.switchFrame();
        WebDriverWait wait = new WebDriverWait(webDriver, 15L);
        WebElement elementMir = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='assets/images/payment-icons/card-types/mir-system-ru.svg']")));
        WebElement elementMaestro = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='assets/images/payment-icons/card-types/maestro-system.svg']")));
        Assertions.assertTrue(elementMir.isDisplayed());
        Assertions.assertTrue(elementMaestro.isDisplayed());
    }

    @Test
    public void checkPayFrameStaticPartners() {
        steps.typePayForm();
        steps.payFormContinueButtonClick();
        mtsMainPage.switchFrame();
        WebDriverWait wait = new WebDriverWait(webDriver, 15L);
        WebElement visaElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='assets/images/payment-icons/card-types/visa-system.svg']")));
        WebElement mastercardElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='assets/images/payment-icons/card-types/mastercard-system.svg']")));
        WebElement belkartElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='assets/images/payment-icons/card-types/belkart-system.svg']")));
        Assertions.assertTrue(visaElement.isDisplayed());
        Assertions.assertTrue(mastercardElement.isDisplayed());
        Assertions.assertTrue(belkartElement.isDisplayed());
    }

    @Test
    public void checkPayFramePhoneNumber() {
        steps.typePayForm();
        steps.payFormContinueButtonClick();
        mtsMainPage.switchFrame();
        WebDriverWait wait = new WebDriverWait(webDriver, 15L);
        String phoneNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(mtsMainPage.frameNumber)).getText();
        Assertions.assertEquals("375" + mtsMainPage.phoneNumber, phoneNumber.replaceAll("\\D+", ""));
    }
}

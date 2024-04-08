package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;

    public HomePage (WebDriver driver) {this.driver = driver;}

    public String verifyHomePage() { return driver.getTitle();}

    public void homePageButton(){

        Duration timeout = Duration.ofMinutes(1); // Așteaptă 1 minut
        long timeoutSeconds = timeout.getSeconds();
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("nav-link")));

        WebElement homePageButton = driver.findElement(By.className("nav-link"));
        homePageButton.click();

    }




}

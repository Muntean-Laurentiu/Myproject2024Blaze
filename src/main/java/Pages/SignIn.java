package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn {
    private WebDriver driver;

    public SignIn(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLogIn(){
        WebElement buttonLogin = driver.findElement(By.xpath("//*[@id=\"login2\"]"));
        buttonLogin.click();
    }

    public void verifyLogInFormIsVisible() {
        WebElement logExist = driver.findElement(By.id("logInModalLabel"));
        logExist.isDisplayed();

    }


}
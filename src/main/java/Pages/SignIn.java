package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn {
    private WebDriver driver;

    public SignIn(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLogIn() {
        WebElement buttonLogin = driver.findElement(By.xpath("//*[@id=\"login2\"]"));
        buttonLogin.click();
    }

    public void verifyLogInFormIsVisible() {
        WebElement logExist = driver.findElement(By.id("logInModalLabel"));
        logExist.isDisplayed();

    }

    public void signInBasicInfo(String username, String password) {
        WebElement username_locator = driver.findElement(By.id("loginusername"));
        WebElement password_locator = driver.findElement(By.id("loginpassword"));
        username_locator.sendKeys(username);
        password_locator.sendKeys(password);

    }

    public void clickPopUpLogIn() {
        WebElement buttonLogin2 = driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
        buttonLogin2.click();
    }

    public void verifyUserNameIsVisible() {
        WebElement signExist = driver.findElement(By.id("nameofuser"));
        signExist.isDisplayed();
    }

    public void clickLogOut() {
        WebElement buttonLogOut = driver.findElement(By.id("logout2"));
        buttonLogOut.click();
    }

    public void verifyLoInIsVisible() {
        WebElement login2gnExist = driver.findElement(By.id("login2"));
        login2gnExist.isDisplayed();
    }

    public void clickSignUp() {
        WebElement buttonSignUp = driver.findElement(By.id("signin2"));
        buttonSignUp.click();
    }

    public void verifySignUpFormIsVisible() {
        WebElement signExist = driver.findElement(By.id("signInModalLabel"));
        signExist.isDisplayed();

    }

    public void signUpBasicInfo(String username2, String password2) {
        WebElement username2_locator = driver.findElement(By.id("sign-username"));
        WebElement password2_locator = driver.findElement(By.id("sign-password"));
        username2_locator.sendKeys(username2);
        password2_locator.sendKeys(password2);
    }

    public void clickPopUpSignUp() {
        WebElement buttonSignUp = driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]"));
        buttonSignUp.click();
        //driver.switchTo().alert().accept();
    }

}
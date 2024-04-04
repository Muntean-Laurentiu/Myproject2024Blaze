package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;

    public HomePage (WebDriver driver) {this.driver = driver;}

    public String verifyHomePage() { return driver.getTitle();}

    public void homePageButton(){
        WebElement homePageButton = driver.findElement(By.className("nav-link"));
        homePageButton.click();

    }




}

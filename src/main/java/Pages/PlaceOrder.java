package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PlaceOrder {
    private WebDriver driver;

    public PlaceOrder (WebDriver driver) {this.driver = driver;}



    public void clickPlaceOrderButton(){
        WebElement PlaceOrderButton = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button"));
        PlaceOrderButton.click();
    }

    public void verifyPlaceOrderFormIsVisible() {
        WebElement placeOrder = driver.findElement(By.id("orderModalLabel"));
        placeOrder.isDisplayed();

    }

    public void completeName (String name){
        WebElement name_locator = driver.findElement(By.id("name"));
        name_locator.sendKeys(name);

    }

    public void completeCountry (String country){
        WebElement country_locator = driver.findElement(By.id("country"));
        country_locator.sendKeys(country);
    }

    public void completeCity (String city){
        WebElement city_locator = driver.findElement(By.id("city"));
        city_locator.sendKeys(city);

    }

    public void completeCreditCard (String creditCard){
        WebElement creditCard_locator = driver.findElement(By.id("card"));
        creditCard_locator.sendKeys(creditCard);

    }

    public void completeMonth (String month){
        WebElement month_locator = driver.findElement(By.id("month"));
        month_locator.sendKeys(month);

    }

    public void completeYear (String year){
        WebElement year_locator = driver.findElement(By.id("year"));
        year_locator.sendKeys(year);

    }

    public void clickPurchaseButton(){
        WebElement PurchaseButton = driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]"));
        PurchaseButton.click();
    }

    public void verifySweetAlertVisible() {
        WebElement SweetAler = driver.findElement(By.className("sa-placeholder"));
        SweetAler.isDisplayed();
        System.out.println("Thank you for your purchase! ");

    }

    public void clickOkAlertButton(){
        WebElement OkAlertButton = driver.findElement(By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > div.sa-button-container > div > button"));
        OkAlertButton.click();
    }


}

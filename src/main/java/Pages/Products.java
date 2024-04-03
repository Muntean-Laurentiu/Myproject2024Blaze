package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Products {

    private WebDriver driver;

    public Products (WebDriver driver) {this.driver = driver;}

    public void clickCategoriesButton(){
        WebElement categoriesButton = driver.findElement(By.id("cat"));
        categoriesButton.click();

    }

    public void clickMonitorButton(){
        WebElement monitorButton = driver.findElement(By.xpath("//*[@id=\"itemc\"]"));
        monitorButton.click();

    }
    public void verifyManyProductsAreDisplayed() {
        List<WebElement> products_searched = driver.findElements(By.xpath("//*[@id=\"tbodyid\"]/div[1]"));
        if (products_searched.size()>1) {
            System.out.println("Avem mai multe produse cautate");
        }
        else assert false;
    }

}

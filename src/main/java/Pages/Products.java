package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Products {

    private WebDriver driver;

    public Products (WebDriver driver) {this.driver = driver;}

    public void clickCategoriesButton(){
        WebElement categoriesButton = driver.findElement(By.id("cat"));
        categoriesButton.click();

    }

    public void clickMonitorButton(){

        Duration timeout = Duration.ofMinutes(1); // Așteaptă 1 minut
        long timeoutSeconds = timeout.getSeconds();
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div/div[1]/div/a[4]")));

        WebElement monitorButton = driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/a[4]"));
        monitorButton.click();

    }
    public void verifyManyProductsAreDisplayed() {
        List<WebElement> products_searched = driver.findElements(By.className("div.col-lg-9"));
        if (products_searched.size()>1) {
            System.out.println("Avem mai multe produse cautate");
        }
        else assert false;
    }

    public void clickLaptopsButton(){

        Duration timeout = Duration.ofMinutes(1); // Așteaptă 1 minut
        long timeoutSeconds = timeout.getSeconds();
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div/div[1]/div/a[3]")));

        WebElement LaptopsButton = driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/a[3]"));
        LaptopsButton.click();
    }

    public void clickSonyI5Product(){

        Duration timeout = Duration.ofMinutes(1); // Așteaptă 1 minut
        long timeoutSeconds = timeout.getSeconds();
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")));

        WebElement sonyVaioI5 = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a"));
        sonyVaioI5.click();
    }

    public void addToCart(){

        Duration timeout = Duration.ofMinutes(1); // Așteaptă 1 minut
        long timeoutSeconds = timeout.getSeconds();
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")));

        WebElement AddToCartButton = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a"));
        AddToCartButton.click();
    }

    public void clickAsusProduct(){

        Duration timeout = Duration.ofMinutes(1); // Așteaptă 1 minut
        long timeoutSeconds = timeout.getSeconds();
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/div/h4/a")));

        WebElement asusFullHD = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/div/h4/a"));
        asusFullHD.click();
    }

    public void cartButton(){

        Duration timeout = Duration.ofMinutes(1); // Așteaptă 1 minut
        long timeoutSeconds = timeout.getSeconds();
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cartur")));

        WebElement cartButton = driver.findElement(By.id("cartur"));
        cartButton.click();
    }

    public int numberOfProductsInCart(){
        List<WebElement> productsInCart = driver.findElements(By.className("success"));
        return productsInCart.size();
    }

    public List<String> getprice1() {
        List<WebElement> prices = driver.findElements(By.cssSelector("#tbodyid > tr:nth-child(1) > td:nth-child(3)"));
        List<String> priceValues = new ArrayList<>();
        for (WebElement price : prices) {
            priceValues.add(price.getText());
        }
        return priceValues;
    }

    public List<String> getprice2() {
        List<WebElement> prices = driver.findElements(By.cssSelector("#tbodyid > tr:nth-child(2) > td:nth-child(3)"));
        List<String> priceValues = new ArrayList<>();
        for (WebElement price : prices) {
            priceValues.add(price.getText());
        }
        return priceValues;
    }

    public List<Integer> formatPrices() {
        List<String> listaStringuri;
        List<Integer> listaNumere = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\d+");// "\\d+" <= asta cauta numere (decimal)
        for (String str : getprice1()) {
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()) {
                listaNumere.add(Integer.parseInt(matcher.group()));
            }
        }
        for (String str : getprice2()) {
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()) {
                listaNumere.add(Integer.parseInt(matcher.group()));
            }
        }
        return listaNumere;

    }


    public void pretTotalCos( ){
        List<Integer> preturiProduse = formatPrices();
        Integer sum_total = preturiProduse.get(0) + preturiProduse.get(1);
        System.out.println(sum_total);
    }

    public void clickPlaceOrderButton(){
        WebElement PlaceOrderButton = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button"));
        PlaceOrderButton.click();
    }

    public void verifyPlaceOrderFormIsVisible() {
        WebElement PlaceOrderForm = driver.findElement(By.id("signInModalLabel"));
        PlaceOrderForm.isDisplayed();
    }


    public void emptyCart1(){

        Duration timeout = Duration.ofMinutes(1); // Așteaptă 1 minut
        long timeoutSeconds = timeout.getSeconds();
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#tbodyid > tr:nth-child(2) > td:nth-child(4) > a")));

        WebElement delete = driver.findElement(By.cssSelector("#tbodyid > tr:nth-child(2) > td:nth-child(4) > a"));
        delete.click();

    }


    public void emptyCart2(){

        Duration timeout = Duration.ofMinutes(1); // Așteaptă 1 minut
        long timeoutSeconds = timeout.getSeconds();
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[6]/div/div[1]/div/table/tbody/tr/td[4]/a")));

        WebElement delete2 = driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div/table/tbody/tr/td[4]/a"));
        delete2.click();

    }


}




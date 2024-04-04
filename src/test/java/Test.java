import Pages.HomePage;
import Pages.Products;
import Pages.SignIn;
import org.testng.Assert;

public class Test extends BaseTest {

    @org.testng.annotations.Test
    public void checkTitlePage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        System.out.println(homePage.verifyHomePage());
        Thread.sleep(2000);
        Assert.assertEquals(homePage.verifyHomePage(), "STORE");

        Thread.sleep(2000);
    }

    //@org.testng.annotations.Test
    //public void checkMonitorPage() throws InterruptedException {
        //Products products = new Products(driver);
        //products.clickMonitorButton();
        //Thread.sleep(2000);
        //products.verifyManyProductsAreDisplayed();


        //Thread.sleep(5000);
    //}


    @org.testng.annotations.Test
    public void SignUpTest() throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        System.out.println(homePage.verifyHomePage());
        Thread.sleep(1000);
        SignIn signIn = new SignIn(driver);
        Thread.sleep(1500);
        signIn.clickSignUp();
        signIn.verifySignUpFormIsVisible();
        Thread.sleep(1000);
        signIn.signUpBasicInfo("Laurentiu Mikailo", "Blaze25");
        Thread.sleep(1500);
        signIn.clickPopUpSignUp();
        Thread.sleep(1000);
        driver.switchTo().alert().accept(); // for popUp allerts


        Thread.sleep(6000);

    }


    @org.testng.annotations.Test
    public void LogInTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        System.out.println(homePage.verifyHomePage());
        Thread.sleep(1000);
        SignIn signIn = new SignIn(driver);
        Thread.sleep(1500);
        signIn.clickLogIn();
        Thread.sleep(1000);
        signIn.verifyLogInFormIsVisible();
        Thread.sleep(1000);
        signIn.signInBasicInfo("Laurentiu Vasile","Blaze25");
        Thread.sleep(1500);
        signIn.clickPopUpLogIn();
        signIn.verifyUserNameIsVisible();
        Thread.sleep(2500);
        signIn.clickLogOut();
        signIn.verifyLoInIsVisible();


        Thread.sleep(5000);

    }

    @org.testng.annotations.Test
    public void addToCartTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        System.out.println(homePage.verifyHomePage());
        Thread.sleep(1000);
        Products products = new Products(driver);
        Thread.sleep(1000);
        products.clickLaptopsButton();
        Thread.sleep(1000);

        //products.verifyManyProductsAreDisplayed();

        products.clickSonyI5Product();
        Thread.sleep(1500);
        products.addToCart();
        Thread.sleep(1500);
        driver.switchTo().alert().accept(); // for popUp allerts
        Thread.sleep(1500);
        homePage.homePageButton();
        Thread.sleep(500);
        products.clickMonitorButton();
        Thread.sleep(1000);
        products.clickAsusProduct();
        Thread.sleep(1000);
        products.addToCart();
        Thread.sleep(1000);
        driver.switchTo().alert().accept(); // for popUp allerts
        Thread.sleep(1500);
        homePage.homePageButton();
        Thread.sleep(1000);
        products.cartButton();
        Thread.sleep(2000);
        System.out.println("Numarul de produse din cos: ");
        System.out.println(products.numberOfProductsInCart());
        Assert.assertEquals(products.numberOfProductsInCart(),2);
        Thread.sleep(1500);
        System.out.println("Pretul produselor din cos: ");
        System.out.println(products.getprice1());
        System.out.println(products.getprice2());

        // products.pretTotalCos();




        Thread.sleep(5000);
    }



}

import Pages.HomePage;
import Pages.PlaceOrder;
import Pages.Products;
import Pages.SignIn;
import org.testng.Assert;

public class Test extends BaseTest {

    @org.testng.annotations.Test
    public void tc00CheckTitlePage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);  //declar de unde se preiau sriturile
        System.out.println("TC 00 ");
        System.out.println(homePage.verifyHomePage());
        Thread.sleep(2000);
        Assert.assertEquals(homePage.verifyHomePage(), "STORE");

        Thread.sleep(2000);
    }


    @org.testng.annotations.Test
    public void tc01SignUpTest() throws InterruptedException{
        HomePage homePage = new HomePage(driver);  //declar de unde se preiau sriturile
        System.out.println("TC 01 ");
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
        driver.switchTo().alert().accept(); // for popUp alerts


        Thread.sleep(5000);

    }

    @org.testng.annotations.Test
    public void tc02LogInTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver);  //declar de unde se preiau sriturile
        System.out.println("TC 02 ");
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
    public void tc03AddToCartTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        System.out.println("TC 03 ");
        System.out.println(homePage.verifyHomePage());
        Thread.sleep(1000);
        Products products = new Products(driver); //declar de unde se preiau sriturile

        Thread.sleep(2000);
        products.clickLaptopsButton();
        Thread.sleep(1000);

        //products.verifyManyProductsAreDisplayed();

        products.clickSonyI5Product();
        Thread.sleep(1500);
        products.addToCart();
        Thread.sleep(1500);
        driver.switchTo().alert().accept(); // for popUp alerts
        Thread.sleep(1500);
        homePage.homePageButton();
        Thread.sleep(500);
        products.clickMonitorButton();
        Thread.sleep(1000);
        products.clickAsusProduct();
        Thread.sleep(1000);
        products.addToCart();
        Thread.sleep(1000);
        driver.switchTo().alert().accept(); // for popUp alerts
        Thread.sleep(1500);
        homePage.homePageButton();
        Thread.sleep(1000);
        products.cartButton();
        Thread.sleep(2000);
        System.out.println("Numarul de produse din cos: ");
        System.out.println(products.numberOfProductsInCart());
        Assert.assertEquals(products.numberOfProductsInCart(), 2);
        Thread.sleep(1500);
        System.out.println("Pretul produselor din cos: ");
        System.out.println(products.getprice1());
        System.out.println(products.getprice2());
        System.out.println(products.formatPrices());
        System.out.println("Pretul total al produselor din cos: ");
        products.pretTotalCos();


        Thread.sleep(5000);

    }



    @org.testng.annotations.Test
    public void tc04PlaceOrderTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        System.out.println("TC 04 ");
        System.out.println(homePage.verifyHomePage());
        Thread.sleep(1000);

        Products products = new Products(driver); //declar de unde se preiau sriturile

        PlaceOrder placeOrder = new PlaceOrder(driver); //declar de unde se preiau sriturile

        Thread.sleep(2000);
        products.clickLaptopsButton();
        Thread.sleep(1000);

        //products.verifyManyProductsAreDisplayed();

        products.clickSonyI5Product();
        Thread.sleep(1500);
        products.addToCart();
        Thread.sleep(1500);
        driver.switchTo().alert().accept(); // for popUp alerts
        Thread.sleep(1500);
        homePage.homePageButton();
        Thread.sleep(500);
        products.clickMonitorButton();
        Thread.sleep(1000);
        products.clickAsusProduct();
        Thread.sleep(1000);
        products.addToCart();
        Thread.sleep(1000);
        driver.switchTo().alert().accept(); // for popUp alerts
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
        System.out.println(products.formatPrices());
        System.out.println("Pretul total al produselor din cos: ");
        products.pretTotalCos();
        placeOrder.clickPlaceOrderButton();
        placeOrder.verifyPlaceOrderFormIsVisible();
        Thread.sleep(1500);
        placeOrder.completeName("Laurentiu");
        placeOrder.completeCountry("Romania");
        placeOrder.completeCity("Brasov");
        placeOrder.completeCreditCard("563278959963");
        placeOrder.completeMonth("05");
        placeOrder.completeYear("2024");
        Thread.sleep(1000);
        placeOrder.clickPurchaseButton();
        placeOrder.verifySweetAlertVisible();
        Thread.sleep(1000);
        placeOrder.clickOkAlertButton();



        Thread.sleep(5000);
    }


}

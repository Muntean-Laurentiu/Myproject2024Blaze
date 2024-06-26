import Pages.HomePage;
import Pages.PlaceOrder;
import Pages.Products;
import Pages.SignIn;
import org.testng.Assert;

public class Test extends BaseTest {

    @org.testng.annotations.Test
    public void tc00CheckTitlePage() throws InterruptedException {
        HomePage homePage = new HomePage(driver);  //declar de unde se preiau scriturile
        System.out.println("TC 00 ");
        System.out.println(homePage.verifyHomePage());
        Thread.sleep(2000);
        Assert.assertEquals(homePage.verifyHomePage(), "STORE");
        System.out.println("Ok");

        Thread.sleep(500);
    }


    @org.testng.annotations.Test
    public void tc01SignUpTest() throws InterruptedException{
        HomePage homePage = new HomePage(driver);  //declar de unde se preiau scriturile
        System.out.println("TC 01 ");
        System.out.println(homePage.verifyHomePage());
        System.out.println("Ok");
        Thread.sleep(1000);
        SignIn signIn = new SignIn(driver);
        signIn.clickSignUp();
        signIn.verifySignUpFormIsVisible();
        Thread.sleep(500);
        signIn.signUpBasicInfo("Laurentiu Mitrailo", "Blaze25");
        signIn.clickPopUpSignUp();
        Thread.sleep(1000);
        driver.switchTo().alert().accept(); // for popUp alerts


        Thread.sleep(1000);
    }

    @org.testng.annotations.Test
    public void tc02LogInTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver);  //declar de unde se preiau scriturile
        System.out.println("TC 02 ");
        System.out.println(homePage.verifyHomePage());
        System.out.println("Ok");
        Thread.sleep(500);
        SignIn signIn = new SignIn(driver);
        signIn.clickLogIn();
        signIn.verifyLogInFormIsVisible();
        signIn.signInBasicInfo("Laurentiu Vasile","Blaze25");
        signIn.clickPopUpLogIn();
        signIn.verifyUserNameIsVisible();
        System.out.println("Welcome Laurentiu Vasile");
        signIn.clickLogOut();
        signIn.verifyLoInIsVisible();


        Thread.sleep(2000);
    }

    @org.testng.annotations.Test
    public void tc03AddToCartTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        System.out.println("TC 03 ");
        System.out.println(homePage.verifyHomePage());
        System.out.println("Ok");
        Thread.sleep(500);
        Products products = new Products(driver); //declar de unde se preiau scriturile
        products.clickLaptopsButton();
        Thread.sleep(500);
        products.clickSonyI5Product();
        products.addToCart();
        Thread.sleep(500);
        driver.switchTo().alert().accept(); // for popUp alerts
        homePage.homePageButton();
        products.clickMonitorButton();
        Thread.sleep(500);
        products.clickAsusProduct();
        products.addToCart();
        Thread.sleep(500);
        driver.switchTo().alert().accept(); // for popUp alerts
        homePage.homePageButton();
        products.cartButton();
        Thread.sleep(1000);
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
        products.emptyCart1();
        products.emptyCart2();
        Thread.sleep(500);
        homePage.homePageButton();


        Thread.sleep(2000);
    }
    
    @org.testng.annotations.Test
    public void tc04PlaceOrderTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        System.out.println("TC 04 ");
        System.out.println(homePage.verifyHomePage());
        System.out.println("Ok");
        Thread.sleep(1000);

        Products products = new Products(driver); //declar de unde se preiau scriturile

        PlaceOrder placeOrder = new PlaceOrder(driver); //declar de unde se preiau sriturile

        products.clickLaptopsButton();
        Thread.sleep(500);
        products.clickSonyI5Product();
        products.addToCart();
        Thread.sleep(500);
        driver.switchTo().alert().accept(); // for popUp alerts
        homePage.homePageButton();
        products.clickMonitorButton();
        Thread.sleep(500);
        products.clickAsusProduct();
        products.addToCart();
        Thread.sleep(500);
        driver.switchTo().alert().accept(); // for popUp alerts
        homePage.homePageButton();
        products.cartButton();
        Thread.sleep(1000);
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
        placeOrder.clickPlaceOrderButton();
        placeOrder.verifyPlaceOrderFormIsVisible();
        placeOrder.completeName("Laurentiu");
        placeOrder.completeCountry("Romania");
        placeOrder.completeCity("Brasov");
        placeOrder.completeCreditCard("563278959963");
        placeOrder.completeMonth("05");
        placeOrder.completeYear("2024");
        placeOrder.clickPurchaseButton();
        placeOrder.verifySweetAlertVisible();
        placeOrder.clickOkAlertButton();


        Thread.sleep(1500);
    }


}
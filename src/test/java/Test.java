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
    public void signInTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        System.out.println(homePage.verifyHomePage());
        Thread.sleep(2000);
        SignIn signIn = new SignIn(driver);
        Thread.sleep(2000);
        signIn.clickLogIn();
        Thread.sleep(5000);
        signIn.verifyLogInFormIsVisible();

    }


}

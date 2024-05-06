package feature;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import task.AddToCartTask;
import task.LoginTask;

import java.util.concurrent.TimeUnit;

public class DemoOrganizeTest {
    private WebDriver driver;
    private LoginTask loginTask;
    private AddToCartTask addToCartTask;
    @BeforeClass
    public void setUp() {
        // Thiết lập WebDriver (trình duyệt Chrome)
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginTask = new LoginTask(driver);
        addToCartTask = new AddToCartTask(driver);
        // Mở trang web
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void testAddToCart(){
        loginTask.with("standard_user", "secret_sauce");
        addToCartTask.addToCart();
        addToCartTask.removeProduct();


    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}


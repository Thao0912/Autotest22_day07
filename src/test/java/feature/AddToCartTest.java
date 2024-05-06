package feature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import task.AddToCartTask;
import task.LoginTask;
import ui.AddToCartPageUI;

import java.util.concurrent.TimeUnit;

public class AddToCartTest {
    public WebDriver driver;
    public LoginTask loginTask = new LoginTask(driver);
    public AddToCartTask addToCart = new AddToCartTask(driver);
    @BeforeClass
    public void setUp() {
        // Thiết lập WebDriver (trình duyệt Chrome)
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginTask = new LoginTask(driver);
        // Mở trang web
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void AddToCartTest() {
        loginTask.with("standard_user", "secret_sauce");
        addToCart.addToCart();
        addToCart.removeProduct();
        //add to cart
        /*WebElement addProduct1 = driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Fleece Jacket')]/ancestor::div[@class='inventory_item_description']/descendant::button"));
        addProduct1.click();
        WebElement addProduct2 = driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Backpack')]/ancestor::div[@class='inventory_item_description']/descendant::button"));
        addProduct2.click();*/
        WebElement expectRm1 = driver.findElement(By.xpath("//span[contains(@class,'shopping_cart_badge')]"));
        String expect1 = expectRm1.getText();
        Assert.assertEquals(expect1,2);
    }
    @AfterClass
    public void tearDown(){
        // Đóng trình duyệt
        driver.quit();
    }
}

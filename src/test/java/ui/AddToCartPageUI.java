package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCartPageUI {
    private final WebDriver driver;

    public AddToCartPageUI(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement addProduct1 (){
        return driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Fleece Jacket')]/ancestor::div[@class='inventory_item_description']/descendant::button"));
    }
    public WebElement addProduct2 (){
        return driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Backpack')]/ancestor::div[@class='inventory_item_description']/descendant::button"));
    }

    public WebElement addProduct3 (){
        return driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Bolt T-Shirt')]/ancestor::div[@class='inventory_item_description']/descendant::button"));
    }

    public WebElement removeProduct1 (){
        return driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Fleece Jacket')]/ancestor::div[@class='inventory_item_description']/descendant::button"));
    }

    /*public WebElement expectRm1 (){
        return driver.findElement(By.xpath("//span[contains(@class,'shopping_cart_badge')]"));
    }*/

}

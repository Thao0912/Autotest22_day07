package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.AddToCartPageUI;
import ui.LoginPageUI;

public class AddToCartTask {
    private final AddToCartPageUI addToCartPageUI;

    public AddToCartTask(WebDriver driver) {
        this.addToCartPageUI = new AddToCartPageUI(driver);
    }

    public void addToCart() {
       addToCartPageUI.addProduct1().click();
       addToCartPageUI.addProduct2().click();
       addToCartPageUI.addProduct3().click();
    }

    public void removeProduct(){
        addToCartPageUI.removeProduct1().click();
    }

}

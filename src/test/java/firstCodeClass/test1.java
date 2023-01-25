package firstCodeClass;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class test1 {
    public static void main(String[] args){
//        System.out.println("hello world");
        System.setProperty("webdriver.chrome.driver", "C:\\browserDrivers\\chromedriver.exe"  );
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        WebElement usernameInput = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));

        usernameInput.sendKeys("standard_user");
        passwordInput.sendKeys("secret_sauce");
        loginButton.click();

/**    Homework 2 - Print all elements
        List<WebElement> items = driver.findElements(By.xpath("//*[@class=\"inventory_item_name\"]"));
        for (int i=0; i<items.size();i++){
            System.out.println("Elemento:" + items.get(i).getText());
        }
**/

/**     Homework 1 - Validate shop car has the right items

        WebElement headerOne = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
        WebElement headerTwo = driver.findElement(By.xpath("//*[@id=\"item_0_title_link\"]/div"));

        String headOne = headerOne.getText();
        String headTwo = headerTwo.getText();

        WebElement addButton = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
        WebElement addButton1 = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]"));
        WebElement shopButton = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));

        addButton.click();
        addButton1.click();
        shopButton.click();

        WebElement headerShopOne = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
        WebElement headerShopTwo = driver.findElement(By.xpath("//*[@id=\"item_0_title_link\"]/div"));

        String headShopOne = headerShopOne.getText();
        String headShopTwo = headerShopTwo.getText();

        Assert.assertEquals(headOne, headShopOne);
        Assert.assertEquals(headTwo, headShopTwo);
**/




//        WebElement headerOne = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
//        Use the code below, to match the expected text of the first item in the shop
//        Assert.assertEquals("Sauce Labs Backpack", headerOne.getText());



        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();


    }
}

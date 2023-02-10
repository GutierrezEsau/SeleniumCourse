package firstCodeClass;

import firstCodeClass.PO.ButtonsPagePo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;

public class Tests {
    private WebDriver driver;
    //Declaring an instance of buttonsPagePo, so that we can use its methods
    ButtonsPagePo buttonsPagePo;
    DriverClass driverClass = new DriverClass();


    @Test //@Test annotation tells selenium that this is an individual test scenario
    public void login() {
        driver.get("https://www.saucedemo.com/");
        buttonsPagePo.fillUserName("standard_user");
        buttonsPagePo.fillPassword("secret_sauce");
        buttonsPagePo.clickLoginButton();
    }

    @Test
    public void clickBurguer(){
        login();
        buttonsPagePo.clickBurgerButton();
        buttonsPagePo.clickAllItems();
    }

    @Before //@Before annotation tells Selenium that this will run before each @Test
    public void iniDriver() {
        driverClass.initDriver();
        driver = driverClass.getDriver();
        buttonsPagePo = new ButtonsPagePo(driver);
    }

    @After //@After annotation tells Selenium that this will run after each @Test
    public void closeBrowser() {
        driverClass.quitBrowser();
    }

    @AfterClass  //@AfterClass annotation tells Selenium that this will at the end of this class
    public static void completeTesting() {
        System.out.println("All tests complete :) ");
    }
}

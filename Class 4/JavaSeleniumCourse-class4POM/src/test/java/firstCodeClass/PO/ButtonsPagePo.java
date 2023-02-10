package firstCodeClass.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ButtonsPagePo {
    //Declaring our WebElements
     private final WebDriver driver;
    public ButtonsPagePo(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this); // Needed to use the @FindByMethods
    }

    @FindBy(id = "user-name")
    WebElement usernameField;
    @FindBy(id = "password")
    WebElement passwordField;
    @FindBy(id = "login-button")
    WebElement loginButton;

    @FindBy(id = "react-burger-menu-btn")
    WebElement burgerButton;
    @FindBy(id = "inventory_sidebar_link")
    WebElement allItemsSideMenuButton;


    public void fillUserName(String text){
        this.usernameField.sendKeys(text);
    }
    public void fillPassword(String text){
        this.passwordField.sendKeys(text);
    }
    public void clickLoginButton(){
        this.loginButton.click();
    }

    public void clickBurgerButton() {
        this.burgerButton.click();
    }

    public void clickAllItems() {
        clickElement(allItemsSideMenuButton);
    }

    public void clickElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

}

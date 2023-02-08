package Class6BDD.PO;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPo {
    private WebDriver driver;

    public LoginPo(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this); // Needed to use the @FindByMethods
    }

    @FindBy(id = "user-name")
    WebElement usernameField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(id = "login-button")
    WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"login_button_container\"]/div/form/div[3]/h3")
    WebElement errorMessage;

    public void fillUserName(String text){
        this.usernameField.sendKeys(text);
    }
    public void fillPassword(String text){
        this.passwordField.sendKeys(text);
    }
    public void clickLoginButton(){
        this.loginButton.click();
    }
    public void errorMessage(){Assert.assertEquals("Epic sadface: Sorry, this user has been locked out.", this.errorMessage.getText());
    }

}

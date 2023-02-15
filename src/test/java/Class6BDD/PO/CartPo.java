package Class6BDD.PO;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPo {
    private WebDriver driver;

    public CartPo(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this); // Needed to use the @FindByMethods
    }

    @FindBy(xpath = "//*[@id=\"item_4_title_link\"]/div")
    WebElement sauceLabsBackPack;

    @FindBy(xpath = "//*[@id=\"continue-shopping\"]")
    WebElement continueShoppingButton;

    public void checkSauceLabsBackPack(String expectedText){
        Assert.assertEquals(expectedText, sauceLabsBackPack.getText());
    }

    public void clickContinueShoppingButton(){
        clickElement(continueShoppingButton);
    }

    public void clickElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

}

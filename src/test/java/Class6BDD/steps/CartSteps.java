package Class6BDD.steps;

import Class6BDD.PO.CartPo;
import Class6BDD.driver.DriverManager;
import io.cucumber.java.en.Then;

public class CartSteps extends DriverManager {
    CartPo cartPo = new CartPo(driver);

    @Then("I check on cart {string}")
    public void iCheckOnCart(String expectedLabel) {
        cartPo.checkSauceLabsBackPack(expectedLabel);
    }

    @Then("I click on Continue Shopping")
    public void iClickOnContinueShopping() {
        cartPo.clickContinueShoppingButton();
    }
}

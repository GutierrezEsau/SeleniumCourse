package Class6BDD.steps;

import Class6BDD.PO.LoginPo;
import Class6BDD.driver.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class LoginSteps extends DriverManager {

    LoginPo loginPo = new LoginPo(driver);

    @And("I fill username {string}")
    public void iFillUsername(String text) {
        loginPo.fillUserName(text);
    }

    @Then("I fill password {string}")
    public void iFillPassword(String text) { loginPo.fillPassword(text);}

    @Then("I click on Login")
    public void IClickLoginButton() {loginPo.clickLoginButton();}

    @Then("I verify error text")
    public void IVerifyErrorMessage() {loginPo.errorMessage();}
}

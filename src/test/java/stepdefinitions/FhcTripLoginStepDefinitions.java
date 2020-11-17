package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.FhcTripLoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class FhcTripLoginStepDefinitions {
    FhcTripLoginPage fhcTripLoginPage=new FhcTripLoginPage();

    @Given("kullanici fhctriplogin sayfasinda")
    public void kullanici_fhctriplogin_sayfasinda() {
        Driver.getDriver().get(ConfigurationReader.getProperty("fhc_login_url"));
    }

    @Given("kullanici gecerli username girer")
    public void kullanici_gecerli_username_girer() {
        fhcTripLoginPage.usernameTextbox.sendKeys(ConfigurationReader.getProperty("gecerli_username"));
    }

    @Given("kullanici gecerli password girer")
    public void kullanici_gecerli_password_girer() {
        fhcTripLoginPage.passwordTextbox.sendKeys(ConfigurationReader.getProperty("gecerli_password"));
    }

    @Given("kullanici login butonuna basar.")
    public void kullanici_login_butonuna_basar() {
        fhcTripLoginPage.loginButon.click();
    }

    @Then("loginin basarili oldugunu dogrula")
    public void loginin_basarili_oldugunu_dogrula() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("ListOfUsers"));
    }

    @Given("user is on the fhctriplogin page")
    public void user_is_on_the_fhctriplogin_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("fhc_login_url"));
    }
    @Given("user enters valid username")
    public void user_enters_valid_username() {
        fhcTripLoginPage.usernameTextbox.sendKeys(ConfigurationReader.getProperty("valid_username"));
    }
    @Given("user enters  valid password")
    public void user_enters_valid_password() {
        fhcTripLoginPage.passwordTextbox.sendKeys(ConfigurationReader.getProperty("valid_password"));
    }
    @Given("user clicks login button")
    public void user_clicks_login_button() {
        fhcTripLoginPage.loginButon.click();
    }
    @Then("verify login is successfull")
    public void verify_login_is_successfull() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("ListOfUsers"));
    }

    @Given("user enters invalid username")
    public void user_enters_invalid_username() {
        fhcTripLoginPage.usernameTextbox.sendKeys(ConfigurationReader.getProperty("gecersiz_username"));
    }

    @Given("user enters  invalid password")
    public void user_enters_invalid_password() {
        fhcTripLoginPage.passwordTextbox.sendKeys(ConfigurationReader.getProperty("gecersiz_password"));

    }

    @Then("verify login is not successfull")
    public void verify_login_is_not_successfull() {
       Assert.assertTrue(fhcTripLoginPage.error_mesaj.isDisplayed());
        System.out.println(fhcTripLoginPage.error_mesaj.getText());
    }

    @Given("user enters valid username {string}")
    public void user_enters_valid_username(String string) {
    fhcTripLoginPage.usernameTextbox.sendKeys(string); //buraya username d eyazilabilir
    }

    @Given("user enters  valid password   {string}")
    public void user_enters_valid_password(String string) {
    fhcTripLoginPage.passwordTextbox.sendKeys(string);
    }

}

package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.FhcRegisterPage;
import pages.FhcTripLoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class FhcRegisterStepDef {

    FhcRegisterPage fhcRegisterPage = new FhcRegisterPage();
    FhcTripLoginPage fhcTripLoginPage = new FhcTripLoginPage();


    @Given("kullanici fc trip sayfasindadir")
    public void kullanici_fc_trip_sayfasindadir() {
        Driver.getDriver().get(ConfigurationReader.getProperty("fhc_login_url"));
    }

    @Given("kullanici create a new account butonuna tiklar")
    public void kullanici_create_a_new_account_butonuna_tiklar() {
        fhcTripLoginPage.createButton.click();

    }

    @Given("kullanici username girer {string}")
    public void kullanici_username_girer(String string) {
        fhcRegisterPage.username.sendKeys(string);
    }

    @Given("kullanici password girer {string}")
    public void kullanici_password_girer(String string) {
        fhcRegisterPage.password.sendKeys(string);
    }

    @Given("kullanici email girer   {string}")
    public void kullanici_email_girer(String string) {
        fhcRegisterPage.mail.sendKeys(string);
    }

    @Given("kullanici fullname girer  {string}")
    public void kullanici_fullname_girer(String string) {
        fhcRegisterPage.fullname.sendKeys(string);
    }

    @Given("kullanici phone girer {string}")
    public void kullanici_phone_girer(String string) {
        fhcRegisterPage.phone.sendKeys(string);
    }

    @Given("kullanici SSN girer  {string}")
    public void kullanici_SSN_girer(String string) {
        fhcRegisterPage.ssnumber.sendKeys(string);
    }

    @Given("kullanici Driven lisans girer {string}")
    public void kullanici_Driven_lisans_girer(String string) {
        fhcRegisterPage.drivingLicense.sendKeys(string);
    }

    @Given("kullanici country dropdown secer {string}")
    public void kullanici_country_dropdown_secer(String string) {
        Select country = new Select(fhcRegisterPage.Country);
        country.selectByVisibleText(string);
    }

    @Given("kullanici state dropdown secer {string}")
    public void kullanici_state_dropdown_secer(String string) {
        Select state = new Select(fhcRegisterPage.state);
        state.selectByVisibleText(string);
    }

    @Given("kullanici adress girer {string}")
    public void kullanici_adress_girer(String string) {
        fhcRegisterPage.address.sendKeys(string);
    }

    @Given("kullanici working sector girer {string}")
    public void kullanici_working_sector_girer(String string) {
        fhcRegisterPage.sector.sendKeys(string);
    }

    @Given("kullanici birthday girer  {string}")
    public void kullanici_birthday_girer(String string) {
        fhcRegisterPage.birtdate.sendKeys(string);
    }

    @And("save butonuna tiklar")
    public void save_butonuna_tiklar() {
        fhcRegisterPage.saveButton.click();
    }
    @Given("succes mesaji goruntulenir")
    public void succes_mesaji_goruntulenir() {
        Assert.assertTrue(fhcRegisterPage.successfullyMessage.isDisplayed());
    }

    @Then("alert ok butonuna tiklar")
    public void alert_ok_butonuna_tiklar() {
       
    }



}
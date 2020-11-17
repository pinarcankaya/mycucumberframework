package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.FhcTripLoginPage;
import pages.GooglePage;
import utilities.ConfigurationReader;
import utilities.Driver;
public class GoogleSearchStepDefinitions {
    GooglePage googlePage = new GooglePage();
    FhcTripLoginPage fhcTripLoginPage=new FhcTripLoginPage();
    @Given("user is in the google page    \\/\\/kullanici google sayfasinda")
    public void user_is_in_the_google_page_kullanici_google_sayfasinda() {
       Driver.getDriver().get(ConfigurationReader.getProperty("google_search_url"));
    }

    @Given("user searches teapod")
    public void user_searches_teapod() {
    googlePage.searchBox.sendKeys("teapot");
    googlePage.searchBox.submit();
    }

    @Then("verify result has teapot")
    public void verify_result_has_teapot() {
    Assert.assertTrue(Driver.getDriver().getTitle().contains("teapot"));
    }

    @Given("user searches nokia")
    public void user_searches_nokia() {
        googlePage.searchBox.sendKeys("nokia"+ Keys.ENTER);

    }

    @Then("verify result has nokia")
    public void verify_result_has_nokia() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("nokia"));

    }
    @Given("user is in the google page")
    public void user_is_in_the_google_page() {
        Driver.getDriver().get("https://www.google.com");
    }

    @Given("user searches iphone {string}")
    public void user_searches_iphone(String string) {
       googlePage.searchBox.sendKeys(string+Keys.ENTER);
       // googlePage.searchBox.submit();bu da yazilabilir
    }

    @Then("verify result has iphone {string}")
    public void verify_result_has_iphone(String string) {
        String title=Driver.getDriver().getTitle();
        System.out.println("Title :" +title);
        Assert.assertTrue(title.contains(string));
    }



}
package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AutomationPracticePage;
import utilities.ConfigurationReader;
import utilities.Driver;

import javax.swing.*;

public class AutomationPracticeStepDef {

    AutomationPracticePage automationPracticePage = new AutomationPracticePage();
    Faker faker = new Faker();
    String firstnameGenel;
    String lastnameGenel;
    Actions action=new Actions(Driver.getDriver());

    @Given("Otomasyon Adimlari:Given user web sayfasinda")
    public void otomasyon_Adimlari_Given_user_web_sayfasinda() {
        Driver.getDriver().get(ConfigurationReader.getProperty("automation_url"));
    }

    @Given("user sign in linkine tiklar")
    public void user_sign_in_linkine_tiklar() {
        automationPracticePage.sigInButton.click();
    }

    @Given("user Create and account bolumune email adresi girer")
    public void user_Create_and_account_bolumune_email_adresi_girer() {
        automationPracticePage.emailCreate.sendKeys(faker.internet().emailAddress());
    }

    @Given("Create an Account butonuna basar")
    public void create_an_Account_butonuna_basar() {
        automationPracticePage.createButton.click();
    }

    @Given("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() throws InterruptedException {

        firstnameGenel = faker.name().firstName();
        lastnameGenel = faker.name().lastName();
        automationPracticePage.radioButton.click();
        automationPracticePage.firstname.sendKeys(firstnameGenel);
        automationPracticePage.lastname.sendKeys(lastnameGenel);
        automationPracticePage.email.clear();
        Thread.sleep(2000);
        automationPracticePage.email.sendKeys(faker.internet().emailAddress());
        automationPracticePage.password.sendKeys(faker.internet().password());

        Select selectday = new Select(automationPracticePage.day);
        selectday.selectByIndex(6);
        Select selectMonth = new Select(automationPracticePage.months);
        selectMonth.selectByIndex(6);
        Select selectyear = new Select(automationPracticePage.year);
        selectyear.selectByValue("2020");

        automationPracticePage.firstname2.sendKeys(firstnameGenel);
        automationPracticePage.lastname2.sendKeys(firstnameGenel);
        automationPracticePage.adres.sendKeys(faker.address().fullAddress());
        automationPracticePage.city.sendKeys(faker.address().cityName());
        Select selectstate = new Select(automationPracticePage.state);
        selectstate.selectByIndex(2);

        automationPracticePage.postcode.sendKeys(faker.address().zipCode());

        Select selectcountry = new Select(automationPracticePage.country);
        selectcountry.selectByIndex(1);

        automationPracticePage.phone.sendKeys("7630295057");
        automationPracticePage.referance.sendKeys(faker.name().username());


    }

    @Given("user Register butonuna basar")
    public void user_Register_butonuna_basar() {
        automationPracticePage.registerbuton.click();
    }

     @Then("hesap olustugunu dogrulayin")
     public void hesap_olustugunu_dogrulayin() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(automationPracticePage.myAccount.isDisplayed());
         System.out.println(automationPracticePage.myAccount.getText());
     }

    @Given("email kutusuna gecersiz email ve password yazar ve sigin butonuna tiklar")
    public void email_kutusuna_gecersiz_email_ve_password_yazar_ve_sigin_butonuna_tiklar() {
        automationPracticePage.email2.sendKeys("pppp@gmail.com");
        automationPracticePage.password2.sendKeys("000000");
        automationPracticePage.siginButton2.click();
    }

    @Then("error mesajinin Authentication failed. oldugunu dogrulayin")
    public void error_mesajinin_Authentication_failed_oldugunu_dogrulayin() {
    Assert.assertTrue(automationPracticePage.errorMesaj.isDisplayed());
        System.out.println(automationPracticePage.errorMesaj.getText());
    }


    @Given("imleci Women linkinin uzerine ve daha sonra Tshirts'e tiklayin")
    public void imleci_Women_linkinin_uzerine_ve_daha_sonra_Tshirts_e_tiklayin() throws InterruptedException {
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(automationPracticePage.womenLink).moveToElement(automationPracticePage.tshirts).click().perform();
        Thread.sleep(2000);
    }
    @Given("sayfada gorunen ilk urunun textini alin")
    public void sayfada_gorunen_ilk_urunun_textini_alin() {
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        String productName = automationPracticePage.product1.getText();
        System.out.println(productName);
    }
    @Given("sayfada ustte bulunan arama cubuguna ayni urun ismini girin ve search butonuna basin")
    public void sayfada_ustte_bulunan_arama_cubuguna_ayni_urun_ismini_girin_ve_search_butonuna_basin() {
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_UP).perform();
        automationPracticePage.searchBox.sendKeys(automationPracticePage.product1.getText());
        automationPracticePage.search.click();
    }
    @Then("acilan sayfada cikan urunun T-Shirt sayfasinda goruntulenen urunle ayni oldugunu dogrulayin")
    public void acilan_sayfada_cikan_urunun_T_Shirt_sayfasinda_goruntulenen_urunle_ayni_oldugunu_dogrulayin() {
        Assert.assertTrue(automationPracticePage.product2.equals(automationPracticePage.product1));
    }


    @Given("kullanici dresses menusunden summer dresses'e tiklar")
    public void kullanici_dresses_menusunden_summer_dresses_e_tiklar() throws InterruptedException {
      action.moveToElement(automationPracticePage.dresses);
      Thread.sleep(2000);
        action.moveToElement(automationPracticePage.summerDresses).click().perform();
    }

    @Then("kullanici tsirt sayisini  ve isimlerini ekrana yazdirir")
    public void kullanici_tsirt_sayisini_ve_isimlerini_ekrana_yazdirir() {
        int tsirtsayisi=automationPracticePage.tsirtList.size();
        System.out.println(tsirtsayisi);
        for (WebElement w:automationPracticePage.tsirtList) {
            System.out.println(w.getText());
            
        }
    }











}

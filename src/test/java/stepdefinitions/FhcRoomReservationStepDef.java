package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.FhcRoomReservationPage;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class FhcRoomReservationStepDef {

    FhcRoomReservationPage fhcRoomReservationPage=new FhcRoomReservationPage();

    @Given(":kullanici fhctrip sayfasindadir")
    public void kullanici_fhctrip_sayfasindadir() {
        Driver.getDriver().get(ConfigurationReader.getProperty("fhc_login_url"));
    }

    @Given(":kullanici gecerli username girer {string}")
    public void kullanici_gecerli_username_girer(String string) {
        fhcRoomReservationPage.userName.sendKeys(string);
    }

    @Given(":kullanici gecerli password girer {string}")
    public void kullanici_gecerli_password_girer(String string) {
        fhcRoomReservationPage.passWord.sendKeys(string);
    }

    @Given(":kullanici login butonuna basar.")
    public void kullanici_login_butonuna_basar() {
        fhcRoomReservationPage.loginButon.click();
    }

    @Given(":kullanici hotel management menusune tiklar")
    public void kullanici_hotel_management_menusune_tiklar() {
        fhcRoomReservationPage.hotelManagement.click();
    }

    @Given(":kullanici room reservation menusune tiklar")
    public void kullanici_room_reservation_menusune_tiklar() {
      fhcRoomReservationPage.roomReservation.click();
    }

    @Given(":kullanici add room reservation butonuna tiklar")
    public void kullanici_add_room_reservation_butonuna_tiklar() {
        fhcRoomReservationPage.addRoomReservationButton.click();
    }

    @Given(":kullanici select user secer {string}")
    public void kullanici_select_user_secer(String string) {
        Select selectUser=new Select(fhcRoomReservationPage.idUser);
        selectUser.selectByVisibleText(string);
    }

    @Given(":kullanici select hotel room secer {string}")
    public void kullanici_select_hotel_room_secer(String string) {
       Select selectHotelRomm=new Select(fhcRoomReservationPage.idHotelRoom);
       selectHotelRomm.selectByVisibleText(string);
    }

    @Given("kullanici fiyat bilgisi girer {string}")
    public void kullanici_fiyat_bilgisi_girer(String string) {
       fhcRoomReservationPage.price.sendKeys(string);
    }

    @Given(":kullanici date start secer {string}")
    public void kullanici_date_start_secer(String string) {
        fhcRoomReservationPage.dateStart.sendKeys(string);
    }

    @Given(":kullanici date end secer {string}")
    public void kullanici_date_end_secer(String string) {
        fhcRoomReservationPage.dateEnd.sendKeys(string);
    }

    @Given(":kullanici adult amount girer {string}")
    public void kullanici_adult_amount_girer(String string) {
      fhcRoomReservationPage.adultAmount.sendKeys(string);
    }

    @Given(":kullanici children amount girer {string}")
    public void kullanici_children_amount_girer(String string) {
        fhcRoomReservationPage.childrenAmount.sendKeys(string);
    }

    @Given(":kullanici contact name surname girer {string}")
    public void kullanici_contact_name_surname_girer(String string) {
      fhcRoomReservationPage.nameSurname.sendKeys(string);
    }

    @Given(":kullanici contact phone girer {string}")
    public void kullanici_contact_phone_girer(String string) throws InterruptedException {
      fhcRoomReservationPage.phone.sendKeys(string);
      Thread.sleep(3000);
    }

    @Given(":kullanici contact email girer {string}")
    public void kullanici_contact_email_girer(String string) {
        fhcRoomReservationPage.contactEmail.sendKeys(string);
    }

    @Given(":kullanici not girer  {string}")
    public void kullanici_not_girer(String string) {
       fhcRoomReservationPage.notes.sendKeys(string);
    }

    @Given(":kullanici approved checkbox'a tiklar")
    public void kullanici_approved_checkbox_a_tiklar() {
      fhcRoomReservationPage.approved.click();
    }

    @Given(":kullanici isPaid checkbox'a tiklar")
    public void kullanici_isPaid_checkbox_a_tiklar() {
        fhcRoomReservationPage.isPaid.click();
    }

    @Given(":kullanici save butonuna tiklar")
    public void kullanici_save_butonuna_tiklar() {
        fhcRoomReservationPage.saveButton.click();


    }
    @Then(":succes mesajinin gorundugu dogrulanir")
    public void succes_mesajinin_gorundugu_dogrulanir() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(fhcRoomReservationPage.successfulyMesaj));

        Assert.assertTrue(fhcRoomReservationPage.successfulyMesaj.isDisplayed());
        System.out.println(fhcRoomReservationPage.successfulyMesaj.getText());
    }





}

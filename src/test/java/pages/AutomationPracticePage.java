package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AutomationPracticePage {

    public AutomationPracticePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(className = "login")
    public WebElement sigInButton;

    @FindBy(id = "email_create")
    public WebElement emailCreate;

    @FindBy(xpath = "//i[@class='icon-user left']")
    public  WebElement createButton;

    @FindBy(id = "id_gender2")
    public WebElement radioButton;

    @FindBy(id = "customer_firstname")
    public WebElement firstname;

    @FindBy(id = "customer_lastname")
    public WebElement lastname;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "passwd")
    public WebElement password;

    @FindBy(id = "days")
    public WebElement day;

    @FindBy(id = "months")
    public WebElement months;

    @FindBy(id = "years")
    public WebElement year;

    @FindBy(id = "firstname")
    public WebElement firstname2;

    @FindBy(id = "lastname")
    public WebElement lastname2;

    @FindBy(id = "address1")
    public WebElement adres;

    @FindBy(id = "city")
    public WebElement city;

    @FindBy(id = "id_state")
    public WebElement state;

    @FindBy(id = "postcode")
    public WebElement postcode;

    @FindBy(id = "id_country")
    public WebElement country;

    @FindBy(id = "phone_mobile")
    public WebElement phone;

    @FindBy(id = "alias")
    public WebElement referance;


    @FindBy(xpath = "//span[.='Register']")
    public WebElement registerbuton;

    //@FindBy(xpath ="(//i[@class='icon-chevron-right right'])[3]") //normal xpath coklu locatelerde
//    @Findby(xpath="//*[contains(text(),'Register')]"   ///contains yontemi ile bulma

     @FindBy(xpath = "//h1")
    public WebElement myAccount;

     @FindBy(id = "email")
    public WebElement email2;

     @FindBy(id = "passwd")
    public WebElement password2;

     @FindBy(id = "SubmitLogin")
    public WebElement siginButton2;

     @FindBy(xpath = "//li[.='Authentication failed.']")
    public WebElement errorMesaj;
     //2. yol contains ile bulma
    //*[contains(text(),'Authentication failed')]

    @FindBy(xpath = "//a[.='Women']")
    public WebElement womenLink;

    @FindBy(xpath = "//a[.='T-shirts']")
    public WebElement tshirts;

    @FindBy (xpath = "(//a[@title='Faded Short Sleeve T-shirts'])[2]")
    public WebElement product1;

    @FindBy(id = "search_query_top")
    public WebElement searchBox;

    @FindBy(name = "submit_search")
    public WebElement search;

    @FindBy(xpath = "(//a[@title='Faded Short Sleeve T-shirts'])[2]")
    public WebElement product2;

    /////////////////kendi calismam
    @FindBy(xpath = "(//a[@title='Dresses'])[2]")
    public WebElement dresses;
    @FindBy(xpath = "(//a[@title='Summer Dresses'])[2]")
    public WebElement summerDresses;

    @FindBy(xpath = "(//div[@class='product-count'])[1]")
    public List<WebElement> tsirtList;
}

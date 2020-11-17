package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    //Before testNG'deki Before method gibi calisir
    //her senaryodan once calisir
    //Global Hooks annotation //butun methodlar icin calisir
    @Before(order = 1)
    public  void setUp(){
        System.out.println("Hooks Class- Setup Method");
    }
    //TAGGET Hooks annotation //sadece bir lethod icin calisir
    //her ozel(spesifik) senaryodan once calissir
    @Before(value="@Teapot",order = 2)
    public void searchIphone(){
        System.out.println("Hooks Class- Teapot Method");
    }
    //her senaryodan sonra calsiir
    @After
    public void tearDown(Scenario scenario){
        System.out.println("Hooks Class - tearDown Method");

        //screenshot almak icin
        final byte[] screenshot= ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

        //Her fail olan senaryo'dan sonra screenshot almaliyiz'
        //senaryo fail olursa screenshot alir image ekler
        if(scenario.isFailed()){
            scenario.embed(screenshot,"image/png"); //resim uzantisi genelde png oluyor
        }//embed gommek demek
        //bunu bir kez olustirmak yeterli array'in icine fail olanalrin ekran resmini atiyor

       // Driver.closeDriver();
    }

}

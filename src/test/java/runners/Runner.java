package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) //@RunWith ==> cucumber.class ile birlikte calistir.
@CucumberOptions(
        plugin={"html:target/default-cucumber-reports",
                "json:target/json-reports/cucumber2.json",
                "junit:target/xml-report/cucumber2.xml"
        }, //target klasornun  altina cucumber in icinde indexe tikla  rapor gelmesi icin


        features = "src\\test\\resources\\features", // gerkin dili olan feature
        glue = "stepdefinitions", // java kodlarinin yazildi yer oldugu icin bunuda buraya yapistirdik.
        tags ="@tsirt",
        dryRun = false //kayip olan step i bulur browseri acarak bulur///daha hizli ve browseri acmadan
        // bulmak istersek 'true' yazmaliyiz
        //true yaparsak step defin.olusturulur.bunlari alip class olusturup icine yapistir
)
public class Runner {
}
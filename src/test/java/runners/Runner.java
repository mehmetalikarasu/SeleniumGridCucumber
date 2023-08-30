package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@edge",
        dryRun = false
)
public class Runner {
}
/*
SeleniumServer Dosyasına sağ tık atıp open in terminal e tıklayıp aşağıdaki kodu giriyoruz ve servera bağlanıyoruz...
java -jar selenium-server-4.11.0.jar standalone
 */
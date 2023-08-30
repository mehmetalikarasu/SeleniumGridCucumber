package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.DriverManager;
import java.time.Duration;


public class GridStepDefinition {
    WebDriver driver;
    @Given("kullanici {string} adresine {string} ile gider")
    public void kullaniciAdresineIleGider(String url, String browser) throws MalformedURLException {

      URL remoteUrl = new URL("http://192.168.1.4:4444");

      if (browser.equalsIgnoreCase("chrome")){
          driver = new RemoteWebDriver(remoteUrl,new ChromeOptions());
      }else if (browser.equalsIgnoreCase("edge")){
          driver = new RemoteWebDriver(remoteUrl,new EdgeOptions());
      }
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

      driver.get(url);

    }

    @When("kullanici basligin {string} icerdigini dogrular")
    public void kullaniciBasliginIcerdiginiDogrular(String title) {
        Assert.assertTrue(driver.getTitle().contains(title));
    }

    @Then("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        driver.close();
    }
}

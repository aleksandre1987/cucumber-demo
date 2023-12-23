import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.annotation.Nullable;
import java.time.Duration;
import java.util.List;

public class HomeWork {
    WebDriver driver = new ChromeDriver();

        @Given("Log in page is opened")
        public void log_in_page_is_opened() {
            WebDriverManager.chromedriver().setup();
            //WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.saucedemo.com/");


        }
        @And("User provides standard_user and secret_sauce")
        public void user_provides_standard_user_and_secret_sauce(String username, String password) {
          driver.findElement(By.name("user-name")).sendKeys(username);
          driver.findElement(By.name("password")).sendKeys(password);

        }
        @When("user clicks on login button")
        public void user_clicks_on_login_button() {
            driver.findElement(By.name("login-button")).click();

        }
        @Then("user should be logged in sucessfully")
        public void user_should_be_logged_in_sucessfully() {

        }

    }






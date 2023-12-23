import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testtttt {

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

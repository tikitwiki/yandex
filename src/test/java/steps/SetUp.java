package steps;

import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.Configuration;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

public class SetUp {
    WebDriver driver;


    @Before
    public void openUrl() {

        Configuration.browser = "chrome";
        open("https://market.yandex.ru/");
    }

   @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }}
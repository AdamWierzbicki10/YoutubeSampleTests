import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.SeleniumHelper;

import java.time.Duration;

public class BaseTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("−−mute−audio");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://www.youtube.com/");
        SeleniumHelper.waitForElementToBeClickableByLocator(driver, By.xpath("//button[.//span[text()='Zaakceptuj wszystko']]"));
        driver.findElement(By.xpath("//button[.//span[text()='Zaakceptuj wszystko']]")).click();
        driver.navigate().refresh();
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }

}

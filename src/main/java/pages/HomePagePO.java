package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.SeleniumHelper;

public class HomePagePO {

    @FindBy(xpath = "//div[@id='search-input']//input[@id='search']")
    private WebElement searchInput;

    private WebDriver driver;

    public HomePagePO(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public ResultsPagePO searchForVideo(String inputToSearch) {
        SeleniumHelper.waitForElementToBeVisible(driver, searchInput);
        SeleniumHelper.waitForElementToBeClickable(driver, searchInput);
        searchInput.click();
        searchInput.sendKeys(inputToSearch);
        searchInput.sendKeys(Keys.ENTER);

        return new ResultsPagePO(driver);
    }


}

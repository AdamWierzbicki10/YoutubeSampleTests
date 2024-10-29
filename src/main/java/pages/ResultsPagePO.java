package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.SeleniumHelper;

public class ResultsPagePO {

    @FindBy(xpath = "//a[@href='/watch?v=dQw4w9WgXcQ&pp=ygUIUmlja3JvbGw%3D']")
    private WebElement rickRollVideoLink;

    private WebDriver driver;

    public ResultsPagePO(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public VideoPlayerPO enterVideo() {
        SeleniumHelper.waitForElementToBeVisible(driver, rickRollVideoLink);
        rickRollVideoLink.click();
        return new VideoPlayerPO(driver);
    }

    public WebElement getRickRollVideoLink() {
        SeleniumHelper.waitForElementToBeVisible(driver, rickRollVideoLink);
        return rickRollVideoLink;
    }
}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.SeleniumHelper;

public class VideoPlayerPO {

    @FindBy(xpath = "//div[@id='above-the-fold']/div[@id='title']")
    private WebElement videoTitleDiv;

    @FindBy(xpath = "//div[@id='owner']//ytd-channel-name[@id='channel-name']")
    private WebElement channelNameContainer;

    private WebDriver driver;

    public VideoPlayerPO(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebElement getVideoTitleDiv() {
        SeleniumHelper.waitForElementToBeVisible(driver, videoTitleDiv);
        return videoTitleDiv;
    }

    public WebElement getChannelNameContainer() {
        SeleniumHelper.waitForElementToBeVisible(driver, channelNameContainer);
        return channelNameContainer;
    }
}

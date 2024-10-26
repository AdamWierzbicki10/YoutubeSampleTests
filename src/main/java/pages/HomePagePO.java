package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePO {

@FindBy(css = "input[id='search']")
private WebElement searchInput;

WebDriver driver;
public HomePagePO(WebDriver driver){
    PageFactory.initElements(driver,this);
    this.driver = driver;
}

public HomePagePO searchForVideo(String inputToSearch){
    searchInput.click();
    searchInput.sendKeys(inputToSearch);
    searchInput.sendKeys(Keys.ENTER);
    return this;
}


}

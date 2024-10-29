package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumHelper {


    public static void waitForElementToBeVisible(WebDriver driver, WebElement el) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.ignoring(StaleElementReferenceException.class);
        wait.until(ExpectedConditions.visibilityOf(el));
    }

    public static void waitForElementToBeClickable(WebDriver driver, WebElement el) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.ignoring(StaleElementReferenceException.class);
        wait.until(ExpectedConditions.elementToBeClickable(el));
    }

    public static WebElement waitForElementToBeClickableByLocator(WebDriver driver, By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.ignoring(StaleElementReferenceException.class);
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(by)));
        return driver.findElement(by);
    }

}

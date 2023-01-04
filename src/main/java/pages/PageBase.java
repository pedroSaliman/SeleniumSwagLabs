package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageBase {
    public static WebDriver driver;

    public void setDriver(WebDriver driver) {
        PageBase.driver = driver;
    }



    // wait for elemnt
    protected void wait(By locator){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(locator));
    }

    protected WebElement find(By locator) {
        return driver.findElement(locator);
    }
    ///////////////// ckick
    protected void click(By locator) {
        find(locator).click();
    }
    ///////// type method
    protected void type(By locator,String val) {
        find(locator).sendKeys(val);
    }

    ////////////////////Get Text
    protected String Text(By locator) {
        String text = find(locator).getText();
        System.out.println("Text: " + text);
        return text;
    }




}
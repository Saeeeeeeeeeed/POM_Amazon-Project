package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.sql.Driver;

public class PageBase {

    protected WebDriver driver;

    //JavascriptExecutor jse = (JavascriptExecutor) driver;


    // this bage has the usable methods in all other pages



    public PageBase (WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    protected static void ClickButton(WebElement buttun)   //click on button
    {
        buttun.click();
    }

    protected static void settext (WebElement text,String value)   //to sent string and press enter
    {
        text.sendKeys(value);
        text.sendKeys(Keys.ENTER);
    }

    protected static void settextonly (WebElement text,String value)  //to sent string only
    {
        text.sendKeys(value);

    }

    //JavascriptExecutor jse = (JavascriptExecutor) driver;

   // public void scrolldown (WebElement scroll)
    //{
    //    jse.executeScript("arguments[0].scrollIntoView()", scroll);
   // }



}

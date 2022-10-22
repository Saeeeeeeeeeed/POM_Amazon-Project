package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    JavascriptExecutor jse = (JavascriptExecutor) driver;

   @FindBy (xpath = "/html/body/div[1]/header/div/div[1]/div[3]/div/a[1]/span/span[2]/span[1]")
    WebElement language;
    @FindBy (xpath = "/html/body/div[1]/div[1]/div/form/div[1]/div[1]/div[3]/div/label/i")
    WebElement English;

    @FindBy (xpath = "/html/body/div[1]/div[1]/div/span[2]/span")
    WebElement savechanges;

    @FindBy (id = "twotabsearchtextbox")
    WebElement SearchBar;

    @FindBy (xpath = "/html/body/div[1]/div[1]/div[1]/div[1]/div/span[3]/div[2]/div[58]/div/div/div/div/div[1]/span/a/div/img")
    WebElement Scroll;

    @FindBy (xpath = "/html/body/div[1]/div[1]/div[1]/div[2]/div/div[3]/span/div/div/div/div[5]/ul/li[6]/span/a/div/label/i")
    WebElement Brand;

    @FindBy (id = "low-price")
    WebElement minprice;

    @FindBy (id = "high-price")
    WebElement maxprice;

    @FindBy (xpath = "a-autoid-1")
    WebElement GO;

    @FindBy (linkText = "Huawei Watch GT2e HCT-B19 Smart Watch - Graphite Black")
    WebElement item;

    @FindBy(id = "add-to-cart-button")
    WebElement addtocart;

    @FindBy (xpath = "/html/body/div[1]/header/div/div[1]/div[3]/div/a[4]/div[1]/span[2]")
    WebElement cart;

    @FindBy (xpath = "/html/body/div[1]/div[1]/div/div[1]/div[2]/div/div[1]/span/span/a")
    WebElement basket;

    @FindBy (xpath = "/html/body/div[1]/div[1]/div[3]/div[3]/div/div[2]/div[1]/div/form/div[2]/div[3]/div[4]/div/div[1]/div/div/div[2]/div[1]/span[2]/span/input")
    WebElement Delete;

    @FindBy (id = "nav-logo-sprites")
    WebElement logo;

  //  public boolean validatepage ()
   // {
   //     return logo.isDisplayed();
   // }



    public void ClickonLanguage ()  //this function used to click on language part on website
    {
        ClickButton(language);
    }

    public void ClickonEnglish () //this method is to change it to English
    {
        ClickButton(English);
    }

    public void SaveChanges ()  // to save language
    {
        ClickButton(savechanges);
    }

    public void search (String value)  //to search in searchbar
    {
        settext(SearchBar,value);
    }

   // public void ScrollDown ()
   // {
   //     scrolldown(Scrolldown);
   // }

    public void choosebrand ()    //to choose Hauawi (I didn't find HTC
    {
        ClickButton(Brand);
    }

    public void setMinMaxprice (String min,String max)  {  //to set max and min price
       settextonly(minprice,min);
       settext(maxprice,max);
       //ClickButton(GO);

    }

    public void setMaxprice (String value)
    {
        settext(maxprice,value);
    }

    public void AddToCart ()    // adding item to cart
    {
        ClickButton(addtocart);
    }

    public void ClickOnItem ()  // to click on item
    {
        ClickButton(item);
    }

    public void ClickOnBasket ()  //use this to open your basket
    {
        ClickButton(basket);
    }

    public void DeleteFromBasket ()   //delete items from basket
    {
        ClickButton(Delete);
    }

    public void ClickonCart ()
    {
        ClickButton(cart);
    }

    public void scrolldown ()
    {
       jse.executeScript("arguments[0].scrollIntoView()", item);
    }

}

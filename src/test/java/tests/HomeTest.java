package tests;

import org.testng.annotations.Test;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class HomeTest extends TestBase {

    //this one is to run the test cases, in our project i used only one page and one test case

    HomePage searchpage;



    @Test
    public void testmethod () {     //this one is the test method

        searchpage = new HomePage(driver);

        searchpage.search("Mobile");   //search for mobile in search bar
        searchpage.ClickonLanguage();     //click on language part on page
        searchpage.ClickonEnglish();    //choose english language
        searchpage.SaveChanges();      //save language

        searchpage.choosebrand();    //choose brand (I used Hauawi instead of HTC beacuse I don't find HTC in brands)
        searchpage.setMinMaxprice("3500","5000");  //setting max and min price

        searchpage.ClickOnItem();   // choose last item and click on it (last item is not a mobile, all the page is not a mobile so I uset the last item in list )
        searchpage.AddToCart();     //add to the cart item you click

        searchpage.ClickOnBasket();   //click on basket to show the cart
        searchpage.DeleteFromBasket();  //delete the item from the cart





    }
}

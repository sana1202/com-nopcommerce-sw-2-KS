package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp(){openBrowser(baseUrl);}
    @Test
    public void UserShouldNavigateToComputerPageSuccessfully(){
        //find the computers element and click on it
        driver.findElement(By.xpath("//a[@href='/computers'][1]")).click();
        String expectedText = "Computers";
        //find the computers text element
        String actualtext = driver.findElement(By.xpath("//a[@href='/computers'][1]")).getText();
        //compare the expected with actual text
        Assert.assertEquals(expectedText,actualtext);
    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        //find the Electronics element and click on it
        driver.findElement(By.xpath("//a[@href='/electronics'][1]")).click();
        String expectedText = "Electronics";
        //find the Electronics text element
        String actualText = driver.findElement(By.xpath("//a[@href='/electronics'][1]")).getText();
        //compare the expected with actual list
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        //find the Apparel element and click on it
        driver.findElement(By.xpath("//a[@href='/apparel'][1]")).click();
        String expectedText = "Apparel";
        //Find the Apparels text element
        String actualText= driver.findElement(By.xpath("//a[@href='/apparel'][1]")).getText();
        //compare the expected with actual list
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void userShouldnNavigateToDigitalDownloadsPageSuccessfully(){
        //find the Digital downloads element and click on it
        driver.findElement(By.xpath("//a[@href='/digital-downloads'][1]")).click();
        String expectedText= "Digital downloads";
        //Find the Digital Downloads text element
        String actualText= driver.findElement(By.xpath("//a[@href='/digital-downloads'][1]")).getText();
        //compare the expected with actual list
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        //find the Books element and click on it
        driver.findElement(By.xpath("//a[@href='/books'][1]")).click();
        String expectedText="Books";
        //Find the Books text element
        String actualText= driver.findElement(By.xpath("//a[@href='/books'][1]")).getText();
        //compare the expected with actual list
        Assert.assertEquals(expectedText,actualText);

    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        //Find the Jewelery element and click on it
        driver.findElement(By.xpath("//a[@href='/jewelry'][1]")).click();
        String expectedText = "Jewelry";
        //find the Jewelery text element
        String actualText=driver.findElement(By.xpath("//a[@href='/jewelry'][1]")).getText();
        //compare the expected with actual list
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        //find the Gift cards element and click on it
        driver.findElement(By.xpath("//a[@href='/gift-cards'][1]")).click();
        String expectedText ="Gift Cards";
        //find the Giftcards text element
        String actualText= driver.findElement(By.xpath("//a[@href='/gift-cards'][1]")).getText();
        //compare the expected with actual list
        Assert.assertEquals(expectedText,actualText);
    }
    public void tearDown(){driver.quit();}
}

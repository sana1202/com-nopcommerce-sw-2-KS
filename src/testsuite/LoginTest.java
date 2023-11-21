package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp(){openBrowser(baseUrl);}
    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        //Find the log in link element and click
        driver.findElement(By.xpath("//a[text()='Log in']")).click();
        String expectedWelcomeMessage = "Welcome, Please Sign In!";
        //Find the Welcome message element and get text
        String actualWelcomeMessage = driver.findElement(By.xpath("//h1[text()='Welcome, Please Sign In!']")).getText();
        //Comparing expected and actual messages
        Assert.assertEquals(expectedWelcomeMessage,actualWelcomeMessage);
       // driver.findElement(By.xpath("")).sendKeys();
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        //Find the log in link element and click
        driver.findElement(By.xpath("//a[text()='Log in']")).click();
        //find the email element and send the input
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("1234@gmail.com");
        //find the password element and send the input
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("abcdefg");
        //find the login button element and click
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        String expectedLogOutMessage = "Log out";
        //find the log out message element and get the text
        String actualLogOutMessage = driver.findElement(By.xpath("//a[text()='Log out']")).getText();
        //comparing the expected and actual messages
        Assert.assertEquals(expectedLogOutMessage,actualLogOutMessage);
    }
@Test
    public void verifyTheErrorMessage(){
    //Find the log in link element and click
    driver.findElement(By.xpath("//a[text()='Log in']")).click();
    //find the email element and send the input
    driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("12345@gmail.com");
    //find the password element and send the input
    driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("abcdefgh");
    //find the login button element and click
    driver.findElement(By.xpath("//button[text()='Log in']")).click();

    String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n"+"No customer account found";
    String actualErrorMessage = driver.findElement(By.xpath("//div[text()='Login was unsuccessful. Please correct the errors and try again.']")).getText();
    Assert.assertEquals(expectedErrorMessage,actualErrorMessage);
}
    public void tearDown(){driver.quit();}

}

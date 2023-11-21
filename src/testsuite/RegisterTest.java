package testsuite;

import browserfactory.BaseTest;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.Random;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp(){openBrowser(baseUrl);}
    @Test
    public void userShouldRegisterAccountSuccessfully(){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(9999);
        //Find the Register element and click on it
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();
        //Find the Gender element and click on it
        driver.findElement(By.xpath("//div[@id='gender']")).click();
        //Find the First name element and send input
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Firstname"+ randomInt);
        //Find the Last name element and send input
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Lastname"+ randomInt);
        //Find the Day element and send input
        driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")).sendKeys("02");
        //Find the Month element and send input
        driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")).sendKeys("January");
        //Find the Year element and send input
        driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")).sendKeys("1981");
        //Find the email address element and send the input
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Prime"+ randomInt +"@aol.com");
        //Find the password element and send the input
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("AbCdEfG");
        //Find the confirm password element and send the input
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("AbCdEfG");
        //Find the Register element and send the input
        driver.findElement(By.xpath("//button[@id='register-button']")).click();
        String expectedMessage = "Your registration completed";
        //Find the Verify the text element and get the text
        String actualMessage = driver.findElement(By.xpath("//div[@class='result']")).getText();
        //compare expected and actual message
        Assert.assertEquals(expectedMessage,actualMessage);
    }
    public void tearDown(){driver.quit();}
}

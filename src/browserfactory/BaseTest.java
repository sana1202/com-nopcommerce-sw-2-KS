package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class BaseTest {
    static String browser = "Chrome";// assigning Chrome as Browser

    public static WebDriver driver;

    public void openBrowser(String baseUrl){
        if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        }if (browser.equalsIgnoreCase("Firefox")){
            driver = new FirefoxDriver();
        }if (browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        }if (browser.equalsIgnoreCase("Safari")){
            driver = new SafariDriver();
        }else {
            System.out.println("Wrong Browser selected");
        }

        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    public void closeBrowser(){driver.quit();}
}

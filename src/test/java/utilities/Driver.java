package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    private static WebDriver driver;

    /**
     * This method sets up WebDriver type based on provided
     * browser type in Configuration.properties file.
     * @return WebDriver
     */

     public static WebDriver getDriver(){
        String browser = ConfigReader.getProperty("browser");
        if (driver==null || ((RemoteWebDriver)driver).getSessionId()==null) {
            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions options = new ChromeOptions();
                    options.setHeadless(false);
                    driver = new ChromeDriver(options);
                    break;
                case "edge":
                     WebDriverManager.edgedriver().setup();
                     driver = new EdgeDriver();
                     break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "ie":
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;
                case "opera":
                    WebDriverManager.operadriver().setup();
                    driver = new OperaDriver();
            }
        } else {
            return driver;
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

}

package Automation_learning;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation_learn_class {
	public static void main(String[] args) {
		 WebDriver driver = null;
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chrome-win64\\chromedriver.exe");
		
	//WebDriver driver = new ChromeDriver();
    //driver.get("https://www.facebook.com");
		
	//when selenium drivers version is more then 4.1 we need not give sys.setproperty.... instead we can give below line 
    //ChromeOptions option = new ChromeOptions();  
    //WebDriver driver = new ChromeDriver(option);

        // Change this value to "chrome", "firefox", or "edge"
        String browser = "chrome";

		if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } 
        else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } 
        else if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } 
        else {
            System.out.println("❌ Invalid browser name");
            System.exit(0);
        }
    
    // ✅ Maximize the browser window
    driver.manage().window().maximize();
    
    driver.get("https://www.facebook.com");
    System.out.println("Opened: " + driver.getTitle());
	
    // ✅ Create WebDriverWait (max 10 seconds)
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    
    // ✅ Wait until page title contains "Facebook"
    wait.until(ExpectedConditions.titleContains("Facebook"));
    
    
    // ✅ Close browser
    driver.quit(); 
    
	}
} 

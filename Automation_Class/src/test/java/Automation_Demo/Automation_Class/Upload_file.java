package Automation_Demo.Automation_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open demo site
        driver.get("https://the-internet.herokuapp.com/upload");

        // Locate file input and send file path
        WebElement uploadInput = driver.findElement(By.id("file-upload"));
        uploadInput.sendKeys("D:\\Selenium\\google1.png");

        // Click submit button
        driver.findElement(By.id("file-submit")).click();
 
        // Validate upload success
        String message = driver.findElement(By.tagName("h3")).getText();
        System.out.println("Upload message: " + message);
	}

}

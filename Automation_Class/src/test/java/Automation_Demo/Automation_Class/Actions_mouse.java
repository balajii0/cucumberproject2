package Automation_Demo.Automation_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Actions_mouse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		ChromeOptions option = new ChromeOptions();
		WebDriver Driver = new ChromeDriver(option);
		
		Driver.manage().window().maximize();
        Driver.get("https://demoqa.com/menu/");

        // Create Actions object
        Actions action = new Actions(Driver);

        // Locate the "Main Item 2"
        WebElement mainItem2 = Driver.findElement(By.xpath("//a[text()='Main Item 2']"));

        // Hover over "Main Item 2"
        action.moveToElement(mainItem2).perform();
        Thread.sleep(2000);

        Driver.quit();
    }
}
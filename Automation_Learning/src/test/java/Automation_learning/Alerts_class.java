package Automation_learning;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_class {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        // Simple Alert
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        Alert simpleAlert = driver.switchTo().alert();
        System.out.println("Alert text: " + simpleAlert.getText());
		Thread.sleep(2000);
        simpleAlert.accept();  // click OK

		/*
		 * // Confirmation Alert
		 * driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click
		 * (); Alert confirmAlert = driver.switchTo().alert();
		 * System.out.println("Confirm text: " + confirmAlert.getText());
		 * confirmAlert.dismiss(); // click Cancel
		 */
        
        // Prompt Alert
		
		/*
		 * driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click(
		 * ); Alert promptAlert = driver.switchTo().alert();
		 * System.out.println("Prompt text: " + promptAlert.getText());
		 * promptAlert.sendKeys("Balaji"); promptAlert.accept(); // click OK
		 */		 
        //driver.quit();

	}

}

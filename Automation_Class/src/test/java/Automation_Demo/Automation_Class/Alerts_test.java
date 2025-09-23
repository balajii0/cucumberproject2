package Automation_Demo.Automation_Class;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alerts_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ChromeOptions option = new ChromeOptions();	
	WebDriver Driver = new ChromeDriver(option);
	
	Driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	Driver.manage().window().maximize();
	
	
    Driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
    Alert simpleAlert = Driver.switchTo().alert();
    System.out.println("Alert text: " + simpleAlert.getText());
     simpleAlert.accept(); 

		
	Driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click(); 
	Alert confirmAlert = Driver.switchTo().alert();
	System.out.println("Confirm text: " + confirmAlert.getText());
	confirmAlert.dismiss(); 
	
	Driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	Alert promptAlert = Driver.switchTo().alert();
	System.out.println("Prompt text: " + promptAlert.getText());
	promptAlert.sendKeys("Balaji"); promptAlert.accept();
		 	
	
	}

}

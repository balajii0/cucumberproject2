package Automation_Demo.Automation_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Facebook_DD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions option = new ChromeOptions();
		WebDriver Driver = new ChromeDriver(option);
		
		Driver.get("https://www.facebook.com/r.php");
		Driver.manage().window().maximize();
		
		
		WebElement firstname = Driver.findElement(By.name("firstname"));
		firstname.sendKeys("Balaji");
		WebElement surname = Driver.findElement(By.name("lastname"));
		surname.sendKeys("d");
		
		WebElement Dropdown = Driver.findElement(By.id("day"));
		Select dd = new Select (Dropdown);
		dd.selectByIndex(5);
		
		WebElement Dropdow = Driver.findElement(By.id("month"));
		Select dda = new Select (Dropdow);
		dda.selectByValue("10");
		
		WebElement drop = Driver.findElement(By.id("year"));
		Select ddab = new Select (drop);
		ddab.selectByVisibleText("2015");
		
		WebElement Radio = Driver.findElement(By.xpath("//*[@id=\"sex\" and @value=\"2\"]"));
		Radio.click();
 	
		WebElement mobile = Driver.findElement(By.name("reg_email__"));
		mobile.sendKeys("9876543210");
		WebElement password = Driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("123456789");
		
		WebElement signin = Driver.findElement(By.name("websubmit")); 
		signin.click();
		
	}
	

}

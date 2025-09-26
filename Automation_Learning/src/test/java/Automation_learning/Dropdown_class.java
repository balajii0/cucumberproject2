package Automation_learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.facebook.com/r.php"); // Facebook signup has dropdowns
	        driver.manage().window().maximize();

	        // Locate the dropdown (Example: Day dropdown in DOB)
	        WebElement monthDropdown = driver.findElement(By.id("month"));

	        // Create Select object
	        Select selectmonth = new Select(monthDropdown);

	        // Different ways to select
	       // selectDay.selectByIndex(5);         // 6th day
	        //selectDay.selectByValue("10");      // 10th day
	        selectmonth.selectByVisibleText("May");// Selects 20th
		

	}

}

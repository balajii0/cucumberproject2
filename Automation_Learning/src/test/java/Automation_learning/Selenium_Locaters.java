package Automation_learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium_Locaters {

	public static void main(String[] args) {

		ChromeOptions option = new ChromeOptions();
		WebDriver driver = new ChromeDriver(option);

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		//class name
		/*
		 * WebElement title = driver.findElement(By.className("_8eso")); String name =
		 * title.getText(); System.out.println(name);
		 */
		
		
		//taggname
				
		  List<WebElement> linnks = driver.findElements(By.xpath("//form[@class='_9vtf']//a"));
		  
		  int size = linnks.size();
		  System.out.println("size = " + size);
		  		  
		  
		  for (WebElement Facebooklinks : linnks)		  
		  { String facebookalinkstest = Facebooklinks.getText();		  
		  System.out.println(facebookalinkstest);
		  
		  }
		 
		
		
		//LinkText and partialLinkText
		  
	//WebElement button = driver.findElement(By.partialLinkText("Forgotten"));		
	//button.click();
		
		
		
		
		//
		
		

	}

}

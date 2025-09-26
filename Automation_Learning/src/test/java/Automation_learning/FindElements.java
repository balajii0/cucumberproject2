package Automation_learning;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElements {

	public static void main(String[] args) {

		ChromeOptions option = new ChromeOptions();
		WebDriver driver = new ChromeDriver(option);

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		//Create new account 

		/*
		 * WebElement createnewaccount = driver.findElement(By.id("u_0_0_4X"));
		 * createnewaccount.click();
		 */
		/*
		 * WebElement Link = driver.findElement(By.tagName("a")); String href =
		 * Link.getAttribute("href"); Link.click();
		 */

		WebElement createnewaccount = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		createnewaccount.click();
		
		
		
/*		List<WebElement> linnks = driver.findElements(By.xpath("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']//a"));
		// String Longtest = Login.getText();
		// System.out.println(Longtest);

		int size = linnks.size();

		System.out.println("size = " + size);

		for (WebElement Facebooklinks : linnks)

		{
			String facebookalllinkstest = Facebooklinks.getText();

			System.out.println(facebookalllinkstest)};*/

		}

	}



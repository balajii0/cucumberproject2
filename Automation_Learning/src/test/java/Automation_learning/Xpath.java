package Automation_learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath {

	public static void main(String[] args) throws Exception {

		ChromeOptions option = new ChromeOptions();
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/radio-buttons");

		//
		Thread.sleep(2000);

		WebElement maleRadio = driver.findElement(By.id("yellow"));

		Thread.sleep(2000);
		maleRadio.clear();

		if (maleRadio.isSelected()) {
			System.out.println("red radio button is selected");
		} else {

			System.out.println("Not red radio button is selected");
		}

		/*
		 * driver.findElement(By.className("rct-checkbox")).click(); List<WebElement>
		 * txt=driver.findElements(By.xpath("//*[@id=\"result\"]//span")); for
		 * (WebElement status:txt) { String validate=status.getText(); }
		 * System.out.println(validate);
		 * 
		 * } System.out.println(txt);
		 * driver.navigate().to("https://www.amazon.in/ref=nav_logo");
		 * driver.navigate().back();
		 * 
		 * driver.navigate().forward();
		 * 
		 * driver.navigate().refresh(); // String url =driver.getCurrentUrl();
		 * System.out.println(url); // Thread.sleep(2000);
		 */
		driver.quit();

	}

}

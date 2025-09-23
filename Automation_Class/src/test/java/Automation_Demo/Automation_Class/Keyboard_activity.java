package Automation_Demo.Automation_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_activity {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

        WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

        driver.get("https://www.google.com/");

        WebElement searchBox = driver.findElement(By.name("q"));

        Actions action = new Actions(driver);

        // Type in uppercase using SHIFT key
        action.keyDown(Keys.SHIFT)
              .sendKeys(searchBox, "selenium testing")
              .keyUp(Keys.SHIFT)
              .perform();

        Thread.sleep(2000);

        // Select all text (CTRL + A), Copy (CTRL + C), then Paste (CTRL + V)
        action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
        action.sendKeys(Keys.TAB).perform();  // Move to next field if exists
        action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

        Thread.sleep(2000);
        driver.quit();
		
	}

}

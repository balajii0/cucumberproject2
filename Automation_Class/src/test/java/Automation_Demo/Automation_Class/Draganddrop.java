package Automation_Demo.Automation_Class;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/droppable");

		// Create Actions object
		Actions action = new Actions(driver);

		// Locate source (Draggable element)
		WebElement source = driver.findElement(By.id("draggable"));

		// Locate target (Droppable element)
		WebElement target = driver.findElement(By.id("droppable"));

		// Perform drag and drop
		action.dragAndDrop(source, target).perform();

		// Verify if text changed after drop
		String textAfterDrop = target.getText();
		System.out.println("Text after drop: " + textAfterDrop);

		/*
		 * File srcs = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 * FileUtils.copyFile(srcs, new File("D:\\Selenium\\google1.png"));
		 * System.out.println("Screenshot1 saved!");
		 */
	}

}

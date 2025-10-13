package Automation_Demo.Automation_Class;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdroppractice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/droppable");

		Actions action = new Actions(driver);

		WebElement source = driver.findElement(By.id("draggable"));

		WebElement target = driver.findElement(By.id("droppable"));

		action.dragAndDrop(source, target).perform();

		// Verify if text changed after drop
		String textAfterDrop = target.getText();
		System.out.println("Text after drop: " + textAfterDrop);

		File srcs = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcs, new File("D:\\\\Selenium\\\\google12.png"));
		System.out.println("Screenshot saved");

		/*
		 * File srcs = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 * FileUtils.copyFile(srcs, new File("D:\\Selenium\\google12.png"));
		 * System.out.println("Screenshot1 saved!");
		 */

	}

}

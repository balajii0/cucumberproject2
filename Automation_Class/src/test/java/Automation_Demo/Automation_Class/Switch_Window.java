package Automation_Demo.Automation_Class;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Switch_Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions option = new ChromeOptions();
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");

		String windowone = driver.getWindowHandle();
		System.out.println(windowone);

		WebElement Clicklink = driver.findElement(By.xpath("//*[@id=\"content\"]/div/a"));
		Clicklink.click();

		Set<String> Windows = driver.getWindowHandles();
		Windows.size();
		System.out.println(Windows.size());

		for (String getallwindows : Windows)

		{
			System.out.println("getallwindows="+getallwindows);

			if (!getallwindows.equals(windowone)) {

				driver.switchTo().window(getallwindows);
				break;
			}
		}

		WebElement txt = driver.findElement(By.xpath("/html/body/div/h3"));
		String txtt = txt.getText();
		System.out.println(txtt);
		
		driver.switchTo().window(windowone);
		WebElement txxt = driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3"));
		String txxtt = txxt.getText();
		System.out.println(txxtt);
	}

}

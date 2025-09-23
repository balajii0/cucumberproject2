package Automation_Demo.Automation_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.dockerjava.api.model.Driver;

public class Waits_concepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeOptions option = new ChromeOptions();
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement firstname = driver.findElement(By.name("user-name"));
		firstname.sendKeys("Balaji");
		
		WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(5));
		WebElement Textwait = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[1]")));
		WebElement surname = driver.findElement(By.name("password"));
		surname.sendKeys("balajid");
		
	}

}

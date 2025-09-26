package Automation_learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class training_elements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions option = new ChromeOptions();
		WebDriver driver = new ChromeDriver(option);

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/");

//Textbox		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"item-0\"]")).click();
		WebElement Fullname = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
		Fullname.sendKeys("Balaji");
		WebElement Email = driver.findElement(By.xpath("//*[@id=\"userEmail\"]"));
		Email.sendKeys("balaji@d.com");
		WebElement CurAdd = driver.findElement(By.xpath("//*[@id=\"currentAddress\"]"));
		CurAdd.sendKeys("bangalore");
		WebElement perAdd = driver.findElement(By.xpath("//*[@id=\"permanentAddress\"]"));
		perAdd.sendKeys("KGF");
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"userForm\"]/div[5]/div"));
		submit.click();
		Thread.sleep(2000);

//Checkbox
		WebElement Checkbox = driver.findElement(By.xpath("//*[@id=\"item-1\"]"));
		Checkbox.click();
		WebElement toggle = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button"));
		toggle.click();
		WebElement chkbox = driver.findElement(By.xpath("//span[@class='rct-checkbox']"));
		chkbox.click();

//Radio buttons
		WebElement Radio = driver.findElement(By.xpath("//*[@id=\"item-2\"]"));
		Radio.click();
		WebElement YesRadi = driver.findElement(By.id("yesRadio"));

		Thread.sleep(2000);
		YesRadi.clear();

		if (YesRadi.isSelected()) {
			System.out.println("red radio b utton is selected");
		} else {

			System.out.println("Not red radio button is selected");
		}

		List<WebElement> cards = driver.findElements(By.xpath("//div[@class='card mt-4 top-card']"));

		System.out.println(cards);

	}

}

package Automation_learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class locators_class {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// when selenium drivers version is more then 4.1 we need not give
		// sys.setproperty.... instead we can give below line
		ChromeOptions option = new ChromeOptions();
		WebDriver driver = new ChromeDriver(option);

		driver.get("https://practicetestautomation.com/practice-test-login/");

		// ✅ Maximize the browser window
		driver.manage().window().maximize();

		String roleno = driver.findElement(By.xpath("/html/body/div/div/header/div[2]/div/div/a/img"))
				.getAttribute("decoding");

		System.out.println("roleno=" + roleno);

		if (roleno.equals("suresh")) {

			System.out.println("pass");

		} else {
			System.out.println("Fail");
		}

		// System.out.println(buttton);

		
		  WebElement username = driver.findElement(By.name("username"));
		  
		  username.sendKeys("student1234567890-"); Thread.sleep(1000);
		  
		  username.clear(); username.sendKeys("student"); WebElement password =
		  driver.findElement(By.id("password")); password.sendKeys("Password123");
		  
		  WebElement submit = driver.findElement(By.id("submit")); submit.click();
		  
		  String text = driver.findElement(By.className("post-title")).getText();
		  System.out.println(text);

		  WebElement Link = driver.findElement(By.tagName("a")); 
		  String href =  Link.getAttribute("href"); 
		  System.out.println(href);
		  
		  if (text.equals("Logd In Successfully")) { System.out.println("Pass"); } else
		  { System.out.println("Fail"); }
		  
		 
	}

}

package Automation_Demo.Automation_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class i_frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe");
        
        driver.switchTo().frame("iframeResult");
        //WebElement gettxt = driver.findElement(By.xpath("//h2[text() = 'HTML Iframes']"));
        // System.out.println(gettxt.getText());

        driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
       WebElement gettxtt = driver.findElement(By.xpath("//h1[text() = 'This page is displayed in an iframe']"));
        System.out.println(gettxtt.getText());

		driver.switchTo().defaultContent();
		
	}

}

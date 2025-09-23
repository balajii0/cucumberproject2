package Automation_Demo.Automation_Class;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class web_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.w3schools.com/html/html_tables.asp");

        // Locate the table
        WebElement table = driver.findElement(By.id("customers"));

        // Get all rows
        List<WebElement> rows = table.findElements(By.tagName("tr"));

        System.out.println("Total Rows: " + rows.size());
         
        // Loop through rows
         for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for (WebElement cell : cells) {
                System.out.print(cell.getText() + " | ");
                
            }
            System.out.println();
		
	}
	}
}

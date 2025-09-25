package cucumberproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginstepdefination {

	ChromeDriver driver;

	@Given("user is on loginpage")
	public void user_is_on_login_page() {
		ChromeOptions option = new ChromeOptions();
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("User is on login page");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_the_details(String uname, String pswd) {
		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pswd);
		System.out.println("details entered");
	}

	@And("click on login button")
	public void click_on_login_button() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("user is clicking on login button");
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
	}

	@Then("user should land on home page")
	public void user_should_land_on_home_page() {
		System.out.println("Login successful");
		// driver.close();
	}

}

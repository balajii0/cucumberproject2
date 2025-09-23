package Automation_Demo.Automation_Class;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demo_all {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		        ChromeOptions option = new ChromeOptions();
		        ChromeDriver driver = new ChromeDriver(option);

		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		        // 1️⃣ Launch Amazon
		        driver.get("https://www.amazon.in/");
		        System.out.println("Title: " + driver.getTitle());

		        // 2️⃣ Keyboard Activity (search using sendKeys + ENTER)
		        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		        searchBox.sendKeys("laptop");
		        searchBox.sendKeys(Keys.ENTER);

		        // 3️⃣ Take Screenshot
		        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		        FileUtils.copyFile(src, new File("amazon_search.png"));
		        System.out.println("Screenshot taken: amazon_search.png");

		        // 4️⃣ Mouse Hover (hover on Account & Lists)
		        WebElement accountList = driver.findElement(By.id("nav-link-accountList"));
		        Actions act = new Actions(driver);
		        act.moveToElement(accountList).perform();
		        Thread.sleep(2000);

		        // 5️⃣ Navigate to DemoQA for other examples
		        driver.navigate().to("https://demoqa.com/automation-practice-form");

		        // 6️⃣ Fill Form (SendKeys)
		        driver.findElement(By.id("firstName")).sendKeys("Balaji");
		        driver.findElement(By.id("lastName")).sendKeys("Student");
		        driver.findElement(By.id("userEmail")).sendKeys("test@gmail.com");

		        // 7️⃣ Radio Button
		        WebElement maleRadio = driver.findElement(By.xpath("//label[text()='Male']"));
		        maleRadio.click();

		        // 8️⃣ Checkbox
		        driver.navigate().to("https://demoqa.com/checkbox");
		        WebElement checkBox = driver.findElement(By.xpath("//span[@class='rct-checkbox']"));
		        checkBox.click();

		        // 9️⃣ Dropdown
		        driver.navigate().to("https://demoqa.com/select-menu");
		        WebElement drop = driver.findElement(By.id("oldSelectMenu"));
		        Select select = new Select(drop);
		        select.selectByVisibleText("Blue");

		        // 🔟 WebTable
		        driver.navigate().to("https://demoqa.com/webtables");
		        java.util.List<WebElement> rows = driver.findElements(By.xpath("//div[@class='rt-tr-group']"));
		        for (WebElement row : rows) {
		            System.out.println(row.getText());
		        }

		        // 1️⃣1️⃣ Iframe
		        driver.navigate().to("https://demoqa.com/frames");
		        driver.switchTo().frame("frame1");
		        System.out.println("Iframe text: " + driver.findElement(By.id("sampleHeading")).getText());
		        driver.switchTo().defaultContent();

		        // 1️⃣2️⃣ Alert
		        driver.navigate().to("https://demoqa.com/alerts");
		        driver.findElement(By.id("alertButton")).click();
		        Alert alert = driver.switchTo().alert();
		        System.out.println("Alert Text: " + alert.getText());
		        alert.accept();

		        // 1️⃣3️⃣ Upload File
		        driver.navigate().to("https://the-internet.herokuapp.com/upload");
		        WebElement uploadInput = driver.findElement(By.id("file-upload"));
		        uploadInput.sendKeys("C:\\Users\\Balaji\\Documents\\tes	tfile.txt");
		        driver.findElement(By.id("file-submit")).click();
		        System.out.println("File uploaded!");

		        // ✅ Close
		        driver.quit();

	}

}

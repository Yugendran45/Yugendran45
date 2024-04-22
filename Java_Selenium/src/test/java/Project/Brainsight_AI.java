package Project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.junit.AfterClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Brainsight_AI {

	WebDriver driver;
	ChromeOptions options;
	Robot r;

	// Open url
	@BeforeClass
	public void openurl() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://uat-vbexplore.brainsightai.com/login");
		driver.manage().window().maximize();
	}

	// Login the site
	@Test(priority = 1)
	public void Loginthesite() throws InterruptedException {
		driver.findElement(By.xpath("//input[@class='login-form-item-textbox form-control'][@type='email']"))
				.sendKeys("18uca1329.yugendran.k@gmail.com");
		driver.findElement(By.xpath("//input[@class='login-form-item-textbox form-control'][@type='password']"))
				.sendKeys("Yugendran@45");
		driver.findElement(By.xpath("//button[@class='login-form-item-button'][@type='submit']")).click();

	}

	// Click the Expected outputs option
	@Test(priority = 2)
	public void ClickExpectedoutputs() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()=' Expected Outputs '][@class='knowledge-base']")).click();
		driver.findElement(By.xpath("//div[@class='back-arrow']")).click();

	}

	// CLick Research page
	@Test(priority = 3)
	public void Researchpage() {
		driver.findElement(By.xpath("/html/body/div[1]/section/div/div/section[1]/div[1]/div[3]/div[2]")).click();
		driver.navigate().back();
	}
	// Click ACQ parameter

	@Test(priority = 4)
	public void ACQparameter() {
		driver.findElement(By.xpath("/html/body/div/section/div/div/section[1]/div[1]/div[3]/div[3]")).click();
		driver.findElement(By.xpath("//div[@class='back-arrow']")).click();
	}

	// Click how to view results tree
	@Test(priority = 5)
	public void Howtoviewresultstree() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div/section/div/div/section[1]/div[1]/div[3]/div[4]")).click();
		driver.navigate().back();
	}

	// Click new upload option
	@Test(priority = 6)
	public void Newuploadoption() {
		driver.findElement(By.id("newUploadBtn")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/div/div/div[2]/div/div[1]/input"))
				.sendKeys("0103");
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='series-desc-select width-100']"));
		Select s = new Select(dropdown);
		s.selectByVisibleText("Others");
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/div/div/div[2]/div/div[2]/div/input"))
				.sendKeys("some issue");
		driver.findElement(By.xpath("//input[@placeholder='(required)']")).sendKeys("Male");
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/div/div/div[2]/div/div[4]/input"))
				.sendKeys("65");
		driver.findElement(By.xpath("//button[text()=' Proceed ']")).click();

	}

	// Click select box
	@Test(priority = 7)

	public void Uploadnewpatient() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Glioma Segmentation']")).click();
		// driver.findElement(By.xpath("//div[text()='Tractography']")).click();
		driver.findElement(By.xpath("//button[text()=' Proceed ']")).click();

	}
	// Uploading a file

	@Test(priority = 8)
	public void Uploadingfolder() throws IOException, AWTException, InterruptedException {
		driver.findElement(By.xpath("//div[@class='fileDropper']")).click();
		// using autoIT

		Runtime.getRuntime().exec("D:\\yugendran\\Newproject.exe");
		Thread.sleep(8000);
		// using robot class
		r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	// Select data

	@Test(priority = 9)

	public void Selectdata() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div[2]/div[1]/div/div/div/div/div[2]/div[1]/div[2]/div/div[1]/div[1]/div/label[1]/span"))
				.click();
		driver.findElement(By.xpath("//label[@for='anonymised_optn']")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div[2]/div[2]/button")).click();
		driver.findElement(By.xpath("//button[@class='folder-proceed-btn agree-btn']")).click();

	}

	// Change the folder
	@Test(priority = 10)
	public void Changefolder() throws IOException, AWTException, InterruptedException {
		driver.findElement(By.xpath("//button[@class='change-file-btn']")).click();
		driver.findElement(By.xpath("//div[@class='fileDropper']")).click();
		Runtime.getRuntime().exec("D:\\yugendran\\Newproject2.exe");
		Thread.sleep(8000);
		// using robot class
		r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div[2]/div[1]/div/div/div/div/div[2]/div[1]/div[2]/div/div[1]/div[1]/div/label[1]/span"))
				.click();
		driver.findElement(By.xpath("//label[@for='anonymised_optn']")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div[2]/div[2]/button")).click();
	}

	@Test(priority = 11)
	public void Agreeoption() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()=' Agree ']")).click();
		Thread.sleep(7000);
		WebElement d = driver.findElement(By.xpath("//select[@class='series-desc-select']"));
		d.click();
		Select s1 = new Select(d);
		s1.selectByVisibleText("T1c");
		Thread.sleep(6000);
	}

	@Test(priority = 12)
	public void secondoptionclick() throws InterruptedException {
		Thread.sleep(7000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		WebElement d1 = driver
				.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div/div[3]/select"));
		Select s2 = new Select(d1);
		s2.selectByVisibleText("FLAIR");
		Thread.sleep(7000);
		WebElement d3 = driver
				.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div/div[4]/select"));
		d3.click();
		Select s3 = new Select(d3);
		s3.selectByVisibleText("T2w");
		driver.findElement(By.xpath("//button[@class='folder-proceed-btn']")).click();

	}

	@Test(priority = 13)

	public void confirmmodulesoption() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.xpath("//div[@class='confirm-button']")).click();
		driver.findElement(By.xpath("//div[@class='payment-button']")).click();
	}

	// Signout the page

	//@AfterClass
	//public void logout() {
	//	driver.findElement(By.xpath("/html/body/div/section/div/div/section[1]/div[1]/div[3]/div[5]/svg/rect")).click();

	//}

}

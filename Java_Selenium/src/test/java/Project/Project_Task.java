package Project;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Project_Task {
	 WebDriver driver;

		// Lanuch the browser
		@Test(priority = 1)
		public void Lanuch_the_site() {
			driver = new ChromeDriver();
			WebDriverManager.chromiumdriver().setup();
			driver.get("https://accounts.vmmaps.com/");
			driver.manage().window().maximize();
		}

		// Click regsister option without data

		@Test(priority = 2)
		public void Verify_withoutdata_click_usernaem_and_password() {
			driver.findElement(By.id("login-submit-text")).click();
			driver.navigate().refresh();
		}

		// Enter invalid Inusername and Inpassword

		@Test(priority = 3)
		public void Invalid_username_and_password() throws InterruptedException {
			driver.findElement(By.id("login-email")).sendKeys("yugnedran");
			driver.findElement(By.id("login-password")).sendKeys("Yugendran@45");
			driver.findElement(By.id("login-submit-text")).click();
		}

		// Enter Invalid password

		@Test(priority = 4)
		public void Invalid_username_password() {
			driver.findElement(By.id("login-email")).sendKeys("yugnedrankumar001@gmail.com");
			driver.findElement(By.id("login-password")).sendKeys("Yugendr45");
			driver.findElement(By.id("login-submit-text")).click();

		}

		// Enter usernaem and password

		@Test(priority = 5)
		public void Entered_correct_username_and_password() throws InterruptedException {
			WebElement Username = driver.findElement(By.id("login-email"));
			Username.clear();
			Username.sendKeys("yugnedrankumar001@gmail.com");
			WebElement password = driver.findElement(By.id("login-password"));
			password.clear();
			password.sendKeys("Yugendran@45");
			driver.findElement(By.id("login-submit-text")).click();
			Thread.sleep(3000);
			driver.navigate().refresh();
		}

		// Regsister user
		@Test(priority = 6)
		public void Enter_Signup_option() throws InterruptedException {
			Thread.sleep(4000);
			driver.findElement(By.id("registerHere")).click();
			driver.findElement(By.id("signup-username")).sendKeys("Yugendran");
			driver.findElement(By.id("signup-email")).sendKeys("yugendrankumar001@gmail.com");
			driver.findElement(By.id("signup-mobile")).sendKeys("6382880619");
			driver.findElement(By.id("signup-password")).sendKeys("Yugendran@45");
			driver.findElement(By.id("signup-confirmPassword")).sendKeys("Yugnedran@45");
			driver.findElement(By.id("terms-vms-policy")).click();
			driver.findElement(By.id("newsLetter")).click();
			driver.findElement(By.id("signup-submit-text")).click();

			// OTP page set timer enter manuvally

			driver.findElement(By.id("signinToggle")).click();

		}

		// Forget password
		@Test(priority = 7)
		public void Forget_password() throws InterruptedException {
			Thread.sleep(2000);
			driver.findElement(By.id("login-email")).sendKeys("yugendrankumar001@gmail.com");
			driver.findElement(By.id("Forgot-Password")).click();
			// set timer then enter manuvally
			Thread.sleep(2000);
			driver.findElement(By.id("Resetpassword")).sendKeys("Yugendran@45");
			driver.navigate().refresh();

		}
	}

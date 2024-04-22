package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement element = driver
				.findElement(By.xpath("//span[@class='icp-nav-flag icp-nav-flag-in icp-nav-flag-lop']"));
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
		driver.findElement(By.xpath("//span[text()='English']")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/span[2]/span/input")).click();

		WebElement wd = driver.findElement(By.id("searchDropdownBox"));
		Select s = new Select(wd);
		s.selectByVisibleText("Industrial & Scientific");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("new updates", Keys.ENTER);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes", Keys.ENTER);
		WebElement gotopage =driver.findElement(By.xpath("//a[@aria-label='Go to page 2']"));
		JavascriptExecutor js = (JavascriptExecutor)(driver);
		js.executeScript("window.scrollBy(0, 10000)", gotopage);
		gotopage.click();

	}
}

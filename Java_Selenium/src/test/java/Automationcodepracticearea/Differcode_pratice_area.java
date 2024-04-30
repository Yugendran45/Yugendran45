package Automationcodepracticearea;

import java.util.List;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Differcode_pratice_area {
	
	
	static WebDriver driver;

	@BeforeTest
	public void before_lanch_url() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();

	}
	
	@Test(priority=0)
	public void Randomworkit() {
		Actions action = new Actions(driver);
		WebElement doubleclick = driver.findElement(By.xpath("//a[@class='a-carousel-goto-nextpage']"));
		action.contextClick(doubleclick).click();
       WebElement  mouse = driver.findElement(By.xpath("//span[@class='icp-nav-flag icp-nav-flag-in icp-nav-flag-lop']"));
		action.moveToElement(mouse).perform();
		driver.navigate().refresh();
	}
	
	@Test(priority=1)
	public void Scrollandclick() {
		JavascriptExecutor script =(JavascriptExecutor)(driver);
		script.executeScript("window.scrollBy(0, 1500);", true);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[3]/div/div/div[2]/div/ul/li[4]/span/a/img")).click();
	}
	
	@Test(priority=2)
	public void Auto_suggestion() {
   driver.findElement(By.id("twotabsearchtextbox")).sendKeys("wildcraft");
   List<WebElement> findElements = driver.findElements(By.xpath("/html/body/div[2]/header/div/div[2]/div/div[2]"));
   int size = findElements.size();
	System.out.println(size);
	for(int i =0 ; i<size; i++) {
		System.out.println(findElements.get(i).getText());
	
		
		
	}
	
	
	
	
	}

}

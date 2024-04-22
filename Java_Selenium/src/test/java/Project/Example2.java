package Project;

import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example2 {
	
	WebDriver driver;
	
	
	
	@BeforeClass
	public void Lanuch_browser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();	
		driver = new ChromeDriver();
		driver.get("https://www.ulektz.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='uc-foc-close']")).click();
		Thread.sleep(3000);
        driver.findElement(By.id("uc-signin-email-field")).sendKeys("yugendran@ulektz.in");
		driver.findElement(By.id("password-input")).sendKeys("12345",Keys.ENTER);
		
	}
	@Test
	public void CLick_Community_option() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' Communities']")).click();
		driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[1]/div/div[1]/div[2]/div[2]/a")).click();
	}
   
	@Test(dataProvider ="provide")
	
	public void Read_xlsx(String s,String s2,String s3,String s4,String s5) throws FileNotFoundException, InterruptedException {
		
    WebElement communityname = driver.findElement(By.id("communityname"));
    communityname.sendKeys(s);
    WebElement communityaddress = driver.findElement(By.id("communityaddress"));
    communityaddress.sendKeys(s2);
    WebElement communityemail = driver.findElement(By.id("communityemail"));
    communityemail.sendKeys(s3);
    WebElement contactname = driver.findElement(By.id("communitycontactno"));
    contactname.sendKeys(s4);
    WebElement aboutcommunity = driver.findElement(By.id("aboutcommunity"));
    aboutcommunity.sendKeys(s5);
    WebElement createcommunity = driver.findElement(By.id("createComBtn"));
    createcommunity.click();
    driver.findElement(By.id("createCommunityview")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[1]/div/div[1]/div[2]/div[2]/a")).click();
    
	}
	
	@DataProvider (name ="provide")
	public Object[][] datasend() {
		
		return new Object[][] {{"commun3","chennai","com@gmail.com","9876543212","its"},{"commun2","banglore1","com1@gmail.com","9876543212","its"}}; 

	}
}

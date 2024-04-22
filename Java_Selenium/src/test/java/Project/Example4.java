package Project;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example4 {
	
	WebDriver driver;

	@BeforeClass
	public void Lanuch_browser() throws InterruptedException {
		driver = new ChromeDriver();
		WebDriverManager.chromiumdriver().setup();
	
		driver.get("https://www.ulektz.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='uc-foc-close']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("uc-signin-email-field")).sendKeys("yugendran@ulektz.in");
		driver.findElement(By.id("password-input")).sendKeys("12345", Keys.ENTER);
	}

	@Test(priority=0)
	public void CLick_Community_option() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' Communities']")).click();
		driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[1]/div/div[1]/div[2]/div[2]/a")).click();
	}

	@Test(priority=1)
	public void Basicexcelimport() throws IOException, InterruptedException {
		FileInputStream file = new FileInputStream("D:\\Notepad\\44630200.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheet("Sheet2");
		int lastRowNum = sheet.getLastRowNum();
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		for (int i = 0; i <= lastRowNum; i++) {
			String Communityname = new DataFormatter().formatCellValue(sheet.getRow(i).getCell(0));
			String Communityaddress = new DataFormatter().formatCellValue(sheet.getRow(i).getCell(1));
			String email = new DataFormatter().formatCellValue(sheet.getRow(i).getCell(2));
			String mobilenumber = new DataFormatter().formatCellValue(sheet.getRow(i).getCell(3));
			String about = new DataFormatter().formatCellValue(sheet.getRow(i).getCell(4));

			/*
			 * System.out.println(Communityname); System.out.println(Communityaddress);
			 * System.out.println(email); System.out.println(mobilenumber);
			 * System.out.println(about);
			 * 
			 */			WebElement communityname = driver.findElement(By.id("communityname"));
			communityname.sendKeys(Communityname);
			WebElement communityaddress = driver.findElement(By.id("communityaddress"));
			communityaddress.sendKeys(Communityaddress);
			WebElement communityemail = driver.findElement(By.id("communityemail"));
			communityemail.sendKeys(email);
			WebElement contactname = driver.findElement(By.id("communitycontactno"));
			contactname.sendKeys(mobilenumber);
			WebElement aboutcommunity = driver.findElement(By.id("aboutcommunity"));
			aboutcommunity.sendKeys(about);
			WebElement createcommunity = driver.findElement(By.id("createComBtn"));
			createcommunity.click();
			Thread.sleep(2000);
			driver.navigate().refresh();	
			//driver.findElement(By.id("createCommunityview")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[1]/div/div[1]/div[2]/div[2]/a")).click();

		}

	}

}

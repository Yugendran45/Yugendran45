package Interview_Realted;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class Assement {

	WebDriver driver;
	
//	Web Automation Using Selenium
//	=============================
	
	@Test(priority=1)
	public void Navigate_to_url() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	@Test(priority=2)
	public void Search_the_product() throws InterruptedException, IOException, TesseractException {
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Hindi books",Keys.ENTER);
    driver.findElement(By.xpath("//span[text()='Premchand ki Anmol Kahaniya (Hindi) [Paperback] Munshi Premchand [Paperback] Munshi Premchand']")).click();
	String currentUrl = driver.getCurrentUrl();
    Set<String> windowHandles = driver.getWindowHandles();
    Iterator<String> iterator = windowHandles.iterator();
    String parent = iterator.next();
    String child = iterator.next();
    driver.switchTo().window(child);
    		//Get user reviews
    		WebElement userratings = driver.findElement(By.id("acrCustomerReviewText"));
    		String Userretingstext = userratings.getText();
    		System.out.println(Userretingstext);
    		
    		//Get product name 
    		WebElement producttitle = driver.findElement(By.id("productTitle"));
    		String producttitletext = producttitle.getText();
    		System.out.println(producttitletext);
    		
    		
    		//Get product price
    		WebElement productamout = driver.findElement(By.xpath("//span[text()='179']"));
    		String productamouttext = productamout.getText();
    		System.out.println(productamouttext);
    		
    		
    		//Screenshot the page 
    		TakesScreenshot screenshot = (TakesScreenshot)(driver);
    		File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
    		FileUtils.copyFile(screenshotAs, new File("C:\\Users\\yugendran\\git\\Yugendran45\\Java_Selenium\\Screenshot.file\\Screenshot.png"));
    		
    		//Convert to json format 
    		JSONArray bookList = new JSONArray();
    		JSONObject bookDetails = new JSONObject();
            bookDetails.put("name", producttitletext);
            bookDetails.put("price", productamouttext);
            bookDetails.put("rating", Userretingstext);
            bookList.add(bookDetails);
            System.out.println(bookList);
            
            
            
              
       	
    	}
    	
    	
    
	
	
	
	
	

}

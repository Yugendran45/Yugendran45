package Sample_work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Booking_com {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		WebDriverManager.chromiumdriver().setup();
		driver.get("https://www.booking.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label='Dismiss sign in information.']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Where are you going?']")).sendKeys("Banglore");
		driver.findElement(By.xpath("//span[text()='Check-in date']")).click();
		driver.findElement(By.xpath("//span[@data-date='2024-04-12']")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//span[text()='Check-out date']")).click();
		driver.findElement(By.xpath("//span[@aria-label='15 April 2024']")).click();
 		driver.findElement(By.xpath("//button[@data-testid='occupancy-config']")).click();
 		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/form/div[1]/div[3]/div/div/div/div/div[1]/div[2]/button[2]/span/span/svg")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/form/div[1]/div[3]/div/div/div/div/div[1]/div[2]/button[2]/span/span/svg")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/form/div[1]/div[3]/div/div/div/div/div[1]/div[2]/button[2]/span/span/svg")).click();
    	driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}

package intro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SellIntroduction {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver  = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("inputUsername")).sendKeys("Vishal");
		driver.findElement(By.name("inputPassword")).sendKeys("Vishal123");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Vishal");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("v@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("Vish@gmail.com");
		driver.findElement(By.xpath("//form/input[3] ")).sendKeys("7011281843");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.xpath("//button[contains(@class,'login')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Vishal");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		
		
	}

}

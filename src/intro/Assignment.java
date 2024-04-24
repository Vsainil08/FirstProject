package intro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://qaclickacademy.com/practice.php");

		driver.findElement(By.id("autocomplete")).sendKeys("Ind");
		Thread.sleep(3000);
		
		List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] div"));
		
		
		for(WebElement option:options)
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
			}
			
		}
	}

}

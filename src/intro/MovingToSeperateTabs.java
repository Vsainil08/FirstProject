package intro;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MovingToSeperateTabs {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.get("https://qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		
		WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
		
		
		for(int i=1;i<columnDriver.findElements(By.tagName("a")).size();i++)
		{
			String clickOnTab = Keys.chord(Keys.LEFT_CONTROL,Keys.ENTER);
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnTab);
			Thread.sleep(5000);
		}
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		
		
		
	}

}

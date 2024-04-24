package intro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Section12Assignment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://qaclickacademy.com/practice.php");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		
		
		List<WebElement> rowElement =driver.findElements(By.cssSelector(".table-display tr"));
		
		int rows=0;
		
		for(int i=0;i<rowElement.size();i++)
		{
			rows++;
		}
		
		System.out.println("Rows are:"+rows);
		
		List<WebElement> columnElement = driver.findElements(By.cssSelector(".table-display tr:nth-child(1) th"));
		
		int columns=0;
		
		for(int i=0;i<columnElement.size();i++)
		{
			columns++;
		}
		
		System.out.println("Columns are:"+columns);
		
		
		List<WebElement> text =driver.findElements(By.cssSelector(" .table-display tr:nth-child(3) td"));
		
		for(int i=0;i<text.size();i++)
		{
			System.out.println(text.get(i).getText());
		}
		
		
//		WebDriver driver=new ChromeDriver();
//
//
//
//		driver.get("http://qaclickacademy.com/practice.php");
//
//
//
//		WebElement table=driver.findElement(By.id("product"));
//
//
//
//		System.out.println(table.findElements(By.tagName("tr")).size());
//
//
//
//		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
//
//
//
//		List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
//
//
//
//		System.out.println(secondrow.get(0).getText());
//
//
//
//		System.out.println(secondrow.get(1).getText());
//
//
//
//		System.out.println(secondrow.get(2).getText());
//		
	}

}

package intro;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JsTwo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		
		List<WebElement> elements =driver.findElements(By.xpath("//tr/td[1]"));
		
		
		List<String> originalList = elements.stream().map(s->s.getText()).collect(Collectors.toList());
		
		System.out.println(originalList);
		
		System.out.println();
		
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		
		System.out.println(sortedList);
		
		Assert.assertTrue(originalList.equals(sortedList));
		
		List<String> price;
		do
		{
	    List<WebElement> rows =driver.findElements(By.xpath("//tr/td[1]")); 	
	    price = rows.stream().filter(s->s.getText().contains("Rice")).
				map(s->getPrice(s)).collect(Collectors.toList());
	    
		price.forEach(a->System.out.println(a));
		if(price.size()<1)
		{
			driver.findElement(By.cssSelector("[aria-label='Next']")).click();
		}
		}while(price.size()<1);
		
		
		String item="Rice";
		List<WebElement> original;
		driver.findElement(By.id("search-field")).sendKeys(item);
		
		List<WebElement> displayedItem =  driver.findElements(By.xpath("//tr/td[1]"));
		original = displayedItem.stream().filter(s->s.getText().contains(item)).collect(Collectors.toList());
		
		Assert.assertTrue(displayedItem.equals(original));
		
		driver.close();
	
	}

	private static String getPrice(WebElement s) {
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}
	
		
		
	




}

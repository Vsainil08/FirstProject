package intro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E2E {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    driver.findElement(By.xpath("//input[@placeholder='Type to Select']")).click();
	    driver.findElement(By.id("autosuggest")).sendKeys("Ind");
	    Thread.sleep(3000);
	    List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item']"));

	    
	    for(WebElement option:options)
		{
			if(option.getText().equalsIgnoreCase("India"))
{
                      option.click();
                      break;
}
		}
	    
	    
	    
	    
	    driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	    driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DEL']")).click();
	    driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
	    
	    if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.println("It is disabled");
			 Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	    
	    
	    
	    
	    
	    
	    
	    System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	    
	    driver.findElement(By.id("divpaxinfo")).click();
	    Thread.sleep(2000);
    
        for(int i=1;i<5;i++)
	        {
	    	    driver.findElement(By.id("hrefIncAdt")).click();
	        }
	    
	    driver.findElement(By.id("btnclosepaxoption")).click();
	    
	    
	    WebElement MainDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	    Select dropdown = new Select(MainDropdown);
	    dropdown.selectByIndex(1);
	    System.out.println(dropdown.getFirstSelectedOption().getText());
	    
	    
	    
	    driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	    
	    
    
	    

		//driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		
		
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		

		

	}

}

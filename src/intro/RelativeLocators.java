package intro;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeLocators {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		
		WebElement nameBox = driver.findElement(By.cssSelector("[name='name']"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameBox)).getText());
		
		
		WebElement belowBox = driver.findElement(By.cssSelector("[for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(belowBox)).click();
		
		WebElement leftOff =driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(leftOff)).click();
		
		WebElement rightOff =driver.findElement(By.xpath("//input[@value='option1']"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rightOff)).getText());

	}

}

package intro;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsAndPartialSs {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://rahulshettyacademy.com/#/index");
		
//		String text =driver.findElement(By.xpath("//a[text()='All-Access Membership-Complete Access to 25+ Courses (and counting!)']")).getText();
//		
//		driver.switchTo().newWindow(WindowType.TAB);
//		
//		driver.get("https://rahulshettyacademy.com/angularpractice/");
//		
//		driver.findElement(By.cssSelector("[name='name']")).sendKeys(text);
		
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://rahulshettyacademy.com/#/index");
		
		String text =driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		
		System.out.println(text);
		
		Set<String> handles =driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		String parentId =it.next();
		String childId =it.next();
		
		driver.switchTo().window(parentId);
		
		WebElement name =driver.findElement(By.cssSelector("[name='name']"));
		name.sendKeys(text);
		File file = name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("logo.png"));
		
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
		
		

	}

}

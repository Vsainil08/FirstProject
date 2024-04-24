package intro;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ThoughtSphere {

	public static void main(String[] args) throws InterruptedException, AWTException  {
		
		WebDriver driver= new ChromeDriver();
		Actions a= new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://tsp-sprint-demo.thoughtsphere.com/clinact/");
		driver.manage().window().maximize();
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(10000);
		driver.findElement(By.id("input-vaadin-text-field-6")).sendKeys("vishal.saini@thoughtsphere.com");
		driver.findElement(By.id("input-vaadin-password-field-7")).sendKeys("Vishal@12345");
		driver.findElement(By.cssSelector("vaadin-button[class='small']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//vaadin-button[@title='Application Configuration']")).click();
		driver.findElement(By.xpath("//vaadin-button[@class='valo-menu-item submenu'][1]")).click();
		a.moveToElement(driver.findElement(By.cssSelector("div div vaadin-horizontal-layout[class='content_bread_crumb'] "
				+ "vaadin-horizontal-layout[theme='spacing'] vaadin-menu-bar[role='menubar'] "))).build().perform();
		driver.findElement(By.cssSelector("vaadin-context-menu-overlay[id='overlay'] "
				+ "vaadin-context-menu-list-box[class='vaadin-menu-list-box']")).click();
		Thread.sleep(1000);
//		var ShadowDom = driver.findElement(By.cssSelector("vaadin-dialog-overlay[id='overlay']"));
//		System.out.println(ShadowDom);
//		var ShadowRoot = ShadowDom.getShadowRoot();
//		System.out.println(ShadowRoot);
		 driver.findElement(By.id("input-vaadin-text-field-102")).sendKeys("V-study");
		//StudyName.sendKeys("V-STUDY");
		 driver.findElement(By.id("input-vaadin-text-field-104")).sendKeys("V-study");
		 Thread.sleep(1000);
		 driver.findElement(By.id("label-vaadin-date-picker-181")).getText();
		 
		
//		WebElement StudyName = driver.findElement(By.cssSelector("body vaadin-dialog-overlay[id='overlay'] flow-component-renderer[style='display: flex; height: 100%;'] "
//				+ "div[class='draggable draggable-leaf-only'] vaadin-vertical-layout[style='width: 100%; height: 100%;'] "
//				+ "vaadin-vertical-layout[theme='rightPopup_content'] vaadin-vertical-layout[style='width: 100%; height: 100%;'] "
//				+ "vaadin-vertical-layout[id='pnlMain'] vaadin-vertical-layout[style='max-height: 430px; width: 100%; height: 100%;'] "
//				+ "vaadin-horizontal-layout[style='width: 100%;']:nth-child(1) vaadin-text-field[id='txtStudyName'] "
//				+ "input[slot='input']"));
//		//StudyName
//		a.moveToElement(StudyName).click().sendKeys("V-STUDY").build().perform();
//		Thread.sleep(500);
//		//StudyNumber
//		a.moveToElement(StudyName).click().keyDown(Keys.TAB).sendKeys("V-STUDY").build().perform();
//		//StartDate
//		Thread.sleep(500);
//		a.moveToElement(StudyName).click().keyDown(Keys.TAB).sendKeys(Keys.TAB).sendKeys("10-Mar-2024").click().build().perform();
//		Thread.sleep(500);
//		//EndDate
//		a.moveToElement(StudyName).click().keyDown(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("31-Mar-2024").click().build().perform();
//		Thread.sleep(1000);
//		driver.findElement(By.cssSelector("vaadin-vertical-layout[theme='padding'] vaadin-text-area[id='taDescription'] textarea[slot='textarea']")).sendKeys("V-STUDY");
//		Thread.sleep(1000);
//		WebElement Sponsor = driver.findElement(By.cssSelector("vaadin-horizontal-layout[theme='spacing'] vaadin-text-field[id='txtSponsor'] input[id='input-vaadin-text-field-107']"));  
//		
//		a.moveToElement(Sponsor).click().sendKeys("Automation").build().perform();
//		
//		
//		
//		WebElement status = driver.findElement(By.cssSelector("vaadin-combo-box[id='cmbStatus'] input[id='input-vaadin-combo-box-109']"));
//		a.moveToElement(status).click().sendKeys("Active").click().keyDown(Keys.TAB).build().perform();
//		
//		
//		WebElement TherapeuticArea = driver.findElement(By.cssSelector("vaadin-vertical-layout[theme='padding'] vaadin-horizontal-layout[theme='spacing'] vaadin-combo-box[id='cmbTherapeutic'] input[id='input-vaadin-combo-box-111']"));
//		
//		a.moveToElement(TherapeuticArea).click().sendKeys("Cardiovascular").build().perform();
//
//
//		a.moveToElement(TherapeuticArea).click().keyDown(Keys.TAB).sendKeys("V-STUDY").build().perform();
//		
//		a.moveToElement(TherapeuticArea).click().keyDown(Keys.TAB).keyDown(Keys.TAB).sendKeys("Phase 1").click().build().perform();
//		
//		
//		List<WebElement> Source = driver.findElements(By.cssSelector("vaadin-grid[overflow='bottom'] vaadin-grid-cell-content"));
//		
//		
//	
//		
//		for(int i=0;i<Source.size();i++)
//		{
//			
//				if (Source.get(i).getText().equalsIgnoreCase("Clinical_Audit")) 
//				{
//					
//					Source.get(i).click();
//				}	
//		}
//		
//		driver.findElement(By.cssSelector("vaadin-horizontal-layout[theme='spacing'] vaadin-vertical-layout vaadin-button vaadin-icon[icon='vaadin:chevron-right-small']")).click();
//		
//		
	}
	

}

package intro;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.asserts.SoftAssert;

public class HttpClassAndScreenshotPractice {

	public static void main(String[] args) throws IOException {
		
		ChromeOptions option = new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(src,new File( "C:\\ThoughtSphere\\Selenium\\spt.png"));
		
		List<WebElement> links =driver.findElements(By.cssSelector("li[class='gf-li'] a"));
				
	    SoftAssert sa = new SoftAssert();
	    
	    for(WebElement link:links)
	    {
	    	
	    	String url =link.getAttribute("href");
	    	HttpURLConnection hrc = (HttpURLConnection)new URL(url).openConnection();
	    	hrc.setRequestMethod("HEAD");
	    	hrc.connect();
	    	int respCode = hrc.getResponseCode();
	    	System.out.println(respCode);
	    	sa.assertTrue(respCode<400, "The link with text "+link.getText()+" is broken with code "+respCode );
		
		
		
	    }
	    
	    sa.assertAll();
		
	}
	}



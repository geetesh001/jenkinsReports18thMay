package testScenario;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicTestCase {

	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\AA_SELENIUM_BASICS\\zz_eclipse_project\\JenkinsProject18thMay\\Resource\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("geetesh001@yahoo.co.in");
		
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("abce");
	
		driver.findElement(By.xpath(".//*[@id='u_0_q']")).click();
		
		System.out.println(driver.getTitle());
		
		 driver.quit();
	}
	
}

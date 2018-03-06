package scripts;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class uidhsuihd {
	@Test
	public void uidhsuihdTest() throws Throwable
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TYSS\\Desktop\\Automation\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement wb=driver.findElement(By.xpath("//a[text()='SwitchTo']"));
		Actions act=new Actions(driver);
		act.moveToElement(wb).perform();
		driver.findElement(By.xpath("//a[text()='Windows']")).click();
		driver.findElement(By.xpath("//div[@id='Tabbed']//button[contains(text(),'click')]")).click();
		Set<String> set=driver.getWindowHandles();
		int count=set.size();
		Iterator<String> it=set.iterator();
		String parentId=it.next();
		String childId=it.next();
		driver.switchTo().window(childId);
		Thread.sleep(2000);
		
	/*	for (String test : set) {
			
		String title=	driver.getTitle();
		System.out.println(title);
		if(title.equals(""));
		driver.close();
			
		}*/
		
	
		                       
//		driver.switchTo().window(parentId);
	Thread.sleep(3000);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='WebTable']"))).perform();
//		
//		
//		System.out.println(driver.getCurrentUrl()); 
		//act.moveToElement(driver.findElement(By.xpath("//div[@class='navbar-collapse collapse']//a[text()='Documentation']")));
		
		
	}

}

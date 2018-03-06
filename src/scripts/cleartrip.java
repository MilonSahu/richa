package scripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class cleartrip {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TYSS\\Desktop\\Automation\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		WebElement msel=driver.findElement(By.id("Adults"));
		Select sel=new Select(msel);
		List<WebElement> lst = sel.getOptions();
		for(int i=0;i<lst.size();i++)
		{
			System.out.println(lst.get(i).getText());
		}
		Thread.sleep(3000);
		String s=driver.findElement(By.xpath("//h4[text()='12 Must-See Places to Visit in Bengaluru']/../div[1]/p[1]")).getText();
		System.out.println(s);
		
	}

}

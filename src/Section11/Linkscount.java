package Section11;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Linkscount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		
		WebElement column = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		int nooflinks= column.findElements(By.tagName("a")).size();
		
		for(int i=1;i<nooflinks;i++)
		{
			String clickonlink = Keys.chord(Keys.CONTROL,Keys.ENTER);
			column.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
			
		}
		
		Set<String> windows =  driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			Thread.sleep(3000);
			System.out.println(driver.getTitle());
		}
		

	}

}

package Section12;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scroll(0,500)");
		
		int rowcount = driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr")).size();
		int columncount = driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr[1]/th")).size();
		List<WebElement> row2= driver.findElements(By.xpath("//table[@name='courses']/tbody/tr[3]/td"));
		
	
		for(int i=0;i<row2.size();i++)
		{
			System.out.println(row2.get(i).getText());
		}
		
		System.out.println(rowcount+" "+columncount);

	}

}

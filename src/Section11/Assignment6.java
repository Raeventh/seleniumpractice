package Section11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		String text= driver.findElement(By.cssSelector("label[for='honda']")).getText();
		
		driver.findElement(By.id("checkBoxOption3")).click();
		WebElement dropdown= driver.findElement(By.id("dropdown-class-example"));
		dropdown.click();
		Select d = new Select(dropdown);
		d.selectByVisibleText(text);
		
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();
		
		String VerifyingText= driver.switchTo().alert().getText();
		
		
		
		
		
		if(VerifyingText.contains(text))
		{
			driver.switchTo().alert().accept();
			System.out.println("Gotcha");
			System.out.println("Whistle podu");//Trying out the git version control here
			System.out.println("GOAT"); //pushing to github and pulling it from cloneproject
		}
		else
		{
			System.out.println("Not found");
		}
		
		
		

	}

}

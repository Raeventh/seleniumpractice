package Section13;

import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Sslcertificatehandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EdgeOptions options=new EdgeOptions();
		options.setAcceptInsecureCerts(true);
		
		WebDriver driver=new EdgeDriver(options);
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();
		driver.getTitle();
	}

}

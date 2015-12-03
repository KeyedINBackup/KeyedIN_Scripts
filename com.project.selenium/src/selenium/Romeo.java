package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Romeo {
	
	public static WebDriver dr;
	
	public static void main(String[] args){
		dr = new FirefoxDriver();
		dr.manage().window().maximize();
		dr.get("http://dev.researchservicesoffice.com");
		dr.findElement(By.partialLinkText("Super User")).click();
		dr.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	

}

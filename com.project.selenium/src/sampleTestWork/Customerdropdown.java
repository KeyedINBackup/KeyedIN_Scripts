package sampleTestWork;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Customerdropdown {

	public static WebDriver dr= new FirefoxDriver();
	
	public static void main(String[] args) throws InterruptedException{
		dr.get("http://kimdev01.keyedinuat.com/Dev03/User/SignIn");
		dr.manage().window().maximize();
		dr.findElement(By.xpath(".//input[@name='username']")).sendKeys("lizc-admin");
		dr.findElement(By.xpath(".//input[@name='password']")).sendKeys("password");
		dr.findElement(By.xpath(".//input[@value='Sign In']")).click();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.findElement(By.xpath(".//a[@title='Sales Orders']")).click();
		dr.findElement(By.xpath(".//*[@id='main']/div/div[1]/div[2]/div/ul/li[1]/ul/li[1]/ul/li[1]/div[1]/a[3]")).click();
		// Customer drop down options 
		/*dr.findElement(By.xpath(".//*[@id='select2-chosen-2']")).click();
		TimeUnit.SECONDS.sleep(2);
		List<WebElement> InnerList = dr.findElements(By.xpath(".//*[@id='select2-results-2']"));
		for(WebElement s:InnerList){
			String result=s.getText();
			System.out.println(result);
			
		}*/
		// Sales order drop down options
		/*dr.findElement(By.xpath(".//*[@id='select2-chosen-4']")).click();
		TimeUnit.SECONDS.sleep(2);
		List<WebElement> InnerList = dr.findElements(By.xpath(".//*[@id='select2-results-4']"));
		for(WebElement s:InnerList){
			String result=s.getText();
			System.out.println(result);
			
		}*/
		//
		dr.findElement(By.xpath(".//*[@id='select2-chosen-6']")).click();
		TimeUnit.SECONDS.sleep(2);
		List<WebElement> InnerList = dr.findElements(By.xpath(".//*[@id='select2-results-6']"));
		for(WebElement s:InnerList){
			String result=s.getText();
			System.out.println(result);
			
		}
		dr.close();
	}
	
}

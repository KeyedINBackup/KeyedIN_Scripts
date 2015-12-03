package sampleTestWork;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class sample_003 {

	public static WebDriver dr = new FirefoxDriver();
	
	public static void main(String[] args) throws InterruptedException{
		
		dr.navigate().to("http://www.toolsqa.com/automation-practice-table/");
		TimeUnit.SECONDS.sleep(5);
		WebElement w = dr.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/table/tbody"));
		List<WebElement> li = w.findElements(By.tagName("tr"));
		int S= li.size();
		Random ra = new Random(System.currentTimeMillis());
		int val = ra.nextInt(S);
		System.out.println("The row number is:" +val);
		String S1 ="html/body/div[1]/div[3]/div[2]/div/div/table/tbody/tr[" ;
		String S2 = "]/td[6]/a";
		dr.findElement(By.xpath(S1+val+S2)).click();
		System.out.println("Test Pass");
		dr.quit();
	}
	
}

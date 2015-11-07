package selenium;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sampletest {
public static WebDriver dr;
public static void main(String[] args) throws InterruptedException{
	dr = new FirefoxDriver();
	dr.get("https://www.google.co.in");
	dr.findElement(By.name("q")).sendKeys("Quality");
	dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	List<WebElement> sel = dr.findElements(By.className("sbsb_b"));
	int Size = sel.size();
	for(WebElement print:sel){
		System.out.println(print.getText());
	}
	String Str1="html/body/div[1]/div[3]/form/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div/ul/li[";
	String Str2="]/div/div[2]";
	Random rand = new Random(System.currentTimeMillis());
	int rval = rand.nextInt(Size)+3;
	dr.findElement(By.xpath(Str1+rval+Str2)).click();
	System.out.print("Random selection is done succesfully");
	Thread.sleep(1000);
	dr.close();
}
}

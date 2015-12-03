package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TQA003 {
public static WebDriver dr;
public static void main(String[] args){
	dr = new FirefoxDriver();
	dr.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	dr.manage().window().maximize();
	dr.get("http://demoqa.com/frames-and-windows/");
	dr.findElement(By.xpath(".//li[@id='menu-item-374']/a")).click();
	System.out.println("Test Pass");
	dr.navigate().back();
	System.out.println("Test Pass");
	dr.navigate().forward();
	System.out.println("Test Pass");
	dr.navigate().to("http://demoqa.com/frames-and-windows/");
	System.out.println("Test Pass");
	dr.navigate().refresh();
	System.out.println("Test Pass");
	dr.quit();
	System.out.println("Test Pass");
	 
}
}

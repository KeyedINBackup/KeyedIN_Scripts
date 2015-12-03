package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TQA004 {
public static WebDriver dr;
public static void main(String[] args){
	dr = new FirefoxDriver();
	dr.manage().window().maximize();
	dr.get("http://www.toolsqa.com/automation-practice-form/");
	dr.findElement(By.name("firstname")).sendKeys("Thiru");
	dr.findElement(By.name("lastname")).sendKeys("Moorthy");
	dr.findElement(By.id("submit")).click();
	dr.quit();
}
}

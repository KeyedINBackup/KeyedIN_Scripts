package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TQA002 {
public static WebDriver dr;
public static void main(String[] args){
	dr = new FirefoxDriver();
	dr.get("http://demoqa.com/frames-and-windows/");
	dr.findElement(By.xpath(".//div[@id='tabs']/ul/li[1]/a")).click();
	dr.quit();
}
}

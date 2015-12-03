package sampleTestWork;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A {
 public static WebDriver driver = new FirefoxDriver();
 public static void main(String args[]) throws Exception
 
 {
  driver.get("http://toolsqa.com/");
  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  WebElement tutor = driver.findElement(By.xpath(".//*[@id='main-nav']/li[3]/a"));
  tutor.click();
  TimeUnit.SECONDS.sleep(4);
  List<WebElement> li = tutor.findElements(By.xpath(".//*[@id='main-nav']/li[3]/ul/li"));
  
  for(WebElement link:li ){
   String s =link.getText();
   System.out.println(s);
  }
  
 
  
 
  
    
 }
 
}
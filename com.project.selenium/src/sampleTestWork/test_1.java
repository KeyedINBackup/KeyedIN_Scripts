package sampleTestWork;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test_1 {
private static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	driver = new FirefoxDriver();
	//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.navigate().to("http://kimdev01.keyedinuat.com/Dev03");
	driver.manage().window().maximize();
	driver.findElement(By.xpath(".//form[@method='post']/ul/li[1]/input")).sendKeys("lizc-admin");
	driver.findElement(By.xpath(".//form[@method='post']/ul/li[2]/input")).sendKeys("password");
	driver.findElement(By.xpath(".//form[@method='post']/ul/li[3]/input")).click();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.findElement(By.xpath(".//a[@title='Sales Orders']")).click();
	List<WebElement> sel = driver.findElements(By.tagName("tr"));
	int length = sel.size();
	for(int i=0; i<=length; i++){
		String s = sel.get(i).getText();
		if(s.contains("1095"))
		{
			sel.get(i).click();
			TimeUnit.SECONDS.sleep(5);
		driver.findElement(By.xpath("html/body/div[2]/div/div[1]/div[1]/div/form/div[2]/div/div[2]/div[3]/div[2]/div/table/tbody/tr[26]/td[1]/div[2]/a[6]")).click();
		driver.findElement(By.xpath("html/body/div[2]/div/div[1]/div[1]/div/form/div[2]/div/div[2]/div[3]/div[2]/div/table/tbody/tr[26]/td[1]/div[2]/ul/li[3]/a")).click();
		System.out.println("Test pass");
		break;
		} 
		}
	
	
}}
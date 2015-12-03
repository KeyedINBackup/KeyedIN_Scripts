package selenium;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddiTem {
public static WebDriver dr;
public static void main(String[] args) throws InterruptedException{
	dr= new FirefoxDriver();
	dr.manage().window().maximize();
	dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	dr.get("http://kimdev01.keyedinuat.com/Dev03/User/SignIn");
	dr.findElement(By.name("username")).sendKeys("lizc-admin");
	dr.findElement(By.name("password")).sendKeys("password");
	dr.findElement(By.xpath(".//form[@method='post']/ul/li[3]/input")).click();
	System.out.println("Test1 pass");
	dr.findElement(By.xpath(".//a[@title='Sales Orders']")).click();
	List<WebElement> list = dr.findElements(By.tagName("tr"));
	int Size = list.size();
	Random rand = new Random(System.currentTimeMillis());
	int rval=rand.nextInt(Size);
	String S1="html/body/div[2]/div/div[1]/div[1]/div/form/div[2]/div/div[2]/div[3]/div[2]/div/table/tbody/tr[";
	String S2="]/td[1]/div[2]/a[6]";
	TimeUnit.SECONDS.sleep(2);
	dr.findElement(By.xpath(S1+rval+S2)).click();
	System.out.println("Test2 pass");
	String S3="]/td[1]/div[2]/ul/li[2]/a";
	dr.findElement(By.xpath(S1+rval+S3)).click();
	System.out.println("Test3 pass");
	dr.findElement(By.xpath(".//button[3][@class='btn btn-xs btn-primary']")).click();
	dr.findElement(By.xpath(".//*[@id='MainWrapper']/div/form/div[2]/div/div/fieldset[1]/div/div/div/div[3]/div[1]/div/div/div[2]/div/div[1]/span/a[1]")).click();
	System.out.println("Test4 pass");
	dr.switchTo().frame(0);
	dr.findElement(By.xpath(".//*[@id='select2-chosen-2']")).click();
	System.out.println("Test5 pass");
	dr.findElement(By.xpath("html/body/div[3]/ul/li[3]/div")).click();
	System.out.println("Test6 pass");
	dr.findElement(By.xpath(".//button[1][@class='btn btn-sm btn-default']")).click();
	TimeUnit.SECONDS.sleep(4);
	System.out.println("Test7 pass");
	dr.findElement(By.xpath("html/body/div[1]/form/div[2]/div[2]/div[3]/div[2]/div/table/tbody/tr/td[1]/a")).click();
	System.out.println("Test8 pass");
	dr.findElement(By.xpath(".//span[@id='select2-chosen-10']")).click();
	dr.findElement(By.xpath("html/body/div[5]/ul/li/div")).click();
	dr.findElement(By.xpath(".//input[@id='Quantity']")).sendKeys("100");
	dr.findElement(By.xpath(".//button[@class='btn btn-xs btn-success']")).click();





}
}

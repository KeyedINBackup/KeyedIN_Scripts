package selenium;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class rand {
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
	/*int Size = list.size();
	Random rand = new Random(System.currentTimeMillis());
	int rval=rand.nextInt(Size);
	String S1="html/body/div[2]/div/div[1]/div[1]/div/form/div[2]/div/div[2]/div[3]/div[2]/div/table/tbody/tr[";
	String S2="]/td[1]/div[2]/a[6]";
	TimeUnit.SECONDS.sleep(2);
	dr.findElement(By.xpath(S1+rval+S2)).click();*/
	Random rand = new Random(System.currentTimeMillis());
	WebElement link=list.get(rand.nextInt(list.size()));
	TimeUnit.SECONDS.sleep(4);
	link.click();
	System.out.println("Test2 pass");
	String s=link.getText();
	System.out.println(s);
	
}}
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_scenarios {
public static WebDriver dr;
public static void main(String[] args){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sakthivel\\Documents\\Jar files\\chromedriver_win32\\chromedriver.exe");
	dr=new ChromeDriver();
	dr.navigate().to("http://kimdev01.keyedinuat.com/Dev03");
	dr.manage().window().maximize();
	WebElement Username=dr.findElement(By.xpath(".//form[@method='post']/ul/li[1]/input"));
	Username.sendKeys("lizc-admin");
	WebElement Password =dr.findElement(By.xpath(".//form[@method='post']/ul/li[2]/input"));
	Password.sendKeys("password");
	dr.findElement(By.xpath(".//form[@method='post']/ul/li[3]/input")).click();
//	dr.findElement(By.xpath("html/body/div[1]/ul[2]/li[1]/div/a")).click();
	String text =dr.getPageSource();
	String validation =dr.getCurrentUrl();
		if(text.contains("Username is required") || text.contains("Incorrect username or password")|| text.contains("Invalid username or password")){
		System.out.println("Login in Failed");
		} else{
		System.out.println("Logged in");
		}
		if(validation.equals("http://kimdev01.keyedinuat.com/Dev03")){
			System.out.println("Logged in");
		} else{
		System.out.println("Login in Failed");
		
		}
		   
	
}
}
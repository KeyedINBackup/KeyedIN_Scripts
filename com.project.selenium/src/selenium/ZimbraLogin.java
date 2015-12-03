package selenium;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ZimbraLogin {
public static WebDriver dr;
public static void main(String[] arg){
	/*dr=new FirefoxDriver();*/
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sakthivel\\Documents\\Jar files\\chromedriver_win32\\chromedriver.exe");
	dr=new ChromeDriver();
	dr.get("http://mail1.cgvakindia.com/?loginOp=logout");
	dr.manage().window().maximize();
	dr.findElement(By.id("username")).sendKeys("thirugnanamoorthy@cgvakindia.com");
	dr.findElement(By.id("password")).sendKeys("CG-vak123");
	dr.findElement(By.id("remember")).click();
	Select sel = new Select(dr.findElement(By.id("client")));
	List<WebElement> opt =sel.getOptions();
	
	for(WebElement sel1:opt){
		System.out.println(sel1.getText());
		
	}
	sel.selectByIndex(new Random().nextInt(sel.getOptions().size()));
	dr.findElement(By.xpath(".//input[@class='ZLoginButton DwtButton']")).click();
	
	
}

}

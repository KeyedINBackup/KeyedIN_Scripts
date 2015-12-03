package sampleTestWork;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Broilermax {

public static WebDriver driver = new FirefoxDriver();

public static void main(String[] args) throws InterruptedException{
	driver.navigate().to("http://test:test@202.129.196.131:8085/demo/broilermax/users/register");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Select sel = new Select(driver.findElement(By.name("country_id")));
	List<WebElement> option =sel.getOptions();
	for(int i=0; i<=option.size(); i++){
		String s = option.get(i).getText();
		System.out.println(s);
		if(s.contains("Åland")){
			System.out.println("Test completed");
			break;
			
		}
		
	} 
	driver.quit();
}
}

package romeo.dd;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.xml.ws.WebEndpoint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import romeo.dd.romeo_ddscript;
public class AwardUserFile {
 public static WebDriver dr;
 
 public static void main(String[] args)throws Exception{
	 
	romeo_ddscript.getExcelpath("C://Users//sakthivel//Desktop//Awd_user_100.xlsx", "Sheet1");
	dr = new FirefoxDriver();
	dr.get("http://172.16.11.18/load.romeo/");
	dr.manage().window().maximize();
	dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	String wind1 =dr.getWindowHandle();
	
	dr.findElement(By.xpath(".//*[@id='txtUsername']")).sendKeys("awd_user");
	dr.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("Testdemo123");
	dr.findElement(By.xpath(".//*[@id='btn_SignIn']")).click();
	Set<String> win2 =dr.getWindowHandles();
	
	for(String wind : win2){
		dr.switchTo().window(wind);
		
	}
	dr.findElement(By.xpath(".//*[@id='ctl00_menuContentPlaceHolder_TemplateRadMenu']/ul/li[2]/a/span")).click();
	for(int i=1; i<=100; i++){
	WebElement FileNO =dr.findElement(By.xpath(".//*[@id='Top_Short1_lblFileNo']"));
	String Num = FileNO.getText();
	romeo_ddscript.SetExcelValue(i, 0, Num);
	dr.findElement(By.xpath(".//*[@id='ctl02_ctl00_txtProjectTitle']")).sendKeys("PP test");
	dr.findElement(By.xpath(".//*[@id='ctl02_imgbtnSaveAndClose']")).click();
	dr.findElement(By.xpath(".//*[@id='ctl00_menuContentPlaceHolder_TemplateRadMenu']/ul/li[2]/a/span")).click();
	}
	dr.close();
	dr.switchTo().window(wind1);
	
	dr.close();
	
	
	
	
	
	
	
 }
 
	
}

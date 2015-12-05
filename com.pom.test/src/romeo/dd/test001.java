package romeo.dd;

import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import romeo.dd.romeo_ddscript;

public class test001 {
public static WebDriver dr;

public static void main(String[] args) throws Exception{
	
		get1();
	
	
	
}
public static void get1() throws Exception
{
	romeo_ddscript.getExcelpath("C://Users//sakthivel//Desktop//Awd_user_100.xlsx", "Sheet1");
	dr = new FirefoxDriver();
	dr.get("http://172.16.11.18/load.romeo/");
	dr.manage().window().maximize();
	dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	String wind1 =dr.getWindowHandle();
	
	dr.findElement(By.xpath(".//*[@id='txtUsername']")).sendKeys("su");
	dr.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("sudemo");
	dr.findElement(By.xpath(".//*[@id='btn_SignIn']")).click();
	Set<String> win2 =dr.getWindowHandles();
	
	for(String wind : win2){
		dr.switchTo().window(wind);
		
	}
	WebDriverWait wait = new WebDriverWait(dr, 20);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='ctl00_menuContentPlaceHolder_TemplateRadMenu']/ul/li[2]/a")));
	
	dr.findElement(By.xpath(".//*[@id='ctl00_menuContentPlaceHolder_TemplateRadMenu']/ul/li[2]/a")).click();
	dr.findElement(By.xpath(".//*[@id='ctl00_menuContentPlaceHolder_TemplateRadMenu']/ul/li[2]/div/div[1]/div/ul/li[2]/a/span")).click();
	dr.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder1_ctrlContent_imtbtnAddNew']")).click();
	
	for(int i=1; i<=100; i++){
		Select sel = new Select(dr.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder1_ctrlContent_cmbGroup']")));
		sel.selectByVisibleText("Office of Research Services");
		String Username = romeo_ddscript.GetExcelData(i,0);
		String Password= "Testdemo123";
		dr.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder1_ctrlContent_txtLoginName']")).sendKeys(Username);
		dr.findElement(By.xpath(".//*[@id='btnChangePassword']")).click();
		dr.switchTo().frame(0);
		dr.findElement(By.xpath(".//*[@id='txtpassword']")).clear();
		dr.findElement(By.xpath(".//*[@id='txtpassword']")).sendKeys(Password);
		dr.findElement(By.xpath(".//*[@id='txtComfirmPassword']")).sendKeys(Password);
		dr.findElement(By.xpath(".//*[@id='imgbtnOK']")).click();
		dr.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder1_ctrlContent_imgbtnSave']")).click();
		dr.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder1_ctrlContent_imtbtnAddNew']")).click();
	}
	dr.close();
	dr.switchTo().window(wind1);
	
	dr.close();
	
	
	
	
	
}
}

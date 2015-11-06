package selenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test003 {
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
	driver.findElement(By.xpath(".//span[@class='k-icon k-icon-clipboard']")).click();
	driver.findElement(By.xpath(".//a[@href='/Dev03/Form/Create/70']")).click();
	driver.findElement(By.xpath("html/body/div[2]/div/div[1]/div[1]/div/form/div[2]/div/div/fieldset[1]/div/div/div/div[1]/div[2]/div/div/div[2]/div/div[1]/span/a[1]")).click();
	WebDriverWait wait = new WebDriverWait(driver,10);
	String popuphandle=driver.getWindowHandle();
	driver.switchTo().window(popuphandle);
	String acttitle= driver.getTitle();
	if(!acttitle.equals("Accounts with Customers")){
		List<WebElement> list =driver.findElements(By.xpath("html/body/div/form/div[2]/div[2]/div[2]/div[2]/div/table/tbody"));
		for(WebElement d : list){
			System.out.println(d.getText());
		}
	}else{
		System.out.println("Tess Fail");
	}
	
	
	
	
	
	
	
	
//	  Set<String> windowId = driver.getWindowHandles();    // get  window id of current window
//      Iterator<String> itererator = windowId.iterator();   
//
//      String mainWinID = itererator.next();
//      String  newAdwinID = itererator.next();
//
//      driver.switchTo().window(newAdwinID);
//     WebElement element=driver.findElement(By.xpath("html/body/div[1]/form/div[2]/div[2]/div[2]/div[2]/div/table/tbody/tr[4]/td[1]/a/i"));
//     element.click();
//	driver.switchTo().defaultContent();
//	WebElement option = driver.findElement(By.className("modal-body"));
//	driver.switchTo().frame(option);
//	WebElement selection = driver.findElement(By.xpath("html/body/div[1]/form/div[2]/div[2]/div[2]/div[2]/div/table/tbody/tr[4]/td[1]/a/i"));
//	selection.click();
//	String mainHandle = driver.getWindowHandle();
//	String[] handles = driver.getWindowHandles().toArray(new String[0]);
//	driver.switchTo().window(handles[handles.length - 1]);
//    driver.close(); //close the popup window
//	driver.switchTo().window(mainHandle);
//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div[1]/form/div[2]/div[2]/div[2]/div[2]/div/table/tbody/tr[4]/td[1]/a/i"))).click();

}}
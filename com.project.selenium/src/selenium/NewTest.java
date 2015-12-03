package selenium;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	public static WebDriver dr;
  @Test
  public void Method1() throws InterruptedException {
	 
	  dr.findElement(By.xpath(".//a[@title='Sales Orders']")).click();
	  WebDriverWait wait = new WebDriverWait(dr, 30);
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//li[@class='parent sortable active expanded']/ul/li[1]")));
	  dr.findElement(By.xpath(".//li[@class='parent sortable active expanded']/ul/li[1]")).click();
	  WebDriverWait wait1 = new WebDriverWait(dr, 30);
	  wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//div[@id='s2id_autogen1']/a/span[1]")));
	  dr.findElement(By.xpath(".//div[@id='s2id_autogen1']/a/span[1]")).click();
	  List<WebElement> sel = dr.findElements(By.className("select2-results"));
	  int Size = sel.size();
	  Random rand = new Random(System.currentTimeMillis());
	  int rval= rand.nextInt(Size);
	  String S1 = "html/body/div[5]/ul/li[";
	  String S2 = "]/div";
	  TimeUnit.SECONDS.sleep(2);
	  dr.findElement(By.xpath(S1+rval+S2)).click();
	  dr.findElement(By.id("select2-chosen-6")).click();
	  List<WebElement> sel1 = dr.findElements(By.className("select2-results"));
	  int Size1 = sel1.size();
	  Random rand1 = new Random(System.currentTimeMillis());
	  int rval1= rand1.nextInt(Size1);
	  String S3 = "html/body/div[6]/ul/li[";
	  String S4 = "]/div";
	  TimeUnit.SECONDS.sleep(4);
	  dr.findElement(By.xpath(S3+rval1+S4)).click();
	  dr.findElement(By.xpath(".//button[@class='btn btn-xs btn-success']")).click();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sakthivel\\Documents\\Jar files\\chromedriver_win32\\chromedriver.exe");
	  dr = new ChromeDriver();
	  /*dr = new FirefoxDriver();*/
	  dr.navigate().to("http://kimdev01.keyedinuat.com/Dev03");
	  dr.findElement(By.xpath(".//form[@method='post']/ul/li[1]/input")).sendKeys("lizc-admin");
	  dr.findElement(By.xpath(".//form[@method='post']/ul/li[2]/input")).sendKeys("password");
	  dr.findElement(By.xpath(".//form[@method='post']/ul/li[3]/input")).click();
	  
  }

  @AfterTest
  public void afterTest() {
	  /*dr.quit();*/
  }

}

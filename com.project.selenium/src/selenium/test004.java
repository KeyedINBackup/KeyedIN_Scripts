package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test004 {
	private static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new FirefoxDriver();
		driver.navigate().to("http://kimdev01.keyedinuat.com/Dev03");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//form[@method='post']/ul/li[1]/input")).sendKeys("lizc-admin");
		driver.findElement(By.xpath(".//form[@method='post']/ul/li[2]/input")).sendKeys("password");
		driver.findElement(By.xpath(".//form[@method='post']/ul/li[3]/input")).click();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//span[@class='k-icon k-icon-clipboard']")).click();
		driver.findElement(By.xpath(".//a[@href='/Dev03/Form/Create/70']")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("html/body/div[2]/div/div[1]/div[1]/div/form/div[2]/div/div/fieldset[1]/div/div/div/div[1]/div[2]/div/div/div[2]/div/div[1]/span/div/a/span[1]")).click();
		driver.findElement(By.xpath("html/body/div[5]/div/input")).sendKeys("Test");
		driver.findElement(By.xpath("html/body/div[5]/ul/li[2]/div")).click();
		driver.findElement(By.xpath("html/body/div[2]/div/div[1]/div[1]/div/form/div[2]/div/div/fieldset[1]/div/div/div/div[5]/div[1]/div/div/div[2]/div/div[1]/span/div/a/span[1]")).click();
		driver.findElement(By.xpath("html/body/div[6]/div/input")).sendKeys("KI Bikes");
		driver.findElement(By.xpath("html/body/div[6]/ul/li[1]/div")).click();
		driver.findElement(By.xpath("html/body/div[2]/div/div[1]/div[1]/div/form/div[2]/div/div/fieldset[1]/div/div/div/div[6]/div[1]/div/div/div[2]/div/div[1]/span/div/a/span[1]")).click();
		driver.findElement(By.xpath("html/body/div[7]/div/input")).sendKeys("CAD - Canadian Dollars");
		driver.findElement(By.xpath("html/body/div[7]/ul/li[1]/div")).click();
		driver.findElement(By.xpath("html/body/div[2]/div/div[1]/div[1]/div/form/div[2]/div/div/fieldset[1]/div/div/div/div[8]/div[2]/div/div/div[2]/div/div[1]/span/div/a/span[1]")).click();
		driver.findElement(By.xpath("html/body/div[8]/div/input")).sendKeys("Mark B");
		driver.findElement(By.xpath("html/body/div[8]/ul/li[1]/div")).click();
		driver.findElement(By.xpath(".//button[@class='btn btn-xs btn-success']")).click();
		System.out.println("Sales order added succesfully");
		driver.quit();
}}

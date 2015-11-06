package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class autocompletetest {
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
		driver.findElement(By.xpath(".//*[@id='main']/div/div[1]/div[2]/div/ul/li[1]/ul/li[2]/div[1]/a[3]")).click();
		driver.findElement(By.xpath(".//*[@id='main']/div/div[1]/div[2]/div/ul/li[1]/ul/li[1]/ul/li[1]/div[1]/a[3]")).click();
		
		driver.findElement(By.xpath(".//*[@id='select2-chosen-2']")).click();
		driver.findElement(By.xpath(".//*[@id='s2id_autogen2_search']")).sendKeys("10");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement selection = driver.findElement(By.xpath("html/body/div[5]/ul/li[1]/div"));
		String text=selection.getText();
		if(text.equalsIgnoreCase("1005")){
			System.out.println("Search item : 10");
			System.out.println("Selected item :"+text);
			selection.click();
		}
		driver.findElement(By.xpath("html/body/div[2]/div/div[1]/div[1]/div/form/div[1]/div/a")).click();
		System.out.println("Sales order delivery listing done Succesfully");
		driver.quit();
	}}
		
//		List<WebElement> options = driver.findElements(By.xpath("html/body/div[5]"));
//		System.out.println("Auto complete options"+options.size());
//		int i = 1;
//		for(WebElement element: options){
//			if(!(i<=options.size())) break;
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			WebElement selection = element.findElement(By.xpath(".//*[@id='select2-result-label-346']"));
//			String text=selection.getText();
//			if(text.equalsIgnoreCase("1005")){
//				System.out.println("Search item"+text);
//				selection.click();
//				break;
//			}
//			i++;
//		}
		
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElement(By.xpath(".//span[@class='select2-match']")).click();
//		driver.findElement(By.xpath(".//*[@id='MainWrapper']/div/form/div[2]/div/div[2]/div[2]/ul/li[3]/button[1]")).click();
//		driver.findElement(By.xpath(".//*[@id='MainWrapper']/div/form/div[1]/div/a")).click();
//		System.out.println("Tess pass");
//		driver.close();
		//Random Generation
//		String St1 = "html/body/div[5]/ul/li[";
//		String St2 = "]";
//		WebElement WB = driver.findElement(By.xpath("html/body/div[5]"));
//		List<WebElement> LWB = WB.findElements(By.xpath("html/body/div[5]/ul/li"));
//		int L1 = LWB.size();
//		System.out.print("Length: "+L1);
//		Random rand = new Random(System.currentTimeMillis());
//		int Rval = rand.nextInt(L1);
//		System.out.print("Rand Value: "+Rval);
//		driver.findElement(By.xpath(St1+Rval+St2)).click();
		
		
		
		
		
	/*catch (NoSuchElementException e) {
		System.out.println(e.getStackTrace());
	}
	catch (Exception e) {
		System.out.println(e.getStackTrace());
	}*/

		
		
		
		
//		for(WebElement select:options){
//			if(select.getText().equals("1005")){
//				select.click();
//				System.out.println(""+select.getText());
//			}
//		}
//		Select dropdown = new Select((WebElement) options);
//		dropdown.selectByIndex(3);
//		System.out.println("Tess Pass");
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

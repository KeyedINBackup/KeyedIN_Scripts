package sampleTestWork;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class test_2 {

	public static WebDriver dr;
	
	public static void main(String[] args) throws InterruptedException{
		
		dr = new FirefoxDriver();
		
		dr.navigate().to("http://www.toolsqa.com/automation-practice-form/");
		
		dr.manage().window().maximize();
		
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Select sel = new Select(dr.findElement(By.id("continents")));
		sel.selectByIndex(1);
		sel.selectByVisibleText("Africa");
		TimeUnit.SECONDS.sleep(5);
		List<WebElement> pick = sel.getOptions();
		for(int i=0; i<=pick.size(); i++){
			String paste = sel.getOptions().get(i).getText();
			System.out.println(paste);
			if(paste.contains("Australia")){
				sel.selectByVisibleText("Australia");
				break;
		}
		}
		List<WebElement> Years = dr.findElements(By.name("exp"));
		boolean b = false;
		b=Years.get(2).isSelected();
		if(b==true){
			Years.get(3).click();
		} else {
			Years.get(2).click();
		}
		
		List<WebElement> sel1 = dr.findElements(By.name("profession"));
		
		int Size = sel1.size();
		
		for(int i=0; i<=Size; i++){
			String s = sel1.get(i).getAttribute("value");
			if(s.equals("Automation Tester")){
				sel1.get(i).click();
				break;
			}
		}
		dr.quit();
	}
	
	
}

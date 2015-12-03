package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TQA001 {
public static WebDriver dr;
public static void main(String[] args){
	dr= new FirefoxDriver();
	dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	dr.manage().window().maximize();
	dr.navigate().to("http://store.demoqa.com/");
	String PageTitle =dr.getTitle();
	int TitleLength = dr.getTitle().length();
	System.out.println("Page Title is :"+PageTitle);
	System.out.println("Lenth of the page Title is :"+TitleLength);
	String PageUrl=dr.getCurrentUrl();
	String ActUrl="http://store.demoqa.com/";
		if(ActUrl.equalsIgnoreCase(PageUrl))
			{
			System.out.println("Test Pass");
			}
		else{
			System.out.println("Test Fail");
			}
	String PageSource = dr.getPageSource();
	int SourceLen =dr.getPageSource().length();
	System.out.println("Pagesource for this page is :"+PageSource);
	System.out.println("Pagesource length is :"+SourceLen);
	dr.close();
	

}


}

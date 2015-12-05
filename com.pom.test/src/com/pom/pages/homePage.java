package com.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {

	private static WebElement element= null;
	
	public static WebElement txtbox_salesorder(WebDriver dr){
		element =dr.findElement(By.xpath(".//a[@title='Sales Orders']"));
		return element;
		
	}
	
	public static WebElement txtbox_addSO(WebDriver dr){
		element =dr.findElement(By.xpath(".//*[@id='main']/div/div[1]/div[2]/div/ul/li[1]/ul/li[1]/ul/li[1]/div[1]/a[3]"));
		return element;
		
	}
	
	public static WebElement btn_settings(WebDriver dr){
		element =dr.findElement(By.xpath(".//div[@class='top-bar']/ul[2]/li[4]/div/a"));
		return element;
		
	}
	
	public static WebElement btn_signout(WebDriver dr){
		element =dr.findElement(By.xpath(" .//div[@class='top-bar']/ul[2]/li[4]/div/ul/li[11]/a"));
		return element;
		
	}
}

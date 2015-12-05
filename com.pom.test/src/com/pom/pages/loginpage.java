package com.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {

	private static WebElement element= null;
	
	public static WebElement txtbox_username(WebDriver dr){
		element =dr.findElement(By.xpath(".//input[@name='username']"));
		return element;
		
	}
	
	public static WebElement txtbox_password(WebDriver dr){
		element =dr.findElement(By.xpath(".//input[@name='password']"));
		return element;
		
	}
	
	public static WebElement btn_login(WebDriver dr){
		element =dr.findElement(By.xpath(".//input[@value='Sign In']"));
		return element;
		
	}
}

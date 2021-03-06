package BusinessRule;
import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.google.gson.annotations.Until;
public class Sales_order extends KeyedID_Login
{
public static String Str1 = "Sales Order";
public static void main (String[] args) throws IOException
{
try {
	Login1();
} catch (AWTException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
MenuList("Test");
MenuList();
Pagination1();
Pagination2();
Pagination3();
dr.close();
}
public static String MenuList(String Menu) throws IOException
{
try{
String St1 = dr.getPageSource();
String St2 = "Sales Orders";
if(St1.contains(St2))
{
WebElement WB1 = dr.findElement(By.xpath(Attributes().getProperty("L1")));
List<WebElement> L1 = WB1.findElements(By.tagName("a"));
for(WebElement W1 : L1)
{
if(W1.getText().length()!=0)
{
if(W1.getText().contains(Str1))
{
System.out.println("******************** Scenario 1 ***********************");
System.out.println("Sales Order Menu is displayed in the Menu list");
Menu = WB1.getText();
}
}
}
}
else
{
System.out.println("******************** Scenario 1 ***********************");
System.out.println("Sales Order Menu not displayed in the Menu list");
}
}catch (NoSuchElementException e){System.out.println("Invalid Element: "+e);}
return Menu;
}
public static void MenuList() throws IOException
{
dr.get("http://kimdev01.keyedinuat.com/Dev03/Tab/71");
String Source1 = dr.getPageSource();
if(Source1.contains("Sales Orders"))
{
List<WebElement> LWB1 = dr.findElements(By.xpath(Attributes().getProperty("LWB1")));
for(WebElement L1 : LWB1)
{
System.out.println("******************** Scenario 1b ***********************");
System.out.println("Menus Under Sales Order");
System.out.println("-----------------------------------");
System.out.println(L1.getText());
}
}
else
{
System.out.println("******************** Scenario 1b ***********************");
System.out.println("Sales Order Not Displayed in the menu list");
}
//Start
dr.get("http://kimdev01.keyedinuat.com/Dev03/Tab/73");
String Source2 = dr.getPageSource();
if(Source2.contains("Sales Order Deliveries"))
{
List<WebElement> LWB2 = dr.findElements(By.xpath(Attributes().getProperty("LWB1")));
for(WebElement L1 : LWB2)
{
System.out.println("******************** Scenario 1c ***********************");
System.out.println("Menus Under Sales Order Deliveries");
System.out.println("-----------------------------------");
System.out.println(L1.getText());
}
}
else
{
System.out.println("******************** Scenario 1b ***********************");
System.out.println("Sales Order Deliveries Not Displayed in the menu list");
}
}
public static void Pagination1() throws IOException
{
dr.get(Attributes().getProperty("URL"));
int rowCount=dr.findElements(By.xpath(Attributes().getProperty("Pagination1"))).size();
if(rowCount==50)
{
System.out.println("******************** Scenario 2b ***********************");
System.out.println("Pagination of records for each page in Sales Order Listing screen are: "+rowCount);
}
else
{
System.out.println("******************** Scenario 2b ***********************");
System.out.println("Pagination of records in Sales Order Listing screen are changed from 50. The current count is : "+rowCount);
}
}
public static void Pagination2() throws IOException
{
dr.findElement(By.xpath(Attributes().getProperty("MassPrint"))).click();
WebDriverWait wait = new WebDriverWait(dr, 30);
wait.until(ExpectedConditions.textToBePresentInElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/div/form/div[1]/label/em"), "Sales Order Listing"));
int rowCount=dr.findElements(By.xpath(Attributes().getProperty("Pagination2"))).size();
if(rowCount==50)
{
System.out.println("******************** Scenario 4a ***********************");
System.out.println("Pagination of records for each page in Mass Print Sales Order Acknowledgments screen are: "+rowCount);
}
else
{
System.out.println("******************** Scenario 4a ***********************");
System.out.println("Pagination of records in Mass Print Sales Order Acknowledgments screen are changed from 50. The current count is : "+rowCount);
}
}
public static void Pagination3() throws IOException
{
dr.get("http://kimdev01.keyedinuat.com/Dev03/List/303");
dr.get(Attributes().getProperty("SODeli"));
WebDriverWait wait = new WebDriverWait(dr, 30);
wait.until(ExpectedConditions.textToBePresentInElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/div/form/div[1]/label/em"), "Sales Order Delivery Listing"));
int rowCount=dr.findElements(By.xpath(Attributes().getProperty("Pagination3"))).size();
if(rowCount==50)
{
System.out.println("******************** Scenario 8 ***********************");
System.out.println("Pagination of records for each page in Sales Order Delivery Listing screen are: "+rowCount);
}
else
{
System.out.println("******************** Scenario 8 ***********************");
System.out.println("Pagination of records in Sales Order Delivery Listing screen are changed from 50. The current count is : "+rowCount);
}
}
public static void Sortorder() throws IOException
{
try{
dr.get(Attributes().getProperty("URL"));
List<WebElement> LWB3 = dr.findElements(By.tagName("th"));
int Len = LWB3.size();
System.out.println("Size: "+ Len);
List<WebElement> LWB4 = dr.findElements(By.tagName("td"));
for(WebElement L2 : LWB4)
{
if(L2.getText().contains("Sales Order Date"))
{
String M1 = L2.getText();
List<String> ml = new ArrayList<String>();
ml.add(M1);
System.out.println("Values Values Values: "+M1);
}
}
}catch(StaleElementReferenceException e){System.out.println(e);}
System.out.println("rest of the code...");
}
}
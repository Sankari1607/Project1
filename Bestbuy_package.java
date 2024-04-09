package bestbuy_project;

import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.remote.RemoteWebElement;



public class Bestbuy_package {

	private static final int eclipse = 0;
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bestbuy.com");
		List<WebElement>links = (List<WebElement>) driver.findElement(By.tagName("a"));
		for(WebElement link :links)
		{
		
			String url =  link.getAttribute("href");
		
		VerifyLink(url);
		
		}
	}
private static void VerifyLink(String url) {
			// TODO Auto-generated method stub
			try
			{
				
			URL link = new URL(url);
			
			HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
			httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
			httpURLConnection.connect();


			if (httpURLConnection.getResponseCode() == 200) {
			System.out.println(url + " - " + httpURLConnection.getResponseMessage());
			} else {
			System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
			}
			} catch (Exception e) {
			System.out.println(url + " - " + "is a broken link");
			}
			}
			
		
		
@Test
public void Signup() throws InterruptedException{
			
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bestbuy.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//h4[text() = \"United States\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//span[text() = 'Account']")).click();
		driver.findElement(By.xpath("//a[text() = 'Create Account']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement Fname = driver.findElement(By.xpath("//input[@id='firstName']"));
		Fname.sendKeys("Radhana");
		WebElement Lname = driver.findElement(By.xpath("//input[@id='lastName']"));
		Lname.sendKeys("M");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("ragnastaffing@gmail.com");
		WebElement password= driver.findElement(By.xpath("(//input[@id='fld-p1'])"));
		password.sendKeys("Radhana@123");
		WebElement compaword = driver.findElement(By.xpath("(//input[@id='reenterPassword'])"));
		compaword.sendKeys("Radhana@123");
		WebElement Mobile = driver.findElement(By.xpath("//input[@id='phone']"));
		Mobile.sendKeys("9999999999");
		driver.findElement(By.xpath("//button[text()='Create an Account']")).click();
		
		}

@Test
public void Navigationallmenu() throws InterruptedException{
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.bestbuy.com");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//h4[text() = \"United States\"]")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.findElement(By.xpath("//a[text()='Top Deals']")).click();
	driver.findElement(By.xpath("//a[text()='Deal of the Day']")).click();
	driver.findElement(By.xpath("//a[text()='Yes, Best Buy Sells That']")).click();
	driver.findElement(By.xpath("//a[text()='My Best Buy Memberships']")).click();
	driver.findElement(By.xpath("//a[text()='Credit Cards']")).click();
	driver.findElement(By.xpath("//a[text()='Gift Cards']")).click();
	driver.findElement(By.xpath("//a[text()='Gift Ideas']")).click();
	
}

@Test 

public void BottompagenavigationconsumeEnumConstantHeader() throws InterruptedException
{

	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.bestbuy.com");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//h4[text() = \"United States\"]")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.findElement(By.xpath("//a[text()='Accessibility']")).click();
	driver.findElement(By.xpath("//a[text()='Terms & Conditions']")).click();
	driver.findElement(By.xpath("//a[text()='Privacy']")).click();
	driver.findElement(By.xpath("//a[text()='State Privacy Rights']")).click();
	driver.findElement(By.xpath("//a[text()='Health Data Privacy']")).click();
	driver.findElement(By.xpath("//a[text()='Do Not Sell/Share My Personal Information']")).click();
	driver.findElement(By.xpath("//a[text()='Limit Use of My Sensitive Personal Information']")).click();
	driver.findElement(By.xpath("//a[text()='Targeted Advertising Opt Out']")).click();
	driver.findElement(By.xpath("//a[text()='CA Supply Chain Transparency Act']")).click();
	
}

public void addshoping() throws InterruptedException
{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.bestbuy.com");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//h4[text() = \"United States\"]")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	WebElement element =driver.findElement(By.xpath("//input[@id='gh-search-input']"));
	element.sendKeys("JBL - Tune Flex True Wireless Noise Cancelling Earbuds - Black");
	driver.findElement(By.xpath("//button[@title='submit search']")).click();
	driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();	
}

public void addmenushopdept() throws InterruptedException
{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.bestbuy.com");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//h4[text() = \"United States\"]")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.findElement(By.xpath("//button[text()=\"Menu\"]")).click();
	driver.findElement(By.xpath("//button[text()=\"Appliances\"]")).click();
	driver.findElement(By.xpath("//button[text()=\"Major Kitchen Appliances\"]")).click();
	driver.findElement(By.xpath("//a[text()=\"Refrigerators\"]")).click();
	driver.findElement(By.xpath("//a[text()=\"Bottom-Freezer Refrigerators\"]")).click();
	driver.findElement(By.xpath("(//a[contains(text(),'LG - 31.7 Cu. Ft. French Door Smart Refrigerator w')])")).click();
	driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();	
	
}
public void addmenushopbrand() throws InterruptedException
{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.bestbuy.com");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//h4[text() = \"United States\"]")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.findElement(By.xpath("//button[text()=\"Menu\"]")).click();
	driver.findElement(By.xpath("//button[text()=\"Brands\"]")).click();
	driver.findElement(By.xpath("//a[text()=\"HP\"]")).click();
	driver.findElement(By.xpath("//a[text()=\"HP laptops\"]")).click();
	driver.findElement(By.xpath("//a[contains(text(),'HP - Spectre 2-in-1 16\" 3K+ Touch-Screen Laptop - ')]")).click();
	driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
	
}
public void dummypayment() throws InterruptedException
{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.bestbuy.com");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//h4[text() = \"United States\"]")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.findElement(By.xpath("//span[text() = 'Account']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
	WebElement username = driver.findElement(By.xpath("(//input[@id='fld-e'])[1]"));
	username.sendKeys("littlecutiespreschool@gmail.com");
	WebElement pass= driver.findElement(By.xpath("//input[@id='fld-p1']"));
	pass.sendKeys("Radhana@123");
	driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	driver.findElement(By.xpath("//button[text()=\"Menu\"]")).click();
	driver.findElement(By.xpath("//button[text()=\"Brands\"]")).click();
	driver.findElement(By.xpath("//a[text()=\"LG\"]")).click();
	driver.findElement(By.xpath("//a[text()=\"LG dishwashers\"]")).click();
	driver.findElement(By.xpath("//a[contains(text(),'LG - 24\" Front Control Smart Built-In Stainless St')])[1]")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
	driver.findElement(By.xpath("//span[text()='Cart']")).click();	
}
public void Threadwait() throws InterruptedException
{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.bestbuy.com");
	driver.manage().window().maximize();
	Thread.sleep(12, 50);
	driver.findElement(By.xpath("//h4[text() = \"United States\"]")).click();	
}
public void Closeweb() throws InterruptedException
{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.bestbuy.com");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//h4[text() = \"United States\"]")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.quit();	
}
public void Screenshot() throws InterruptedException
{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.bestbuy.com");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//h4[text() = \"United States\"]")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	File BestbuyScreenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
}

}
			
		
	
	
	 
		

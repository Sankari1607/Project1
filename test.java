package bestbuy_project;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;

import junit.framework.Assert;

public class test {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement radiobuttons = driver.findElement(By.xpath("//div[contains(text(),'round trip')]"));
		radiobuttons.click();
		driver.findElement(By.xpath("//(//div[@class='r-1862ga2 r-1loqt21 r-1i10wst r-tceitz r-u8s1d css-76zvg2'])[1]")).getAttribute("MAA");
		//To.sendKeys("MAA");
		driver.findElement((By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[1]"))).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.xpath("//div[text()='From']")).click();
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[1]")).sendKeys("Bengaluru (BLR)");
		
		
		
		
		//String from = driver.findElement(By.xpath("//div[text()='From']")).getText();
		//Assert.assertEquals(from, "BLR");
		
		
		
		/*Select select = new Select (from);
		select.selectByVisibleText("BLR");
		List<WebElement>options = select.getOptions();
		for (WebElement option: options) {
			String text = option.getText();
			System.out.print(text);
		}
		*/
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//from.sendKeys("BLR");
		
	}}		
		
		/*WebElement radiobuttons= driver.findElement(By.xpath("//div[contains(text(),'one way')]"));
		radiobuttons.click();
		WebElement from = driver.findElement(By.xpath("//div[@class='r-1862ga2 r-1loqt21 r-1enofrn r-tceitz r-u8s1d css-76zvg2'][normalize-space()='From']"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement To = driver.findElement(By.xpath("//div[@class='r-1862ga2 r-1loqt21 r-1enofrn r-tceitz r-u8s1d css-76zvg2'][normalize-space()='To']"));
		from.sendKeys("Chennai");
		To.sendKeys("Bangalore");*/
		
		

		
				
		
		
		
		
		
		/*driver.findElement(By.xpath("//button[text()='Checkout']")).click();
		driver.findElement(By.xpath("//span[text()='Check Trade-In Value']")).click();
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		
		driver.findElement(By.xpath("")).click();*/
		


		
	



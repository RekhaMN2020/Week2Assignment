package Week2.assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.*;

import io.github.bonigarcia.wdm.WebDriverManager;
public class DropDownHtml {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement c1=driver.findElement(By.id("dropdown1"));
		Select dd1=new Select(c1);
		dd1.selectByIndex(1);
		
				
		WebElement c2=driver.findElement(By.name("dropdown2"));
		Select dd2=new Select(c2);
		dd2.selectByVisibleText("Selenium");
		
		
		WebElement c3=driver.findElement(By.id("dropdown3"));
		Select dd3=new Select(c3);
		dd3.selectByValue("1");
		Thread.sleep(1000);
	
		Select se = new Select(driver.findElement(By.className("dropdown")));
		List l =se.getOptions();
		System.out.println("The total options available are"+" "+l.size());
	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[5]/select[1]")).sendKeys("Selenium"); 
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[@disabled='true']/following-sibling::option[1]")).click();
	 
	
	
				
}
}
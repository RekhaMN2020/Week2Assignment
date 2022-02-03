package Week2.assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class CheckboxHtml {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[3]")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[4]")).click();
				
		
		WebElement s1=driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[2]/div[1]/input[1]"));
		boolean a=s1.isSelected();
		System.out.println(a);
		if(a==true)
		{
		System.out.println("Selenium is checked");
		}
		else
		{
			System.out.println("Selenium is not checked");
		}
		
		driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[3]/div[2]/input[1]")).click();
		
		driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[4]/div[1]/input[1]")).click();
		
		driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[4]/div[2]/input[1]")).click();
		driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[4]/div[3]/input[1]")).click();
		driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[4]/div[4]/input[1]")).click();
		driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[4]/div[5]/input[1]")).click();
		
		
}
}
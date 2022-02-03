package Week2.assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class EditHtml {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("mnrekha@gmail.com");
		System.out.println(driver.findElement(By.name("username")).getAttribute("value"));
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("REKHA");
		WebElement aa=driver.findElement(By.xpath("//input[@disabled='true']"));
		Boolean editable=aa.isEnabled();
		System.out.println(editable);
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();

}

	
}
package Week2.assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Rekha");
		driver.findElement(By.id("lastNameField")).sendKeys("MN");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Rekha");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("MN");
		
		Thread.sleep(1000);
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createContactForm_description")).sendKeys("THIS IS IT DEPARTMENT");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("mnrekha@gmail.com");
		WebElement state=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select sp=new Select(state);
		sp.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("THIS IS AN IMPORTANT MESSAGE");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		System.out.println(driver.findElement(By.id("sectionHeaderTitle_contacts")).getText());
		
}
}
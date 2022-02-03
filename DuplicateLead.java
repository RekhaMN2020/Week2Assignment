package Week2.assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
public class DuplicateLead {
	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.linkText("Email")).click();
		driver.findElement(By.id("ext-gen282")).sendKeys("mnrekha@gmail.com");
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody[1]/tr[1]/td[1]/div[1]/a[1]")).getText());
		String b=driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody[1]/tr[1]/td[3]/div[1]/a[1]")).getText();
		System.out.println(b);
		
		String a=driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody[1]/tr[1]/td[1]/div[1]/a[1]")).getText();
		System.out.println(a);
	
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody[1]/tr[1]/td[1]/div[1]/a[1]")).click();
		String c=driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(c);
		if(b.equalsIgnoreCase(c))
		{
			System.out.println("the duplicated names are same");
		}
		else
		{
			System.out.println("the duplicated names are NOT same");
		}
		driver.findElement(By.linkText("Duplicate Lead")).click();
		System.out.println(driver.findElement(By.id("sectionHeaderTitle_leads")).getText());
		Thread.sleep(2000);
		

		

		
}
}

package Week2.assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
public class EditLead {
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
		driver.findElement(By.id("ext-gen248")).sendKeys("REKHA");
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody[1]/tr[1]/td[1]/div[1]/a[1]")).getText();
		String b=driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody[1]/tr[1]/td[3]/div[1]/a[1]")).getText();
	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody[1]/tr[1]/td[1]/div[1]/a[1]")).click();
		String c=driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		System.out.println(c);
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		//String s2="HONEYWELL";
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("HONEYWELL");
		Thread.sleep(1000);
		String s2=driver.findElement(By.id("updateLeadForm_companyName")).getAttribute("value");
		System.out.println("The Company Name is changed to"+ " "+ s2);
		driver.findElement(By.id("updateLeadForm_firstName")).click();
			
		driver.findElement(By.name("submitButton")).click();
		String s1=driver.findElement(By.id("viewLead_companyName_sp")).getText();
		String s3=s1.substring(0, 9);
			
		if(s2.equals(s3))
			System.out.println("Company Name Updated");
		else
			System.out.println("NOT Updated");
	
	
	
}
}
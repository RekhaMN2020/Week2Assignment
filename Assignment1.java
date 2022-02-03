package Week2.assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {
	public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.get(" https://en-gb.facebook.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
					
			//Sign in
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']")).sendKeys("REKHA");
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("SREERAM");
			driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9962987465");
			driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("ABCDEFGH");
			
			Thread.sleep(2000);
			
			WebElement day=driver.findElement(By.id("day"));
			Select dd=new Select(day);
			dd.selectByIndex(28);
			Thread.sleep(1000);
			
			
			WebElement month=driver.findElement(By.id("month"));
			Select dd1=new Select(month);
			dd1.selectByValue("6");
			Thread.sleep(1000);
			
			
			WebElement year=driver.findElement(By.id("year"));
			Select dd2=new Select(year);
			dd2.selectByVisibleText("1977");
			
			
			driver.findElement(By.xpath("//input[@class='_8esa']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@class='_1lch']")).click();
}
}


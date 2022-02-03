package Week2.assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class ButtonHtml {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		//driver.findElement(By.id("home")).click();
		System.out.print("The X position is:");
		System.out.println(driver.findElement(By.id("position")).getLocation().getX());
		System.out.print("The Y position is:");
		System.out.println(driver.findElement(By.id("position")).getLocation().getY());
		System.out.print("The RGBA values are:");
		System.out.println(driver.findElement(By.id("color")).getCssValue("background-color"));
		System.out.print("The Height of the Button is:");
		System.out.println(driver.findElement(By.id("size")).getSize().height);
		System.out.print("The Width of the Button is:");
		System.out.println(driver.findElement(By.id("size")).getSize().width);
}
}
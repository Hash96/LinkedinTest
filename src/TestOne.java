import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestOne {
	@Test
	public void systemTesting() {
		System.setProperty("webdriver.gecko.driver","C:\\WebDriver\\firefox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();	
		
		String baseURL = "https://www.google.com/";
		driver.get(baseURL);
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Linkedin");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='btnK']")).click();
		driver.findElement(By.xpath("//*[text()='LinkedIn Login, Sign in | LinkedIn']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='username'][@type=\"text\"]")).sendKeys("hashan.mahisanka.9@gmail.com");
		driver.findElement(By.xpath("//input[starts-with(@id,'password')]")).sendKeys("hashan1234");
		driver.findElement(By.xpath("//*[contains(@type,'submit')]")).click();
		
		driver.close();
	}

}
 
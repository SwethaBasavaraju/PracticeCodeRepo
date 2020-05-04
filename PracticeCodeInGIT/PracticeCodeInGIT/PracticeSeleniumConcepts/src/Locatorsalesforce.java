import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locatorsalesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\Swetha\\work\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		//create driver object
		WebDriver driver =new FirefoxDriver();
		
		driver.get("https://login.salesforce.com");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("username")).sendKeys("swethab_shashidhar@yahoo.co.in");
		

		driver.findElement(By.name("pw")).sendKeys("123456");
		
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		
		//driver.findElement(By.cssSelector("#Login")).click();
		
				System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		


	}

}

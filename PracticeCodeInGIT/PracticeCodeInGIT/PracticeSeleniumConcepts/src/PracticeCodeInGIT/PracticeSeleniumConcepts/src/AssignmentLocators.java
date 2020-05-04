import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Swetha\\work\\chromedriver_win32\\chromedriver.exe");
		// create driver object
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.cleartrip.com/flights");
		// driver.findElement(By.id("divpaxinfo")).click();

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		Select s = new Select(driver.findElement(By.id("Adults")));
		s.selectByValue("2");

//       driver.findElement(By.id("alertbtn")).click();

		Select s1 = new Select(driver.findElement(By.id("Childrens")));
		s1.selectByValue("6");
		Select s2 = new Select(driver.findElement(By.id("Infants")));
		s2.selectByValue("1");

		driver.findElement(By.id("SearchBtn")).click();
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

//       driver.findElement(By.xpath("//a[@id='MoreOptionsLink']")).click();
//       
//       driver.findElement(By.name("airline")).sendKeys("Indigo");

	}

}

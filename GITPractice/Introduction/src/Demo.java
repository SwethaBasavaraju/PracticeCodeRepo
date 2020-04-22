import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//invoke the browser
		
				System.setProperty("webdriver.chrome.driver","C:\\Swetha\\work\\chromedriver_win32\\chromedriver.exe");
				//create driver object
				WebDriver driver =new ChromeDriver();
				driver.get("https://google.com");
				
				


	}

}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class testcase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver","C:\\Swetha\\work\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
		//create driver object
		WebDriver driver =new InternetExplorerDriver();
		
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		
		
		


	}

}

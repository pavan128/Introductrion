package start;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver","E:\\Pavan\\IEDriverServer.exe");
		WebDriver driver= new InternetExplorerDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());

	}

}

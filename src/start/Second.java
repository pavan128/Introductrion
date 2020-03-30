package start;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","E:\\Pavan\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());


	}

}

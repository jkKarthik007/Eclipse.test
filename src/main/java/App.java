

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class App {
	
	@BeforeClass
	public static void launchBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\karthick-jk\\eclipse-workspace\\Newmaven\\driver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com");
    }
}

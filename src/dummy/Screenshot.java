package dummy;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class Screenshot {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vikas\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		EventFiringWebDriver fr=new EventFiringWebDriver(driver);
		File src=fr.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/test.png");
		Files.copy(src, dest);
	}

}

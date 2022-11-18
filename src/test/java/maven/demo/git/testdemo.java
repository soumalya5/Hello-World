package maven.demo.git;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URL;
//import java.awt.List;
import java.util.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

class TestDemo {

	@Test
	void whenTest() throws MalformedURLException {
		System.out.println("in testdemodemo1");
		//System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver;
		//WebDriverManager.chromedriver().driverVersion("107.0.5304.87").setup();
		ChromeOptions options = new ChromeOptions();
		options.setCapability("browserVersion", "107");
		options.addArguments("--headless", "--start-maximized","--ignore-certificate-errors" );
		driver = new RemoteWebDriver(options);
		
		driver.manage().window().maximize();
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setCapability("browserName","chrome");
//		capabilities.setCapability("enableVNC", false);
//		capabilities.setCapability("enableVideo", false);
		String url="https://www.totaljobs.com";
		//WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println("The page title is : " +driver.getTitle());
		String title=driver.getTitle().toLowerCase();
		Assert.assertTrue(title.contains("totaljobs"));
		driver.quit();
		
	}
	@Test
	void testNew() {
		System.out.println("in test2");
	}

}

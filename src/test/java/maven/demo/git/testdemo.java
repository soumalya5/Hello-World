package maven.demo.git;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

//import java.awt.List;
import java.util.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


class TestDemo {

	@Test
	void whenTest() {
		System.out.println("in testdemodemo1");
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		String url="https://www.totaljobs.com";
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

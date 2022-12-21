package shadowElementPractise;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowElementTest {
	@Test
	public void findTheShadow() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop.polymer-project.org/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele = (WebElement)js.executeScript("return document.querySelector(\"body > shop-app\").shadowRoot.querySelector(\"#tabContainer > shop-tabs > shop-tab:nth-child(3) > a\")");
	   Thread.sleep(2000);
		ele.click();
	}

}

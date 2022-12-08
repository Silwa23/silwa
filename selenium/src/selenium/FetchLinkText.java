package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FetchLinkText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		List<WebElement> link = driver.findElements(By.xpath("//a"));
		int count = link.size();
		for( WebElement linkuu:link)
		{
			String t = linkuu.getAttribute("href");
			System.out.println(t);
		}
		driver.close();

	}

}

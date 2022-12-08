package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountSelect {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/ADMIN/Desktop/Checkbox.html");
		Thread.sleep(1000);
		List<WebElement> Link = driver.findElements(By.xpath("//input"));
		int count = Link.size();
		System.out.println(count);
		for(int i = 0; i<count;i++)
		{
		  WebElement ele = Link.get(i);
		  ele.click();
		  Thread.sleep(1000);
		}
		for(int j = count-1;j>=0;j--)
		{
			WebElement ele1 = Link.get(j);
			ele1.click();
			Thread.sleep(1000);
		}
		

	}

}

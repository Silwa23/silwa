package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "./software.geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);
		WebElement src = driver.findElement(By.xpath("//div[.='Madrid']"));
        Thread.sleep(2000);
        WebElement tar = driver.findElement(By.id("box105"));
        Thread.sleep(2000);
        Actions act = new Actions(driver);
        act.dragAndDrop(src, tar).perform();
	}

}

package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		driver.get("https://jqueryui.com/");
		
		driver.findElement(By.linkText("Sortable")).click();
		WebElement framename=driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(framename);
		WebElement item4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
		int location = item4.getLocation().getY();
		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		Actions builder=new Actions(driver);
		builder.dragAndDropBy(item1, 0, location).build().perform();
		
		
	}

}

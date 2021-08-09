package verifaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify2
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement loc = driver.findElement(By.id("twotabsearchtextbox"));
		 loc.sendKeys("sony");
		 String txt = loc.getAttribute("value");
		 System.out.println("Text is :"+txt);
		 

	}

}

package verifaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify1 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//String Actuallink = driver.findElement(By.linkText("Customer Service")).getText();
		String Actuallink = driver.findElement(By.linkText("Customer Service")).getAttribute("innerHTML");
		String expectedlink = "Customer Ser";
		//if(Actuallink.equals(expectedlink))
		//if(Actuallink.equalsIgnoreCase(expectedlink))
		if(Actuallink.contains(expectedlink))
			System.out.println("link is equal...");
		else
			System.out.println("link is not equal....");
			

	}

}

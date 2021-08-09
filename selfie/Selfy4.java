package webdriver.selfie;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Selfy4 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++) 	
		{
			Date d=new Date();
			String dt = d.toString().replace(':','-').replace(' ','_');
			String linkname = links.get(i).getText();
			links.get(i).click();
			 File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			    FileHandler.copy(srcFile, new File("C:\\Users\\koti\\Desktop\\screenshot\\"+linkname+"_"+dt+".jpeg"));
			    driver.navigate().back();
			    links=driver.findElements(By.tagName("a"));

	}

}
} 
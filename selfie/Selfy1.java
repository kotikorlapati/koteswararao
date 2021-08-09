package webdriver.selfie;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Selfy1 {

	public static void main(String[] args) throws Exception  {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(srcFile, new File("‪C:\\Users\\koti\\Desktop\\selfy1.png"));

	}

}

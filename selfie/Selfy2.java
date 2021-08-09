package webdriver.selfie;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Selfy2 {

	
		public static void main(String[] args) throws Exception  {
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
		  List<WebElement>links = driver.findElements(By.linkText("Rajinikanth"));
		  if(links.size()==0){
			  
		 File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    FileHandler.copy(srcFile, new File("C:\\Users\\koti\\Desktop\\screenshot.jpeg"));
		  }
		}
}
//System.out.println("----------------");

		 /* List<WebElement> links = driver.findElements(By.tagName("a"));
		  for( WebElement l:links ) {
			  System.out.println(l.getText());*/
			/*List<WebElement> links = driver.findElements(By.xpath("//li[@class='top-list-item top-list-item__1 top-list-item--ranked top-list-item--odd']/a"));
			for( WebElement l:links ) {
				System.out.println(l.getText());
*/		 
	



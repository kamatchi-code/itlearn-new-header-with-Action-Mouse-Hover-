package itlearnnewheader;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class newHeader {
  
		public static void main(String[] args) throws InterruptedException {
			//configure browser
			WebDriver driver =new ChromeDriver();
			
			//launch url
			driver.get("https://www.itlearn360.com");
			WebElement sign = driver.findElement(By.xpath("//span[contains(text(),'Sign in?')]"));
			sign.click();
			driver.manage().window().fullscreen();
			WebElement element = driver.findElement(By.id("user_login"));
			Thread.sleep(2000);
			element.sendKeys("KAMATCHI11");
			WebElement element2 = driver.findElement(By.id("user_pass"));
			Thread.sleep(2000);
			element2.sendKeys("MIAMI@123$");
			String a1 = element2.getAttribute("name");
			System.out.println(a1);
			String pass = element2.getAttribute("value");
			System.out.println(pass);
			WebElement element3 = driver.findElement(By.name("wp-submit"));
			element3.click();
			driver.manage().window().maximize();
			
			//see courses
			Thread.sleep(2000);
			 WebElement element4 = driver.findElement(By.className("xpro-button-text"));
			element4.click();
			driver.manage().window().fullscreen();
			
			//back to logo
			Thread.sleep(2000);
		    WebElement element5 = driver.findElement(By.xpath("//img[@fetchpriority='high']"));
		    element5.click();
			driver.manage().window().fullscreen();

			//JavascriptExecutor js=(JavascriptExecutor)driver;
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,0)");
			Thread.sleep(2000);
			
			//Headers

			WebElement Blg = driver.findElement(By.xpath("//span[text()='Blog']"));
			Blg.click();
			driver.manage().window().fullscreen();
			Thread.sleep(2000);
			
			
			// new header Trainings/Demo
			WebElement TraiDemo = driver.findElement(By.xpath("//span[text()='Trainings/Demos']"));
			TraiDemo.click();
			driver.manage().window().fullscreen();
			Thread.sleep(2000);
			
			//upcoming trainings
			WebElement upcomingtrai = driver.findElement(By.xpath("//span[text()='Upcoming Trainings']"));
			Thread.sleep(2000);
			Actions acc = new Actions(driver);
			acc.moveToElement(upcomingtrai).perform();
			Thread.sleep(2000);
			
			WebElement manualtrai = driver.findElement(By.xpath("//a[text()='Manual & Automation Testing Training']"));
			acc.moveToElement(manualtrai).perform();
			Thread.sleep(2000);
			
			WebElement selWD = driver.findElement(By.xpath("//span[text()='Master Selenium WebDriver with Java']"));
			acc.moveToElement(selWD).perform();
			Thread.sleep(2000);
			
			WebElement selpython = driver.findElement(By.xpath("//span[text()='Master Selenium Webdriver with Python']"));
			acc.moveToElement(selpython).perform();
			Thread.sleep(2000);
			
			WebElement ISTQB = driver.findElement(By.xpath("//span[text()='ISTQB Foundation Certification']"));
			acc.moveToElement(ISTQB).perform();
			Thread.sleep(2000);
			
			WebElement Appium = driver.findElement(By.xpath("//span[text()='Master Mobile Testing with Appium']"));
			acc.moveToElement(Appium).perform();
			Thread.sleep(2000);
			
			// DEMOS
			
			WebElement Demos = driver.findElement(By.xpath("//span[text()='Demos']"));
			acc.moveToElement(Demos).perform();
			Thread.sleep(2000);
			
			WebElement ManualTest = driver.findElement(By.xpath("//span[text()='Manual Testing Training Program']"));
			acc.moveToElement(ManualTest).perform();
			Thread.sleep(2000);
			
			WebElement SelTest = driver.findElement(By.xpath("//span[text()='Selenium WebDriver Training Program']"));
			acc.moveToElement(SelTest).perform();
			Thread.sleep(2000);
			
			WebElement ISTQBCerf = driver.findElement(By.xpath("//span[text()='ISTQB Foundation Certification']"));
			acc.moveToElement(ISTQBCerf).perform();
			Thread.sleep(2000);
			
			WebElement SDET = driver.findElement(By.xpath("//span[text()='SDET Training']"));
			acc.moveToElement(SDET).perform();
			Thread.sleep(2000);
			
			WebElement BA = driver.findElement(By.xpath("//span[text()='Master Business Analysis Training']"));
			acc.moveToElement(BA).perform();
			Thread.sleep(2000);
			
			WebElement Project = driver.findElement(By.xpath("//span[text()='Selenium Live Project-Based Training']"));
			acc.moveToElement( Project).perform();
			Thread.sleep(2000);
			
			//Contactus
			WebElement Cntus = driver.findElement(By.xpath("//span[text()='Contact US']"));
			Cntus.click();
			driver.manage().window().fullscreen();
			Thread.sleep(2000);
			WebElement DB = driver.findElement(By.xpath("//span[text()='My Dashboard']"));
			DB.click();
			driver.manage().window().fullscreen();
			Thread.sleep(2000);
			 WebElement element10 = driver.findElement(By.xpath("//span[text()='Logout']"));
		     element10.click();
		     driver.manage().window().maximize();
		     driver.quit();
			
		}
}

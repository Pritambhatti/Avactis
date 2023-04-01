package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;

public class AssignmentTestNG1 {
	WebDriver driver;//instance variable of the new class

  @Test
  public void nTloginTest() throws InterruptedException {
	    Thread.sleep(3000);
	   	WebElement Uname= driver.findElement(By.name("username"));
		Uname.sendKeys("Admin");
		//Enter Password
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("admin123");
		//click on submit
		Uname.submit();
		//driver.findElement(By.name("password")).submit();
		//Validate/ verify
       	Thread.sleep(1000);
		String expectedPageTitle= "OrangeHRM";
		String acutualPageTitle=driver.getTitle();
		
		System.out.println("Actual page is -->"+acutualPageTitle);
		assertEquals(acutualPageTitle,expectedPageTitle, "Test case failed");
		/*if (expectedPageTitle.equals(acutualPageTitle))	
		{
			System.out.println("Test case is Passed");
		}
		else {
			System.out.println("Test case is Failed");
		}*/
        }
    @BeforeMethod
  public void beforeMethod() {
    	 ChromeOptions options = new ChromeOptions();
 		options.addArguments("--remote-allow-origins=*"); 

 		driver = new ChromeDriver(options);
	 
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }
  @AfterMethod
  public void afterMethod() {
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }
}

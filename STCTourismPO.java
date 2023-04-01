package po.pobasic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class STCTourismPO {
	WebElement username;

	WebElement password;
	WebElement submit;
	WebElement customizedTours;
	WebDriver driver;
	String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	//String url = "https://nichethyself.com/tourism/home.html";

	public STCTourismPO(){
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*"); 
 		WebDriver driver = new ChromeDriver(options);
		//driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		driver.get(url);
		//username = driver.findElement(By.name("username"));
		//password = driver.findElement(By.name("password"));
		//submit = driver.findElement(By.xpath("//form[@name='loginform']/button[text()='Submit']"));
		//customizedTours = driver.findElement(By.linkText("Customized tours"));
		
		
		//********************************FOR Orange HRM****************
		WebElement Uname= driver.findElement(By.name("username"));
		Uname.sendKeys("Admin");
		//Enter Password
		driver.findElement(By.name("password")).clear();
				driver.findElement(By.name("password")).sendKeys("admin123");
		//click on submit
		Uname.submit();
	}

	public void login(String user, String pass) {
		username.sendKeys(user);
		password.sendKeys(pass);
		submit.click();
	}

	public void closePage() {
		driver.quit();
	}

	public void goToCustomizedTours() {
		customizedTours.click();		
	}

	public String getPageTitleAfterLogin() {
		// TODO Auto-generated method stub
		return driver.getTitle();
	}

}

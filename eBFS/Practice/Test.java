package eBFS.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
	
	private static WebDriver driver;


	public static void main(String[] args) throws Throwable {
		
		//System.setProperty("webdriver.firefox.driver", "C:\\Users\\Hossain Sakhaout\\Documents\\Selenium\\Driver\\geckodriver.exe");
		driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		Thread.sleep(5000);
		driver.get("http://ebfs.bruteforcesolution.net/ebfs/index.php");
		driver.manage().window().maximize();
		
		
		HomePage HomePage_OBJ = new HomePage(driver);
		LoginPage LoginPage_OBJ = new LoginPage(driver);
		
		HomePage_OBJ.printHomePage();
		LoginPage_OBJ.printLoginPage();
		driver.close();
		
	}

}

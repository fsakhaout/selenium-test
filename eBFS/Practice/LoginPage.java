package eBFS.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage extends WebElements {
	
	CommonFeaturesForAllPage commonWebElement_Obj = new CommonFeaturesForAllPage(driver);

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	public void clickOnSignIn() {
		driver.findElement(log_in).click();
	}
	public String getTitaleLoginPage() {
		return driver.getTitle();
	}
	
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	public void createAccount() throws InterruptedException {
		String email = this.email;
		String password = this.password;
		String firstName = this.firstName;
		String lastname = this.lastName;
		String loginPageUrl = "http://ebfs.bruteforcesolution.net/ebfs/index.php?controller=my-account";
		
		
		driver.findElement(CreateAccountEmail).sendKeys(email);
		driver.findElement(CreateAccountButton).click();
		
		Thread.sleep(5000);
		
		driver.findElement(Gender_Title).click();
		driver.findElement(FirstNameBox).sendKeys(firstName);
		driver.findElement(LastNameBox).sendKeys(lastname);
		driver.findElement(Password).sendKeys(password);
		
		Select day = new Select(driver.findElement(BirthDay));
		day.selectByIndex(05);
		Select mounth = new Select(driver.findElement(BirthMounth));
		mounth.selectByIndex(04);
		Select year = new Select(driver.findElement(BirthYear));
		year.selectByValue("1989");
		
		driver.findElement(RegisterButton).click();
		
		Thread.sleep(5000);
		
		if(loginPageUrl.equals(getCurrentUrl())) {
			System.out.println("TestCase pass. Account Created is Done.");
		}else {
			System.out.println("TestCase fail.");
		}
		
		Thread.sleep(5000);
		driver.findElement(LogOutButton).click();
		Thread.sleep(5000);
	}
	
	public void signInButton() throws InterruptedException {
		String loginPageUrl = "http://ebfs.bruteforcesolution.net/ebfs/index.php?controller=my-account";
		driver.findElement(log_in).click();
		driver.findElement(EmailAddressBox).sendKeys(this.email);
		driver.findElement(PasswordBox).sendKeys(this.password);
		driver.findElement(SigninButton).click();
		
		Thread.sleep(5000);
		
		if(loginPageUrl.equals(getCurrentUrl())) {
			System.out.println("TestCase passed. Login succesfully");
		}else {
			System.out.println("TestCase fail.");
		}
	}
	
	
	public void printLoginPage() throws Throwable {
		System.out.println("==============LoginPage=============\n");
		clickOnSignIn();
		System.out.println("Login_page Title: "+getTitaleLoginPage());
		createAccount();
		signInButton();
		commonWebElement_Obj.LocationOf_eBFSLogo();
		System.out.println("Contuct Us Buttun is visuable."+commonWebElement_Obj.isContuctUsDisplayed());
		System.out.println("eBFS logo are visiable - "+commonWebElement_Obj.eBFSLogo_Visiable());
		System.out.println("\n");

	}

}

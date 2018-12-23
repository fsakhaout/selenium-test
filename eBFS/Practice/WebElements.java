 package eBFS.Practice;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebElements  extends UserData{
	protected WebDriver driver;
	//WebElement for HomePage.
	By eBFS_Logo  = By.xpath("//img[@class='logo img-responsive']");
	By sale_banner = By.className("banner");
	By log_in = By.className("login");
	By contuctUs = By.id("contact-link"); 
	By callUsNow = By.className("shop-phone");
	
	//WebElement for Creating Account.
	By CreateAccountEmail = By.id("email_create");
	By CreateAccountButton = By.id("SubmitCreate");
	By FirstNameBox = By.xpath("//input[@id='customer_firstname']");
	By LastNameBox = By.name("customer_lastname");
	By Gender_Title = By.xpath("//*[@id=\"id_gender1\"]");
	By Password = By.xpath("//input[@id='passwd']");
	
	By BirthDay = By.xpath("//select[@id='days']");
	By BirthMounth = By.xpath("//select[@id='months']");
	By BirthYear = By.xpath("//select[@id='years']");
	
	By CheckBoxForNewxleter = By.id("newsletter");
	By RegisterButton = By.xpath("//button[@id='submitAccount']//span");
	By LogOutButton = By.xpath("//a[@title='Log me out']");
	
	//Element for login option.
	By EmailAddressBox = By.id("email");
	By PasswordBox = By.id("passwd");
	By SigninButton = By.xpath("//*[@id=\"SubmitLogin\"]/span");
	
	
	public WebElements(WebDriver driver) {
		this.driver = driver;
	}
	public ArrayList<String>element(){
		ArrayList<String>elementName = new ArrayList<String>();
		return null;
	}
}

package eBFS.Practice;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;


public class HomePage extends WebElements {

CommonFeaturesForAllPage commonWebElement_Obj = new CommonFeaturesForAllPage(driver);
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public void getSizeOfSaleBanner() {
		Dimension image =driver.findElement(sale_banner).getSize();
		int imageWidth = image.width;
		int imageHeight = image.height;
		System.out.println("Size of sale banner: ( " +imageWidth +", " +imageHeight +" )");
	}
	
	public String getCallUsNumber() {
		return driver.findElement(callUsNow).getText();
	}
	
	public void printHomePage() {
		System.out.println("==============HomePage=============\n");
		getSizeOfSaleBanner();
		System.out.println("Call us numbre:"+getCallUsNumber());
		System.out.println("Contuct Us Buttun is visuable."+commonWebElement_Obj.isContuctUsDisplayed());
		System.out.println("Login Buttun is visuable."+commonWebElement_Obj.isloginDisplayed());
		System.out.println("eBFS logo are visiable - "+commonWebElement_Obj.eBFSLogo_Visiable());
		commonWebElement_Obj.LocationOf_eBFSLogo();
		System.out.println("\n");

	}
}

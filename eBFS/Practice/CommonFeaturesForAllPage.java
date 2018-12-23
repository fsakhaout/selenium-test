package eBFS.Practice;

import org.openqa.selenium.WebDriver;

public class CommonFeaturesForAllPage extends WebElements {

	public CommonFeaturesForAllPage(WebDriver driver) {
		super(driver);
	}
	
	public void LocationOf_eBFSLogo() {
		int xCooordinate = driver.findElement(eBFS_Logo).getLocation().getX();
		int yCoordinate = driver.findElement(eBFS_Logo).getLocation().y;
		System.out.println("Position of eBFS Logo: ("+xCooordinate +(",") +yCoordinate +(")"));
	}
	
	public boolean isloginDisplayed() {
		return driver.findElement(log_in).isDisplayed();
	}
	
	
	public boolean isContuctUsDisplayed() {
		return driver.findElement(contuctUs).isDisplayed();
	}
	
	public Boolean eBFSLogo_Visiable() {
		return driver.findElement(eBFS_Logo).isDisplayed();
	}

}

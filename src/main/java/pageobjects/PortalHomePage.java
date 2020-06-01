package pageobjects;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PortalHomePage {
	
	public PortalHomePage(WebDriver driver) {
		this.driver=driver;
	}
	WebDriver driver;
By searchbox= By.id("input-search");
public WebElement getSearchIcon() {
	return driver.findElement(searchbox);
}
}

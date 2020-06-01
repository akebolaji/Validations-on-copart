package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VehicleFinder {
public WebDriver driver;
private By make= By.cssSelector("span[title='Toyota']");
public VehicleFinder(WebDriver driver) {
	this.driver=driver;
}
public WebElement getMake() {
	return driver.findElement(make);
}

}

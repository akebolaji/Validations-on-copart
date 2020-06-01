package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashBoard {
public WebDriver driver;

private By findVehicle=By.xpath("//a[@data-uname='homePageFindAVehicle']");
private By vehicleMake=By.xpath("//a[@data-uname='vehicleFinderTab']");

public DashBoard(WebDriver driver) {
	this.driver=driver;
}
public WebElement getVehicle() {
	return driver.findElement(findVehicle);
}
public WebElement getVehicleMake() {
	return driver.findElement(vehicleMake);
}

}

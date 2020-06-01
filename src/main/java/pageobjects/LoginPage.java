package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;
private By emailID= By.id("username");
private By pass= By.id("password");
private By signAccount= By.xpath("//button[@class='btn btn-lblue loginfloatright margin15']");
public LoginPage(WebDriver driver) {
	this.driver=driver;
}
public WebElement getEmail() {
	return driver.findElement(emailID);
}
public WebElement getPassword() {
	return driver.findElement(pass);
}
public WebElement getSignAcct() {
	return driver.findElement(signAccount);
}


}

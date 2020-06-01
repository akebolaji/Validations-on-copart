package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	
	public WebDriver driver;
	
	private By signIn= By.xpath("//a[@data-uname='homePageSignIn']");
	private By member= By.xpath("//a[@class='btn btn-lblue'][contains(text(),'Member')]");
	private By logo= By.cssSelector("img[class='img-responsive copart-img']");
	private By title=By.cssSelector("div[class='herotext']");
	private By navigationBar=By.xpath("//ul[@class='nav navbar-nav']");
	
	
	public LandingPage(WebDriver driver) {
		this.driver= driver;
	}


	public WebElement getLogIn() {
		return driver.findElement(signIn);
		
	}
	public WebElement getMember() {
		return driver.findElement(member);
	}
	public WebElement getLogo() {
		return driver.findElement(logo);
	}
	public WebElement getTitle() {
		return driver.findElement(title);
	}
	public WebElement getNavBar() {
		return driver.findElement(navigationBar);
	}
}

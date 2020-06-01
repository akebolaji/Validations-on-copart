package E2E.copart;



import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.LandingPage;
import resources.Base;

public class ValidateTitle extends Base{
	LandingPage lp;
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(Base.class.getName());
	
	
@BeforeTest
public void intial() throws IOException {
	driver=initializeBrowser();

	driver.get(prop.getProperty("url"));

}
@Test
public void intialize() throws IOException {
	
    lp= new LandingPage(driver);
	Assert.assertEquals(lp.getTitle().getText(), "Find123 your next used or salvage car today!");
	log.info("Successfully validated Test message");
	
	
}
@Test
public void ValidateNavBar() throws IOException{
	lp= new LandingPage(driver);
	Assert.assertTrue(lp.getNavBar().isDisplayed());
}
@AfterTest
public void teardown() {
	driver.close();
}
}

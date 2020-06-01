package E2E.copart;

import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.DashBoard;
import pageobjects.LandingPage;
import pageobjects.LoginPage;
import pageobjects.VehicleFinder;
import resources.Base;

public class HomePage extends Base{
	public static Logger log=LogManager.getLogger(Base.class.getName());
public WebDriver driver;
@BeforeTest
public void intial() throws IOException {
	driver=initializeBrowser();
	
}
@Test(dataProvider="getData")
public void intialize(String username, String password) throws IOException, InterruptedException {
	driver.get(prop.getProperty("url"));
	LandingPage lp = new LandingPage(driver);
	lp.getLogIn().click();
	lp.getMember().click();
	LoginPage l= new LoginPage(driver);
	l.getEmail().sendKeys(username);
	l.getPassword().sendKeys(password);
	l.getSignAcct().click();
	Thread.sleep(3000);
	DashBoard db= new DashBoard(driver);
	db.getVehicle().click();
	db.getVehicleMake().click();
	VehicleFinder vf= new VehicleFinder(driver);
	vf.getMake().click();
	log.info("car brands are displayed correctly");
	
}
@DataProvider
public Object[][] getData() {
	Object[][] data= new Object[1][2];
	data[0][0]= "akebolaji@gmail.com";
	data[0][1]= "wonderful86";
	return data;
}
@AfterTest
public void teardown() {
	driver.close();
}

}

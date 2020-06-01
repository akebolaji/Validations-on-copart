package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public Properties prop;
	public WebDriver driver;
public WebDriver initializeBrowser() throws IOException {
	
	 prop = new Properties();
	 
	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
	prop.load(fis);
	//String browserName=System.getProperty("browser");
	String browserName=prop.getProperty("browser");
	if(browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ake\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	else if(browserName.equals("firefox")) {
		
	}
	else if(browserName.equals("IE")) {
		
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	return driver;
	
	
}
public String getScreenShotPath(String testCaseName,WebDriver driver) throws IOException {
	 
	TakesScreenshot ts=(TakesScreenshot) driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
	FileUtils.copyFile(source,new File(destinationFile));
	return destinationFile;
}
}

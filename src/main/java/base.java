
import java.io.IOException;

import java.util.concurrent.TimeUnit;

import PageObject.LoginPagePO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	public  static WebDriver driver;

public static WebDriver initializeDriver() throws IOException
{

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARaj\\Documents\\KPLearn\\jars\\chromedriver.exe");
	  driver = new ChromeDriver();
		//execute in chrome driver

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
return driver;


}
public WebDriver lauchApplication() throws IOException {
	driver=initializeDriver();
	driver.get("https://stage-www.kaplanlearn.com/");
	driver.switchTo().frame(driver.findElement(By.id("iamFrame")));
	LoginPagePO lp = new LoginPagePO(driver);
	lp.username().sendKeys("alexstg@mailinator.com");
	lp.password().sendKeys("Cow1234!");
	lp.login().click();
	driver.switchTo().defaultContent();
	return  driver;
}


}


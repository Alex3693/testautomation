
import PageObject.HomePagePO;
import PageObject.LoginPagePO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.io.IOException;


public class LoginTest extends base {
    WebDriver driver1;

    @Test
    public void login () throws IOException {
         driver1 = initializeDriver();
        driver1.get("https://stage-www.kaplanlearn.com/");
        driver1.switchTo().frame(driver1.findElement(By.id("iamFrame")));
        LoginPagePO lp = new LoginPagePO(driver1);
        lp.username().sendKeys("demaster");
        lp.password().sendKeys("Cow1234!");
        lp.forgetPassword().isEnabled();
        lp.login().click();
        driver1.switchTo().defaultContent();
       // WebDriver driver1=  lauchApplication();
        HomePagePO hp = new HomePagePO (driver1);
        String Welcometext = hp.header().getText();
        System.out.println(Welcometext);
    /*    Assert.assertTrue( hp.instructorPage().isEnabled());
        Assert.assertTrue(hp.home().isEnabled());
        Assert.assertTrue(hp.notification().isEnabled());
        Assert.assertTrue(hp.account().isEnabled());
        System.out.println(hp.home().getText());*/
      //  hp.logout().click();
      //  driver.switchTo().frame(driver.findElement(By.id("iamFrame")));
      //  Assert.assertTrue( lp.forgetPassword().isEnabled());
       // lp.forgetPassword().click();
    }

}

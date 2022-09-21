import PageObject.HomePagePO;
import PageObject.LoginPagePO;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class homePageTest extends base {

    @Test
    public void homepage  () throws IOException {
     lauchApplication();
      HomePagePO hp = new HomePagePO (driver);
      //  String Welcometext = hp.header().getText();
      //  System.out.println(Welcometext);
      //  Assert.assertTrue( hp.instructorPage().isEnabled());
        Assert.assertTrue(hp.home().isEnabled());
        Assert.assertTrue(hp.notification().isEnabled());
        Assert.assertTrue(hp.account().isEnabled());
        System.out.println(hp.home().getText());
        //testbranch//

    }
}

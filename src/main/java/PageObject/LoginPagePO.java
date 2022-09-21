package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePO {
    public LoginPagePO(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='username']")
    WebElement username;

    @FindBy(xpath = "//input[@name='password']")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"root\"]/form/div/div/div/div[4]/button/span")
    WebElement login;

    @FindBy(xpath="//a[text()='Forgot your password?']")
    WebElement forgetPassword;


    public WebElement username() {
        return username;

    }

    public WebElement password() {
        return password;
    }

    public WebElement login() {
        return login;
    }
public WebElement forgetPassword(){
        return forgetPassword;
    }


    WebDriver driver;


}

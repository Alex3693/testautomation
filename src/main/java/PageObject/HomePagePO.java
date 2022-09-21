package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePO {

    WebDriver driver;

    public HomePagePO(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = ".header-primary-message.hidden-phone")
    WebElement header;

    @FindBy(xpath = "//a[@data-original-title='Log Out']")
    WebElement logout;

    @FindBy(css = ".icon-medium.icon-white-medium.icon-calendar")
    WebElement instructorPage;

    @FindBy(css = ".icon-medium.icon-white-medium.icon-home")
    WebElement home;

    @FindBy(css = ".icon-medium.icon-white-medium.icon-envelope.notice")
    WebElement notification;

    @FindBy(xpath="//i[@class='icon-medium icon-white-medium icon-user']")
    WebElement account;
    public WebElement header() {
        return header;
    }

    public WebElement logout() {
        return logout;
    }

    public WebElement instructorPage() {
        return instructorPage;
    }

    public WebElement home() {
        return home;
    }
    public WebElement notification() {
        return notification;
    }

    public WebElement account() {
        return account;
    }

}



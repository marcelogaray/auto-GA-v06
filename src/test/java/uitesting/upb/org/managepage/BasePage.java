package uitesting.upb.org.managepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import uitesting.upb.org.webdrivermanager.DriverManager;

/**
 * @autor Marcelo Garay
 */
public class BasePage {
    protected WebDriver webDriver;

    public BasePage() {
        this.webDriver = DriverManager.getInstance().getWebDriver();
        PageFactory.initElements(webDriver, this);
    }
}

package uitesting.upb.org.webdrivermanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @autor Marcelo Garay
 */
public class Firefox implements Browser{
    @Override
    public WebDriver initializeDriver() {
        return new FirefoxDriver();
    }
}

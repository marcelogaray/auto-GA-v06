package uitesting.upb.org.webdrivermanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @autor Marcelo Garay
 */
public class Chrome implements Browser {

    @Override
    public WebDriver initializeDriver() {
        return new ChromeDriver();
    }
}

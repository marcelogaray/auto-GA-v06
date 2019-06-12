package uitesting.upb.org.learningselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import uitesting.upb.org.prueba1.DriverPadre;
//import uitesting.upb.org.prueba2.Browser;
import uitesting.upb.org.webdrivermanager.Browser;
import uitesting.upb.org.webdrivermanager.Chrome;
import uitesting.upb.org.webdrivermanager.Firefox;

/**
 * @autor Marcelo Garay
 */
public class FirstCodeSelenium {
    public static void main(String[] args) {
//        new Chrome();
//        new Firefox();

//        new DriverPadre(new ChromeDriver());
//        new DriverPadre(new FirefoxDriver());

        Browser chrome = new Chrome();

//        chrome.openPage("https://phptravels.com/");
//
        Browser firefox = new Firefox();
//        firefox.openPage("https://phptravels.com/");



    }
}

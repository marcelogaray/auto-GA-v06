package uitesting.upb.org.handlewebsite;

import uitesting.upb.org.managefile.PropertyAccesor;
import uitesting.upb.org.managepage.google.home.Home;
import uitesting.upb.org.webdrivermanager.DriverManager;

/**
 * @autor Marcelo Garay
 */
public class LoadPage {
    public static Home loadGoogleHome(){
        DriverManager.getInstance().getWebDriver().navigate().to(PropertyAccesor.getInstance().getBaseURL());
        return new Home();
    }

    public static void main(String[] args) {
        loadGoogleHome().searchTextAndClickSearchButton("UPB cochabamba");
    }
}

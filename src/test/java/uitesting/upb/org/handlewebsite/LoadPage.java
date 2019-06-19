package uitesting.upb.org.handlewebsite;

import uitesting.upb.org.managefile.PropertyAccessor;
import uitesting.upb.org.managepage.pagesexamen2.AdidasNavBar;
import uitesting.upb.org.managepage.pagesexamen2.ShoeButton;
import uitesting.upb.org.managepage.pagesexamen2.ShoeDescription;
import uitesting.upb.org.managepage.wallet.AccountCreator;
import uitesting.upb.org.managepage.wallet.AccountManager;
import uitesting.upb.org.webdrivermanager.DriverManager;

import java.util.concurrent.TimeUnit;

public class LoadPage {

    public static AccountManager loadAccountManager() {
        DriverManager.getInstance().getWebDriver().navigate().to(PropertyAccessor.getInstance().getBaseURL());
        return new AccountManager();
    }

    public static AdidasNavBar loadAdidasNavBar(){
        DriverManager.getInstance().getWebDriver().manage().window().maximize();
        DriverManager.getInstance().getWebDriver().navigate().to(PropertyAccessor.getInstance().getBaseURL());
            return new AdidasNavBar();
    }

    public static AccountCreator loadAccountCreator() {
        return new AccountCreator();
    }

    public static ShoeButton loadShoeButton(){
        DriverManager.getInstance().getWebDriver().navigate().to(PropertyAccessor.getInstance().getBaseURL());

        return new ShoeButton();
    }

    public static void main(String[] args){


        AdidasNavBar navBar;
        ShoeButton shoeButton;
        ShoeDescription shoeDescription;

        navBar = LoadPage.loadAdidasNavBar();
        navBar.hoverHombre();

        /*
        shoeButton = LoadPage.loadShoeButton();
        String precio = shoeButton.getPrecio();
        System.out.println(precio);
       shoeDescription = shoeButton.clickShoeButton();
        TimeUnit.SECONDS.sleep(1);

        shoeDescription.clickEligeTuTalla();
       shoeDescription.clickTalla85();*/

    }
}

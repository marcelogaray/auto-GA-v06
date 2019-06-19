package uitesting.upb.org.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import uitesting.upb.org.handlewebsite.LoadPage;
import uitesting.upb.org.managepage.adidas.AdidasHeader;
import uitesting.upb.org.managepage.adidas.AdidasShopMenu;

public class AdidasStepDefs {

    private AdidasHeader adidasHeader;
    private AdidasShopMenu adidasShopMenu;

    @Given("^'AdidasHome' is loaded$")
    public void adidashomeIsLoaded() {
        adidasHeader = LoadPage.loadHeader();
    }

    @And("^hovered to 'HOMBRE' item on 'header'$")
    public void hoveredToHOMBREItemOnHeader() {
        adidasHeader.hoverHombreItem();
    }

    @And("^clicked 'Fútbol' button on displayed container$")
    public void clickedFútbolButtonOnDisplayedContainer() {
    }
}

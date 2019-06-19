package uitesting.upb.org.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import uitesting.upb.org.handlewebsite.LoadPage;
import uitesting.upb.org.managepage.adidas.AdidasHeader;
import uitesting.upb.org.managepage.adidas.AdidasShopMenu;
import uitesting.upb.org.managepage.adidas.BagPage;
import uitesting.upb.org.managepage.adidas.ShoePage;

public class AdidasStepDefs {

    private AdidasHeader adidasHeader;
    private AdidasShopMenu adidasShopMenu;
    private ShoePage shoePage;
    private BagPage bagPage;

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
        adidasShopMenu = adidasHeader.clickFutbolOption();
    }

    @Given("^Wait until item price in 'AdidasShopMenu' is visible$")
    public void waitUntilItemInAdidasShopMenuIsVisible() {
        adidasShopMenu.isItemVisible();
    }

    @Then("^price of the first item is \"([^\"]*)\"$")
    public void priceOfTheFirstItemIs(String price) {
        Assert.assertEquals(adidasShopMenu.getPriceText(), price);
    }

    @Given("^clicked 'FirstItem' on 'AdidasShopMenu'$")
    public void clickedFirstItemOnAdidasShopMenu() {
        shoePage = adidasShopMenu.clickFirstItem();
    }

    @And("^clicked on 'Elege tu Talla' button on 'ShoePage'$")
    public void clickedOnElegeTuTallaButtonOnShoePage() {
        shoePage.clickSizeSelectButton();
    }

    @And("^clicked on 'MX eight point five' button on 'ShoePage'$")
    public void clickedOnMXEightPointFiveButtonOnShoePage() {
        shoePage.clickSizeButton();
    }

    @When("^click 'Añadir al Carrito' button on 'ShoePage'$")
    public void clickAñadirAlCarritoButtonOnShoePage() {
        shoePage.clickAddToBagButton();
    }

    @And("^purchase info is visible on 'ShoePage'$")
    public void purchaseInfoIsVisibleOnShoePage() {
        shoePage.isAmountTextVisible();
    }

    @Then("^amount of bag should say \"([^\"]*)\"$")
    public void amountOfBagShouldSay(String arg0) {
        Assert.assertEquals(shoePage.getAmountText(), arg0);
    }

    @And("^click 'Ver Carrito' button on 'ShoePage'$")
    public void clickVerCarritoButtonOnShoePage() {
        bagPage = shoePage.clickViewBagButton();
    }

    @Then("^shoe title is visible on 'BagPage'$")
    public void shoeTitleIsVisibleOnBagPage() {
        Assert.assertTrue(bagPage.isTitleVisible());
    }

    @And("^Quantity Displayed on 'BagPage' is (\\d+)$")
    public void quantityDisplayedOnBagPageIs(String arg0) {
        Assert.assertEquals(bagPage.getQuantity(), arg0);
    }

    @And("^price should be \"([^\"]*)\"$")
    public void priceShouldBe(String arg0) {
        Assert.assertEquals(bagPage.getShoePrice(), arg0);
    }

    @And("^total should be \"([^\"]*)\"$")
    public void totalShouldBe(String arg0) {
        Assert.assertEquals(bagPage.getBagTotal(), arg0);
    }
}

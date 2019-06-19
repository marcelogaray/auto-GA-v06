package test_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import uitesting.upb.org.handlewebsite.LoadPage;
import uitesting.upb.org.managepage.pagesexamen2.*;

public class ExamenStepDefs {

    AdidasNavBar adidasNavBar;
    ShoeButton shoeButton;
    ShoeDescription shoeDescription;
    ShoeAddedToCart shoeAddedToCart;
    CartResume cartResume;
    String precioAntes;
    String cantidad;

    @Given("^BrowserExamen is loaded$")
    public void browserexamenIsLoaded() {

        adidasNavBar = LoadPage.loadAdidasNavBar();
    }

    @Then("^Hover 'hombre' button in 'Adidas' navbar$")
    public void hoverHombreButtonInAdidasNavbar() {
        adidasNavBar.hoverHombre();
    }

    @And("^Click 'Futbol' button in 'Adidas' navbar$")
    public void clickFutbolButtonInAdidasNavbar() {
       shoeButton = adidasNavBar.clickSubMenuFutbol();
    }

    @And("^Get 'Shoe Price Tag' in  'ShoeButton' Page$")
    public void getShoePriceTagInShoeButtonPage() {

        precioAntes = shoeButton.getPrecio();
    }

    @Then("^Click 'Shoe Button' in 'Shoe Button' Page$")
    public void clickShoeButtonInShoeButtonPage() throws InterruptedException{
         shoeButton.clickShoeButton();
        Thread.sleep(5000);
        shoeDescription = new ShoeDescription();
    }

    @And("^Click 'Elige tu talla' select in 'ShoeDescription' Page$")
    public void clickEligeTuTallaSelectInShoeDescriptionPage() {
        shoeDescription.clickEligeTuTalla();
    }


    @And("^Click 'ochoYMedio' option in 'Elige tu talla' select$")
    public void clickOchoYMedioOptionInEligeTuTallaSelect() {
        shoeDescription.clickTalla85();
    }

    @And("^Click 'Anadir al carrito' button in 'Shoe Description' Page$")
    public void clickAnadirAlCarritoButtonInShoeDescriptionPage() {
        shoeAddedToCart = shoeDescription.clickAnadirCarrito();
    }

    @Then("^Verify 'Amount' equals \"([^\"]*)\" in 'ShoeAddedToCart' Page$")
    public void verifyAmountEqualsInShoeAddedToCartPage(String cantidad1)  {

        cantidad = shoeAddedToCart.getCantidad();
        Assert.assertEquals(cantidad, "Cantidad: 1");
    }

    @And("^Click 'Ver Carrito' button in 'ShoeAddedToCart' Page$")
    public void clickVerCarritoButtonInShoeAddedToCartPage() throws InterruptedException {

        cartResume = shoeAddedToCart.clickButtonVerCarrito();
        Thread.sleep(5000);
    }

    @Then("^Verify  title 'Calzado' is visible in 'CartResume' Page$")
    public void verifyTitleCalzadoIsVisibleInCartResumePage() {

        String expectedResult = "Calzado de Fútbol Nemeziz 19.3 Terreno Firme".toUpperCase();
        Assert.assertEquals(expectedResult,cartResume.getTitle());

    }

    @And("^Verify title 'Total' is equal to price in 'CartResume' Page$")
    public void verifyTitleTotalIsEqualToPriceInCartResumePage() {

        precioAntes = precioAntes.concat(".00");
        String precioDespues = cartResume.getTotal();

        Assert.assertEquals(precioAntes,precioDespues);

    }

}

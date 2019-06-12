package uitesting.upb.org.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import uitesting.upb.org.handlewebsite.LoadPage;
import uitesting.upb.org.managepage.personalWallet.AccountHomeMenu;
import uitesting.upb.org.managepage.personalWallet.MainMenu;
import uitesting.upb.org.managepage.personalWallet.ReportsPage;

public class PersonalWalletSteps {

    private AccountHomeMenu accountHomeMenu;
    private MainMenu mainMenu;
    private ReportsPage reportsPage;

    @Given("^The main page is loaded$")
    public void loadMainPage() {
        accountHomeMenu = LoadPage.loadHomeMenu();
    }

    @Given("^Fill account name field on 'home menu' page with \"(.*)\"$")
    public void fillAccountNameField(String accountName) {
        accountHomeMenu.writeAccountName(accountName);
    }

    @Given("^Click 'Add' button on 'home menu' page$")
    public void clickAddButton() {
        accountHomeMenu.clickAddButton();
    }

    @Given("^Click \"(.*)\" button on 'home menu' page$")
    public void clickAccountButton(String accountId) {
        mainMenu = accountHomeMenu.clickButtonById(accountId);
    }

    @When("^Click 'Reports' button on 'main menu' page$")
    public void clickReportsButton() {
        reportsPage = mainMenu.clickReportsButton();
    }

    @And("^Select 'By category' in the select option on 'reports' page$")
    public void selectByCategoryOption() {
        reportsPage.selectByCategoryOption();
    }

    @And("^Click 'Show report' button on 'reports' page$")
    public void clickShowReportButton() {
        reportsPage.clickShowReportButton();
    }

    @Then("^The title is \"(.*)\"$")
    public void assertPageTitle(String title) {
        Assert.assertEquals(reportsPage.getTitle(), title);
    }

    @Then("^The table has \"([0-9]+)\" rows$")
    public void assertTableRows(String rows) {
        int numberOfRows = Integer.parseInt(rows);
        Assert.assertEquals(reportsPage.getNumberOfRows(), numberOfRows);
    }
}

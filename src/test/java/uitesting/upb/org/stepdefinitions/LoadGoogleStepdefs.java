package uitesting.upb.org.stepdefinitions;

import cucumber.api.java.en.Given;
import uitesting.upb.org.handlewebsite.LoadPage;

public class LoadGoogleStepdefs {
    @Given("^load google page$")
    public void loadGooglePage() throws Throwable {
        LoadPage.loadGoogleHome();
    }
}

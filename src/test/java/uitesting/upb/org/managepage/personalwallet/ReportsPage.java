package uitesting.upb.org.managepage.personalwallet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

import java.util.ArrayList;
import java.util.List;

public class ReportsPage extends BasePage {
    @FindBy(css = "h1.text-center")
    private WebElement title;

    @FindBy(id = "reportType")
    private WebElement reportTypeSelect;

    @FindBy(id = "showReport")
    private WebElement showReportButton;

    @FindBy(id = "startDate")
    private WebElement startDatePicker;

    @FindBy(id = "endDate")
    private WebElement endDatePicker;

    @FindBy(id = "dateError")
    private WebElement dateErrorDiv;

    @FindBy(xpath = "//table")
    private WebElement reportsTable;

    public String getTitle() {
        return title.getText();
    }

    public ReportsPage selectOptionByValue(String value) {
        Events.selectOptionInSelectElementByValue(new Select(reportTypeSelect), value);
        return this;
    }

    public ReportsPage clickShowReportButton() {
        Events.click(showReportButton);
        return this;
    }

    public ReportsPage fillStartDate(String date) {
        Events.fillField(startDatePicker, date);
        return this;
    }

    public ReportsPage fillEndDate(String date) {
        Events.fillField(endDatePicker, date);
        return this;
    }

    public int getNumberOfRows() {
        return Events.getNumberOfElements(new By.ByXPath("//table//tr"));
    }

    public String getErrorMessage() {
        String errorMessage = "";
        if (Events.isWebElementVisible(dateErrorDiv)) {
            errorMessage = dateErrorDiv.getText();
        }
        return errorMessage;
    }

    public List<List<String>> getTableAsListOfLists() {
        List<List<String>> tableAsListOfLists = new ArrayList<>();
        if (Events.isWebElementVisible(reportsTable)) {
            List<WebElement> rows = reportsTable.findElements(new By.ByTagName("tr"));
            //get headers
            List<WebElement> tableHeaders = rows.get(0).findElements(new By.ByTagName("th"));
            List<String> headerValues = new ArrayList<>();
            for (int w = 0; w < tableHeaders.size(); w++) {
                headerValues.add(tableHeaders.get(w).getText());
            }
            tableAsListOfLists.add(headerValues);
            //get table body columns
            for (int q = 1; q < rows.size(); q++) {
                List<WebElement> columns = rows.get(q).findElements(new By.ByTagName("td"));
                List<String> values = new ArrayList<>();
                for (int w = 0; w < columns.size(); w++) {
                    values.add(columns.get(w).getText());
                }
                tableAsListOfLists.add(values);
            }
        }
        return tableAsListOfLists;
    }

    public String getElementColor(String element) {
        WebElement webElement = Events.getElementByBy(new By.ByXPath("//*[text()[contains(.,'" + element + "')]]"));
        return webElement.getCssValue("color");
    }

    public boolean isRowVisible (String element) {
        try{
            WebElement webElement = Events.getElementByBy(new By.ByXPath("//*[text()[contains(.,'" + element + "')]]"));
            return Events.isWebElementVisible(webElement);
        }catch (Exception e) {
            return  false;
        }
    }

    public ReportsPage deleteRow (String element) {
        WebElement webElement = Events.getElementByBy(new By.ByXPath("//*/tbody/tr[td [contains(.,'" + element + "')]]/button"));
        Events.click(webElement);
        return this;
    }
}
package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class _01_Senaryo {
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));

    DialogContent dc=new DialogContent();
    @When("Click on the element in the Dialog")
    public void clickOnTheElementInTheDialog(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            if (listElement.get(i).equals("next")){
                wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-role='opc-continue']")));
            }
            if (listElement.get(i).equals("next2")){
                wait.until(ExpectedConditions.urlContains("payment"));
            }
            dc.findAndClick(listElement.get(i));
        }
    }

    @And("User sending the keys in Dialog content")
    public void userSendingTheKeysInDialogContent(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndSend(listElement.get(i).get(0),listElement.get(i).get(1));
        }
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed(DataTable elements) {
        dc.findAndContainsText("accountVerify","Thank you");
    }

    @Given("Navigate to site")
    public void navigateToSite() {
        GWD.getDriver().get("https://magento.softwaretestingboard.com");
        GWD.getDriver().manage().window().maximize();
    }

    @Then("Success message should be displayed Login")
    public void successMessageShouldBeDisplayedLogin() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='logged-in'])[1]")));
        dc.findAndContainsText("loginVerify","Welcome");
    }

    @And("User selecting Dialog content")
    public void userSelectingDialogContent(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndSelect(listElement.get(i),2 );
        }
    }

    @Then("Success message should be displayed Address")
    public void successMessageShouldBeDisplayedAddress() {
        dc.findAndContainsText("addressVerify","saved");
    }

    @Then("Success message should be displayed Shopping")
    public void successMessageShouldBeDisplayedShopping() {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class='primary']>a")));
        dc.findAndContainsText("shoppingVerify","thank you");
    }
}

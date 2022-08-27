package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DialogContent extends Parent {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//*[text()='Create an Account'])[1]")
    private WebElement createAccountButton;

    @FindBy(id = "firstname")
    private WebElement firstname;

    @FindBy(id = "lastname")
    private WebElement lastname;

    @FindBy(id = "email_address")
    private WebElement email_address;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "password-confirmation")
    private WebElement passwordConfirmation;

    @FindBy(css = "[title='Create an Account']")
    private WebElement createAccountButton2;

    @FindBy(xpath = "(//*[contains,(text(),'Thank you for registering')])")
    private WebElement accountVerify;

    @FindBy(xpath = "(//*[@class='authorization-link']/a)[1]")
    private WebElement signInButton1;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "pass")
    private WebElement logInPassword;

    @FindBy(id = "send2")
    private WebElement signInButton2;

    @FindBy(xpath = "(//span[@class='logged-in'])[1]")
    private WebElement loginVerify;

    @FindBy(xpath = "(//button[@data-action='customer-menu-toggle'])[1]")
    private WebElement myAccount1;

    @FindBy(xpath = "//*[text()='My Account']")
    private WebElement myAccount2;

    @FindBy(xpath = "//*[text()='Manage Addresses']")
    private WebElement manageAddress;

    @FindBy(id = "street_1")
    private WebElement streetAddress;
    @FindBy(id = "city")
    private WebElement city;
    @FindBy(id = "country")
    private WebElement country;

    @FindBy(id = "zip")
    private WebElement zip;

    @FindBy(id = "telephone")
    private WebElement telephone;

    @FindBy(xpath = "//div[@class='primary']//button[@title='Save Address']")
    private WebElement saveAddress;

    @FindBy(xpath = "//*[text()='You saved the address.']")
    private WebElement addressVerify;

    @FindBy(css = "[role='add-address']")
    private WebElement newAddressButton;

    @FindBy(xpath = "(//*[@class='product-item-name']/a)[5]")
    private WebElement imgButton;

    @FindBy(css = "[title='Add to Cart']")
    private WebElement addtoCard;

    @FindBy(xpath = "//*[text()='shopping cart']")
    private WebElement shoppingCart;

    @FindBy(xpath = "(//*[@title='Proceed to Checkout'])[2]")
    private WebElement checkout;
    @FindBy(css = "[data-role='opc-continue']")
    private WebElement next;

    @FindBy(css = "[class='action primary checkout']")
    private WebElement next2;

    @FindBy(css = "[class='base']")
    private WebElement shoppingVerify;

    @FindBy(css = "[class='action action-select-shipping-item']")
    private WebElement shipHere;

    @FindBy(id = "billing-address-same-as-shipping-checkmo")
    private WebElement shipHere2;


    WebElement myElement;

    public void findAndSend(String strElement, String value) {

        switch (strElement) {
            case "firstname":
                myElement = firstname;
                break;
            case "lastname":
                myElement = lastname;
                break;
            case "email_address":
                myElement = email_address;
                break;
            case "password":
                myElement = password;
                break;
            case "passwordConfirmation":
                myElement = passwordConfirmation;
                break;
            case "email":
                myElement = email;
                break;
            case "logInPassword":
                myElement = logInPassword;
                break;
            case "streetAddress":
                myElement = streetAddress;
                break;
            case "city":
                myElement = city;
                break;
            case "telephone":
                myElement = telephone;
                break;
            case "zip":
                myElement = zip;
                break;
        }
        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {
        switch (strElement) {
            case "createAccountButton":
                myElement = createAccountButton;
                break;
            case "createAccountButton2":
                myElement = createAccountButton2;
                break;
            case "signInButton1":
                myElement = signInButton1;
                break;
            case "signInButton2":
                myElement = signInButton2;
                break;
            case "myAccount1":
                myElement = myAccount1;
                break;
            case "myAccount2":
                myElement = myAccount2;
                break;
            case "manageAddress":
                myElement = manageAddress;
                break;
            case "saveAddress":
                myElement = saveAddress;
                break;
            case "newAddressButton":
                myElement = newAddressButton;
                break;
            case "imgButton":
                myElement = imgButton;
                break;
            case "addtoCard":
                myElement = addtoCard;
                break;
            case "shoppingCart":
                myElement = shoppingCart;
                break;
            case "checkout":
                myElement = checkout;
                break;
            case "next":
                myElement = next;
                break;
            case "next2":
                myElement = next2;
                break;
            case "shipHere":
                myElement = shipHere;
                break;
            case "shipHere2":
                myElement = shipHere2;
                break;
        }
        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text) {
        switch (strElement) {
            case "accountVerify":
                myElement = accountVerify;
                break;
            case "loginVerify":
                myElement = loginVerify;
                break;
            case "addressVerify":
                myElement = addressVerify;
                break;
            case "shoppingVerify":
                myElement = shoppingVerify;
                break;

        }
        verifyContainsText(myElement, text);
    }

    public void findAndSelect(String strElement, int value) {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        switch (strElement) {
            case "country":
                myElement = country;
                break;
        }
        Select selecT = new Select(myElement);
        wait.until(ExpectedConditions.elementToBeClickable(myElement));
        selecT.selectByIndex(value);
    }

}

package Intellij;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // this is modified from master branch
    // WebElements
    @FindBy(id = "usernameFromaster branch")
    WebElement usernameInput;

    @FindBy(id = "password  Fromaster branch")
    WebElement passwordInput;

    @FindBy(id = "loginBtn")
    WebElement loginButton;

    // Actions
    public void enterUsername(String username) {
        usernameInput.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void clickLogin() {
        loginButton.click();
    }

    //added in master branch
    public void clickLoginMasterBranchAdded() {
        loginButton.click();
    }

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }
}

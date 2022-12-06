package com.herokuaoo.internet.pages;

import com.herokuaoo.internet.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    // Enter “tomsmith” username
    By userNameField = By.xpath("//input[@id='username']");

    public void enterUsernameField(String userName) {
        sendTextToElement(userNameField, userName);
    }

    //Enter “SuperSecretPassword!” password
    By passwordField = By.id("password");

    public void enterPasswordField(String password) {
        sendTextToElement(passwordField, password);
    }

    //Click on ‘LOGIN’ button
    By loginButton = By.xpath("//i[contains(text(),'Login')]");

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    //Verify the text “Secure Area”
    By textSecureArea = By.xpath("//h2[normalize-space()='Secure Area']");

    public String getTextSecureArea() {
        return getTextFromElement(textSecureArea);
    }

    By textUserNameInvalid = By.xpath("//div[@id='flash']");

    public String getTextUserNameInvalid() {
        return getTextFromElement(textUserNameInvalid);
    }
    By textPasswordInvalid = By.xpath("//div[@class = 'flash error']");

    public String getTextPasswordInvalid() {
        return getTextFromElement(textPasswordInvalid);
    }

}

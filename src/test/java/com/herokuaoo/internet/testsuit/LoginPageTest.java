package com.herokuaoo.internet.testsuit;

import com.google.common.base.Verify;
import com.herokuaoo.internet.pages.LoginPage;
import com.herokuaoo.internet.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage = new LoginPage();

    @Test
    public void UserShouldLoginSuccessfullyWithValidCredentials() {
        //Enter “tomsmith” username
        loginPage.enterUsernameField("tomsmith");
        //Enter “SuperSecretPassword!” password
        loginPage.enterPasswordField("SuperSecretPassword!");
        //Click on ‘LOGIN’ button
        loginPage.clickOnLoginButton();
        //Verify the text “Secure Area”
        String expectedMessage = "Secure Area";
        Assert.assertEquals(loginPage.getTextSecureArea(), expectedMessage, "Message is not displayed");

    }

    @Test
    public void verifyTheUsernameErrorMessage() {
        //* Enter “tomsmith1” username
        loginPage.enterUsernameField("tomsmith1");
        // Enter “SuperSecretPassword!” password
        loginPage.enterPasswordField("SuperSecretPassword!");
        //Click on ‘LOGIN’ button
        loginPage.clickOnLoginButton();
        //Verify the error message “Your username is invalid!”
        String expectedMessage = "Your username is invalid!\n" +
                "×";
        Assert.assertEquals(loginPage.getTextUserNameInvalid(), expectedMessage, "Message is not displayed");

    }
    @Test
    public void verifyThePasswordErrorMessage(){
        //* Enter “tomsmith” username
        loginPage.enterUsernameField("tomsmith");
        // * Enter “SuperSecretPassword” password
        loginPage.enterPasswordField("SuperSectomsmithretPassword");
        // * Click on ‘LOGIN’ button
        loginPage.clickOnLoginButton();
        // * Verify the error message “Your password is invalid!
        String expectedErrorMessage1 = "Your password is invalid!\n" +
                "×";
        Assert.assertEquals(loginPage.getTextPasswordInvalid(), expectedErrorMessage1, "Error message not displayed");


    }
}

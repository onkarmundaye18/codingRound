package testCases;

import framework.SeleniumUtils;
import framework.TestFixtures;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.SignInPage;

public class SignInTest extends TestFixtures {

    private SignInPage signInPage;

    @Test
    public void validateErrorMsgForInvalidSignInDetails(){
        signInPage = new SignInPage();
        launchBrowser("https://www.cleartrip.com/");
        SeleniumUtils.waitFor(2000);
        signInPage.doSignIn();
        String errorMsg = signInPage.getErrorText();
        Assert.assertTrue(errorMsg.contains("There were errors in your submission"));
    }
}

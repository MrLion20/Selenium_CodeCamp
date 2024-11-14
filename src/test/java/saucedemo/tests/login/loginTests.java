package saucedemo.tests.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import saucedemo.base.BaseTest;

public class loginTests extends BaseTest {

    private static final Logger log = LoggerFactory.getLogger(loginTests.class);

    @Test
    public void testLoginErrorMessage(){

        loginPage.setUserName("standard_user");
        loginPage.setPassword("ywjehu234");
        loginPage.clicLoginButton();

        String actualMessage = loginPage.getErrorMessage();
        Assert.assertTrue(actualMessage.contains("Epic sadface"));
    }
}

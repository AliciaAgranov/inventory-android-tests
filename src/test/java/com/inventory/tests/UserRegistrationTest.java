package com.inventory.tests;

import org.testng.annotations.Test;

public class UserRegistrationTest extends TestBase {

    @Test
        public void newUserRegistration() throws InterruptedException {
           app.clickOnRegisterButton();
           app.clickOnDontHaveASettinsCode();
           app.typeCompanyID("0lenainvd");
           app.typeCompanyName("voxme");
           app.typeCompanyWebsite("www.voxme.com");
           app.typeCompanyTel("01432272274");
           app.typeRegistrationUserName("alisa");
           app.typeInventoryReturnEmail("support@voxme.com");
           app.hideKeyboard();
           app.clickOnTheLanguageDropdown();
           app.selectLanguage();
           app.selectUnits();
           app.swipeScreenDown();
           app.clickOnTheActivateServiceButton();
           app.clickOnTheOKButtonOnThePopUp();
           app.clickOnCheckregistrationButton();
           app.clickOnTheOKButtonOnThePopUp();
           app.clickOnTheDeviceReturnButton();
           app.clickGrantAccessLocationOKbutton();
           app.ChoosePermitionLocation();

    }
}

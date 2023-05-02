package com.inventory.tests;

import org.testng.annotations.Test;

public class UserRegistrationTest extends TestBase {

   public String companyId = "0lenainvd";
   public String companyName = "voxme";
   public String companyWebsite = "www.voxme.com";
   public String companyTel = "01432272274";
   public String userName = "alisa";
   public String companyEmail = "support@voxme.com";

    @Test
        public void newUserRegistration() throws InterruptedException {
           app.clickOnRegisterButton();
           app.clickOnDontHaveASettinsCode();
           app.typeCompanyID(companyId);
           app.typeCompanyName(companyName);
           app.typeCompanyWebsite(companyWebsite);
           app.typeCompanyTel(companyTel);
           app.typeRegistrationUserName(userName);
           app.typeInventoryReturnEmail(companyEmail);
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

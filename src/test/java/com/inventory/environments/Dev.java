package com.inventory.environments;


import com.inventory.tests.TestBase;
import org.testng.annotations.Test;

public class Dev extends TestBase {

    @Test
        public void downloadProdConfiguration() throws InterruptedException {
        app.clickOnSettingsStupPic();
        app.clickOnSettingsPopup();
        app.clickOnConfigurations();
        app.downloadSettings();
        app.clickOnTheOKButtonOnThePopUp();
        app.clickOnTheDeviceReturnButton();
        app.clickOnTheVoxmeCloud();
        Thread.sleep(500);
        app.clickOnTheDeviceReturnButton();
        app.clickOnConfigurations();
        app.downloadConfigurations();
        app.closeTheWarningPopup();
        app.clickOnTheOKButtonOnThePopUp();
        app.clickOnTheDeviceReturnButton();


       // app.clickOnTheVoxmeCloud();
      //  app.clickOnTheServerURL();
       // app.selectProtocol();
      //  app.typeDevURL();
      //  app.typeApplication();
      //  app.clickOnTheDeviceReturnButton();
        // app.typeUserName("testuser3");
        //app.typePassword("testuser3");
        //app.clickOnTheDeviceReturnButton();
        //app.clickOnConfigurations();



       // app.clickToTheReturnUpButton();
       // app.clickOnTheDeviceReturnButton();
    }
}

package com.inventory.tests;

import org.testng.annotations.Test;

public class SignAndSendTest extends TestBase {

    @Test
    public void signAndSendInventoryToMFC() throws InterruptedException {
        app.selectClientFromTheDiscovery();
        app.clickOnTheReportInventoryButton();
        app.swipeScreenDown();
        app.clickOnTheClientShipperButton();
        app.createSingnature2();
        app.clickToTheReturnUpButton();
        app.clickOnTheForemanDriverButton();
        app.createSingnature2();
        app.clickToTheReturnUpButton();
        app.swipeScreenUp();
        app.clickOnSummaryButton();
        app.swipeScreenDown();
        app.clickToTheReturnUpButton();
        //app.clickOnTheUploadButton();
        //app.clickOnTheOKButtonOnThePopUp();
    }
}

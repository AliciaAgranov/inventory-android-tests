package com.inventory.tests;

import org.testng.annotations.Test;

public class DownloadInventoryTest extends TestBase {

    @Test
    public void downloadInventoryFromMFC() throws InterruptedException {
      app.clickOnDownloadButton();
      app.clickOnTheSearchInventory("10936-1-1");
      app.selectFoundedInventory();
      app.downloadFoundedInventory();
      app.clickOnTheEditInventoryButton();
      app.selectAnItemFromInventory();
      app.showParametersOfTheItem();
      app.isPhtotDownload();
      Thread.sleep(5000);
      app.clickOnTheMenuButton();
      app.hideKeyboard();
      app.clickToTheGeneralInfo();
      app.swipeScreenDown();
      app.swipeScreenDown();
      app.swipeScreenToTheLeft();
      app.swipeScreenDown();
      app.swipeScreenDown();
      app.swipeScreenToTheLeft();
      app.swipeScreenDown();
      app.swipeScreenDown();
      app.clickOnTheMenuButton();
      app.clickOnTheInventoryList();
      app.swipeScreenToTheLeft();
      app.selectRoomWithItem();
      app.clickToTheInspectionInfoButton();
      app.showAttachedPhoto();
      app.downloadAttachedPhoto();
      app.clickOnPropertyConditionsFieldAfterPacking();
      app.showAttachedPhoto();
      app.downloadAttachedPhoto();
      app.clickToTheReturnUpButton();
      app.clickToTheReturnUpButton();
      app.clickOnTheMenuButton();
      app.swipeScreenDownMenu();
      app.clickOnTheSummaries();
      app.clickOnThePackers();
      app.clickOnAddPackerButton();
      app.selectPackerFromGrid();
      app.assignForeman();
      app.clickToTheReturnUpButton();
      app.clickOnTheMenuButton();
      app.clickOnTheCartonsSummary();
      app.clickToTheReturnUpButton();
      app.clickOnTheMenuButton();
      app.clickOnTheAppliances();
      app.clickToTheReturnUpButton();
      app.clickOnTheMenuButton();
      app.clickOnTheAdditionalServicesButton();
      app.clickOnTheAdditionalMaterials();
      app.clickToTheReturnUpButton();
      app.clickOnTheMenuButton();
      app.clickOnTheServices();
      app.clickToTheReturnUpButton();
      app.clickOnTheMenuButton();
      app.clickOnTheAdditionalInfo();
      app.clickToTheReturnUpButton();
      app.clickOnTheMenuButton();
      app.swipeScreenDownMenu();
      app.clickOnTheDocuments();
      app.clickToTheReturnUpButton();
      app.clickOnTheMenuButton();
      app.clickOnTheBackToJobListButton();

    }
}

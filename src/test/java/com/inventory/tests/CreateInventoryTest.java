package com.inventory.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;

public class CreateInventoryTest extends TestBase {

    @Test
    public void createNewInventory() throws InterruptedException, IOException {
        //app.addDictionaryFile();
        //app.addConfigurationFile();
        app.clickOnTheCreateNewInventoryButton();
        //app.selectAnAction();
        app.type(By.id("inventory_name"),"Connor");
        app.type(By.id("inventory_id"), "2189-1-1");
        app.hideKeyboard();
        app.clickOnTheCreateButton();
        app.clickOnTheEditInventoryButton();
        app.clickOnTheAddPieceButton();
        app.selectLocationForTheNewPiece();
        app.selectPackageForNewPiece();
        app.selectPBOForNewPiece();
        app.swipeScreenDown();
        app.addItemIntoNewwPiece();
        app.showParametersOfTheItem();
        app.changeTypeOfNewItem();
        app.addConditionToTheNewItem();
        app.hideKeyboard();
        app.addCommentToTheNewItem();
        app.hideKeyboard();
        app.addCondition();
        app.addLocation();
        app.hideKeyboard();
        //app.attachPhotoFromGallery();
        app.attachPhotoFromCamera();
        app.clickOnTheDeviceReturnButton();
        app.clickToTheReturnUpButton();
        //app.clickToTheReturnUpButton();
        app.swipeScreenToTheLeft();
        app.selectRoomWithItem();
        app.clickToTheInspectionInfoButton();
        app.fillDescriptionField();
        app.hideKeyboard();
        app.fillConditionField();
        app.hideKeyboard();
        //app.attachPhotoFromGallery();
        app.attachPhotoConditions();
        //app.clickOnTheDeviceReturnButton();
        app.selectPropertyBeforePacking();
        app.clickOnTheSelectConditionButtonOfPropertyBeforePacking();
        app.clickOnPropertyConditionsFieldAfterPacking();
        //app.attachPhotoFromGallery();
        app.attachPhotoConditions();
        //app.clickOnTheDeviceReturnButton();
        app.selectPropertyAfterPacking();
        app.clickOnTheSelectConditionButtonOfPropertyAfterPacking();
        app.clickToTheReturnUpButton();
        app.clickToTheReturnUpButton();
        app.swipeScreenToTheLeft();
        app.clickToAddSkidButton();
        app.swipeScreenDown();
        app.clickToTheSkidContentButton();
        app.clickToTheLoadSkidButton();
        app.clickToTheReturnUpButton();
        //app.attachPhotoFromGallery();
        app.attachPhotoToTheNewSkid();
        //app.clickOnTheDeviceReturnButton();
        app.clickToTheSkidOKButton();
        app.clickOnTheMenuButton();
        app.clickOnTheSummaries();
        app.clickOnThePackers();
        app.clickToTheReturnUpButton();
        app.clickOnTheMenuButton();
        app.clickOnTheCartonsSummary();
        app.clickToTheReturnUpButton();
        app.clickOnTheMenuButton();
        app.clickOnTheAppliances();
        app.clickToTheReturnUpButton();
        app.clickOnTheMenuButton();
        app.swipeScreenDownMenu();
        app.clickOnTheAdditionalServicesButton();
        app.clickOnTheAdditionalMaterials();
        app.clickToTheReturnUpButton();
        app.clickOnTheMenuButton();
        app.clickOnTheServices();
        app.openServiceList();
        //app.addServiceText();
        //app.clickOnTheOKButton();
        app.addValueFromList();
        app.attachPhotoFromCameraToService();
        app.attachSignature();
        app.clickToTheReturnUpButton();
        app.clickToTheReturnUpButton();
        app.clickOnTheMenuButton();
        app.clickOnTheAdditionalInfo();
        app.openFirstPropertiesList();
        app.addValueFromList();
        app.attachSignature();
        app.clickToTheReturnUpButton();
        app.addQuestionText();
        app.clickOnTheOKButton();
        app.openSecondPropertiesList();
        app.attachPhotoFromCameraToService();
        app.clickToTheReturnUpButton();
        app.clickOnTheMenuButton();
        app.clickOnTheDocuments();
        //app.clickOnTheAddDocumentButton();
        //app.fillDocumentNameField();
        //app.hideKeyboard();
        //app.attachPhotoToTheDocumentSectionFromGallery();
        app.clickOnTheAddDocumentButton();
        app.fillDocumentNameField();
        app.hideKeyboard();
        app.attachPhotoToTheDocumentSection();
        app.clickOnTheDeviceReturnButton();
        app.clickToTheReturnUpButton();
        app.clickToTheReturnUpButton();
        app.clickOnTheMenuButton();
        app.swipeScreenDownMenu();
        app.clickToTheSignAndSendButton();
        app.swipeScreenDown();
        app.clickOnTheClientShipperButton();
        app.createSignature();
        app.clickToTheReturnUpButton();
        app.clickOnTheForemanDriverButton();
        app.createSignature();
        app.clickToTheReturnUpButton();
        app.swipeScreenUp();
        app.clickOnTheUploadButton();
        app.clickOnTheOKButtonOnThePopUp();
        app.screenshot();
        app.clickToTheReturnUpButton();
    }
}

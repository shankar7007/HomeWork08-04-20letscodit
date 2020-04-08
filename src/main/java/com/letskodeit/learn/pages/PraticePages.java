package com.letskodeit.learn.pages;

import com.letskodeit.learn.utility.Utility;
import org.openqa.selenium.By;

public class PraticePages extends Utility {

    By praticeText = By.xpath("//h1[contains(text(),'Practice Page')]");
    By bmwRadioBtn = By.xpath("//input[@id='bmwradio']");
    By hondaSelectBtn = By.xpath("//select[@id='carselect']");

    public void varifyPraticeTextLetter(){
        verifyTextAssertMethod(praticeText,"Practice Page");
    }
    public void cliclOnBmwRadioBtn(){
        clickOnElement(bmwRadioBtn);
    }

    public void selectHondaBtn() {
        selectByValueFromDropDown(hondaSelectBtn,"honda");
    }
}

package com.letskodeit.learn.pages;

import com.letskodeit.learn.utility.Utility;
import org.openqa.selenium.By;

public class HomePages extends Utility {
    By ptaticeBtn = By.xpath("//a[@class='fedora-navbar-link navbar-link']");
    By loginBtn = By.xpath("//a[@class='navbar-link fedora-navbar-link']");
    By signinBtn = By.xpath("//a[@id='header-sign-up-btn']");
    By bmwRadioBtn = By.xpath("//input[@id='bmwradio']");
    By hondaSelectDropDownBtn = By.xpath("//select[@id='carselect']");

    public void clickOnPraticBtn(){
        clickOnElement(ptaticeBtn);
    }
    public void clickOnLonginBtn(){
        clickOnElement(loginBtn);
    }
    public void clickOnSignUpBtn(){
        clickOnElement(signinBtn);
    }
    public void clickOnBmwRadioBtn(){
        clickOnElement(bmwRadioBtn);
    }
    public void selectOnhondaBtn(){
        selectByValueFromDropDown(hondaSelectDropDownBtn,"honda");
    }
}

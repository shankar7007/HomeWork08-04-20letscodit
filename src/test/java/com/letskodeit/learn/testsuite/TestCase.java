package com.letskodeit.learn.testsuite;

import com.letskodeit.learn.pages.HomePages;
import com.letskodeit.learn.testbase.TestBase;
import org.testng.annotations.Test;

public class TestCase extends TestBase {

    HomePages homePages = new HomePages();

    @Test

    public  void userShouldClickOnPracticeBtn(){
        homePages.clickOnPraticBtn();
    }

    @Test

    public void userShouldClickOnLoginBtn(){
        homePages.clickOnLonginBtn();
    }

    @Test

    public void userShouldClickOnSignUpBtn(){

        homePages.clickOnSignUpBtn();
    }
    @Test

    public void userShouldClickOnBmwBtn(){
        homePages.clickOnBmwRadioBtn();
    }
    public void userShouldSelectBenzBtn(){
        homePages.selectOnhondaBtn();
    }
}

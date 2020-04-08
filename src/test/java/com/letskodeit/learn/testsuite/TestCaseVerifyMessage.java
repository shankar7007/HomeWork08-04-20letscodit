package com.letskodeit.learn.testsuite;

import com.letskodeit.learn.pages.HomePages;
import com.letskodeit.learn.pages.PraticePages;
import com.letskodeit.learn.testbase.TestBase;
import org.testng.annotations.Test;

public class TestCaseVerifyMessage extends TestBase {
    HomePages homePages = new HomePages();

    PraticePages praticePages = new PraticePages();

    @Test
    public void clikkOnpracticTab() {
        homePages.clickOnPraticBtn();
        praticePages.varifyPraticeTextLetter();
        praticePages.cliclOnBmwRadioBtn();
        praticePages.selectHondaBtn();

    }
}









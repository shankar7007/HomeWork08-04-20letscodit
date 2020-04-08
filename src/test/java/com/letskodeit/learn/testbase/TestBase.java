package com.letskodeit.learn.testbase;

import com.letskodeit.learn.browselector.Browselector;
import com.letskodeit.learn.pages.HomePages;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase extends HomePages {

    Browselector browselector = new Browselector();
    String baseUrl = "https://learn.letskodeit.com/";

    @BeforeMethod

    public  void openbrowser(){
        browselector.selectBrowser("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }
    @AfterMethod

    public void closeBrowser(){
    driver.quit();
    }
}

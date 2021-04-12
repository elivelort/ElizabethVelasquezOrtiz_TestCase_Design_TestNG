package com.globant;

import org.testng.annotations.*;

public class TestNGAnnotations {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Initiate driver and open browser");
    }

    @BeforeClass
    public void beforeTest(){
        System.out.println("Account must be created");
    }

    @BeforeMethod
    public void  beforeMethod(){
        System.out.println("Perform action");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("Navigate ESPN home page");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("Exit browser");
    }

}

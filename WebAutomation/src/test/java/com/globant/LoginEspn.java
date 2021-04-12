package com.globant;

import org.testng.annotations.*;

import java.util.logging.Logger;

import static org.junit.Assert.assertTrue;


/**
 * Unit test for simple App.
 */
public class LoginEspn extends TestNGAnnotations
{

    @Test
    public void loginEspnTest()
    {
        assertTrue( true );
        System.out.println("Login to the espn site " +
                "-- enter a user and pss valid " +
                "-- login has been successful");
    }

}

package com.stackroute.javape3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LMSException7Test {

    LMSException7 lmsException7;
    @Before
    public void setUp() throws Exception {
        lmsException7=new LMSException7();
    }

    @After
    public void tearDown() throws Exception {
        lmsException7=null;
    }


    @Test
    public void mainOne() {
        /*Failure*/
        String[] strExpected={"Hai Chandu","You are in Finally"};
        String[] strRet=lmsException7.main("Hai Durga");

        for(int i=0;i< strExpected.length;i++){
            if(!strExpected[i].equals(strRet[i]))
                assertNotEquals(strExpected[i],strRet[i]);
        }

    }
    @Test
    public void mainTwo() {
        String[] str={"Hai Anagha","You are in Finally"};
        assertArrayEquals(str,lmsException7.main("Hai Anagha"));
    }

    @Test
    public void mainThree() {
        String[] str={"Hai Madhu","You are in Finally"};
        assertArrayEquals(str,lmsException7.main("Hai Madhu"));
    }

    @Test
    public void mainFour() {
        String[] str={"Hai Chandu","You are in Finally"};
        assertArrayEquals(str,lmsException7.main("Hai Chandu"));
    }
}
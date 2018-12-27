package com.stackroute.javape3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LMSException6Test {


    private static LMSException6 lmsException6;
    @Before
    public void setUp() throws Exception {

         lmsException6=new LMSException6();
    }

    @After
    public void tearDown() throws Exception {

        lmsException6=null;
    }

    @Test
    public void consecutiveNumSeriesTest1() {
        String[] strExpected={"98","97","96","95","94"};
        String[] strActual={"98","97","96","95","94"};
        assertArrayEquals(strExpected,lmsException6.seriesCheck(strActual));

    }

    @Test
    public void consecutiveNumSeriesTest2() {

        String[] strExpected={"54","53","52","51","50","49","48"};
        assertArrayEquals(strExpected,lmsException6.seriesCheck(new String[]{"54","53","52","51","50","49","48"}));
    }


    @Test
    public void consecutiveNumSeriesTest3() {
        /*Failure*/
        String[] strExpected={"98","97","95","94","93"};
        String[] strActual={"98","96","95","94","93"};
        String[] strRet=lmsException6.seriesCheck(strActual);

        for(int i=0;i< strExpected.length;i++){
            if(strExpected[i]!=strActual[i])
            assertNotEquals(strExpected[i],strRet[i]);
        }

    }

    @Test
    public void consecutiveNumSeriesTest4() {
        String[] strExpected={"1","2","3","4","5"};
        String[] strActual={"1","2","3","4","5"};
        assertArrayEquals(strExpected,lmsException6.seriesCheck(strActual));
    }

    @Test
    public void consecutiveNumSeriesTest5() {
        String[] strExpected={"3","4","5","6","7"};
        String[] strActual={"3","4","5","5","5"};
        String[] strRet=lmsException6.seriesCheck(strActual);

        for(int i=0;i< strExpected.length;i++){
            if(strExpected[i]!=strActual[i])
                assertNotEquals(strExpected[i],strRet[i]);
        }

    }
}
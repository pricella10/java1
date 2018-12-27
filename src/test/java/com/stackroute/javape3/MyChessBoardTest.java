package com.stackroute.javape3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyChessBoardTest {
    MyChessBoard cb;
    @Before
    public void setUp() throws Exception {
        cb=new MyChessBoard();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void chesspattern() {
        String[][] strg=null;
        String[][] str= new String[][]{{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"}};
        assertArrayEquals(str,cb.chesspattern(new String[8][8]));
        assertNull(cb.chesspattern(strg));
    }
    @Test
    public void chesspatternFailure(){
        String[][] str1=new String[][]{{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"}};
        assertNotSame(str1,cb.chesspattern(new String[8][8]));
        assertNotNull(cb.chesspattern(new String[8][8]));


    }
}
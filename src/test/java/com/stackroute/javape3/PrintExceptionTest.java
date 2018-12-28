package com.stackroute.javape3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrintExceptionTest {
    PrintException pe;
    @Before
    public void setUp() throws Exception {
        pe=new PrintException();
    }

    @After
    public void tearDown() throws Exception {
    }


    //NegativeArraySizeException
    @Test
    public void negativeArraySizeTest(){
        String expected = "class java.lang.NegativeArraySizeException";
        String actual = pe.negativeArraySize();
        assertEquals(expected,actual);


    }

    //IndexOutOfBoundsException


    @Test
    public void indexOutOfBound(){
        String expected = "class java.lang.ArrayIndexOutOfBound";
        String actual = pe.indexOutOfBound();
        assertEquals(expected,actual);


    }

    //NullPointerException
    @Test
    public void nullPointer(){
        String expected = "class java.lang.NullPointerException";
        String actual = pe.nullPointer();
        assertEquals(expected,actual);


    }}
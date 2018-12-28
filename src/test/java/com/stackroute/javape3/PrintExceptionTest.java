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
        assertEquals(expected,pe.negativeArraySize());


    }

    //IndexOutOfBoundsException


    @Test
    public void indexOutOfBound(){
        String expected = "class java.lang.ArrayIndexOutOfBound";
        assertEquals(expected,pe.indexOutOfBound());


    }

    //NullPointerException
    @Test
    public void nullPointer(){
        String expected = "class java.lang.NullPointerException";
        assertEquals(expected,pe.nullPointer(););


    }}
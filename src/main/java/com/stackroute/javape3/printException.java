package com.stackroute.javape3;

public class printException {
    public String printExcep()
    {
        try
        {
            int a = 20/0;
        } catch (Exception e)
        {
            // printStackTrace method
            // prints line numbers + call stack
           String s= e.toString();
            // Prints what exception has been thrown
           // System.out.println(e);
        }
        return s;

    }

}

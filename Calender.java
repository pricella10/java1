package com.stackroute.javape3;
import java.util.*;

import java.text.*;

public class Calender {
    public String dayOfWeek(String s1)
    {

        Calendar c = Calendar.getInstance();

        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        System.out.println();
         s1 = "First day of the week : ";
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        s1 += (df.format(c.getTime()));
        s1 += " Last day of the week : ";
        for (int i = 0; i < 6; i++) {
            c.add(Calendar.DATE, 1);
        }
        System.out.println();
        s1 += (df.format(c.getTime()));

        return s1;
    }
}
package com.stackroute.javape3;

public class Add {
    public static void main(String[] arg){

            try{
                int b =39/0;
                int a[] = new int[5];
                a[5] = 4;

            }catch(ArithmeticException | ArrayIndexOutOfBoundsException e){System.out.println(e);}


    }
}

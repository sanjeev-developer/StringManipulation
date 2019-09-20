package com.lambton;

public class StringHandling {

    public static void main(String args[]) {
        String s1 ="hello";
        String s2 ="hello";
        String s3 = null;
        String s4 = new String("hello");


        if(s1.equals(s2))
        {
            System.out.println("s1 is equal to s2");
        }
        else
        {
            System.out.println("s1 is unequal to s2");
        }

        if(s1.equals(s4))
        {
            System.out.println("s1 is equal to s4");
        }
        else
        {
            System.out.println("s1 is unequal to s4");
        }

        s1.toUpperCase();
        System.out.println("new"+s1.toUpperCase());
        System.out.println("new"+s1);

        s1.toLowerCase();
        System.out.println("new"+s1.toLowerCase());
        System.out.println("new"+s1);

    }
}

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

        String name="sanjeev";
        char ch=name.charAt(4);//returns the char value at the 4th index
        System.out.println(ch);


        //compare to
        System.out.println(s1.compareTo(s2));//0 because both are equal
        System.out.println(s1.compareTo(s3));//-5 because "h" is 5 times lower than "m"
        System.out.println(s1.compareTo(s4));//-1 because "l" is 1 times lower than "m"

        //concat function
        s1.concat("is immutable");
        System.out.println(s1);
        s1=s1.concat(" is immutable so assign it explicitly");
        System.out.println(s1);

        //contain
        String namee="what do you know about me";
        System.out.println(namee.contains("do you know"));
        System.out.println(namee.contains("about"));
        System.out.println(namee.contains("hello"));


        //end with
        String str = "Welcome to helloworld";
        System.out.println(str.endsWith("point"));
        if(str.endsWith("helloworld")) {
            System.out.println("String ends with helloworld");
        }else System.out.println("It does not end with helloworld");


        //ignorecase
        System.out.println(s1.equalsIgnoreCase(s2));//true because content and case both are same
        System.out.println(s1.equalsIgnoreCase(s3));//true because case is ignored
        System.out.println(s1.equalsIgnoreCase(s4));//false because content is not same

        //replace
        String replacefun="sanjeev is a very good boy";
        String replaceString=replacefun.replace('a','e');//replaces all occurrences of 'a' to 'e'
        System.out.println(replaceString);

        //sunstring function
        String subfun="sanjeev";
        System.out.println(subfun.substring(2,4));//returns va
        System.out.println(subfun.substring(2));//returns vatpoint

        //index of
        int index1=subfun.indexOf("sa");//returns the index of is substring
        int index2=subfun.indexOf("ev");//returns the index of index substring
        System.out.println(index1+"  "+index2);//2 8
    }

}


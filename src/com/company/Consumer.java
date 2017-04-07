package com.company;

/*
 * ${Classname}
 * 
 * Version 1.0 
 * 
 * 07.04.2017
 * 
 * Karpikova
 */
public class Consumer {
    private static volatile int first    = 0;
    private static volatile int second   = 0;
    private static volatile int third    = 0;

    public static boolean GetSum(int a, int b, int c, Flags flags){
        if (a != 0 && first!= 0 ) {
            return false;
        }
        if (b != 0 && second!= 0 ) {
            return false;
        }
        if (c != 0 && third!= 0 ) {
            return false;
        }
        synchronized (flags) {
            if (a != 0) {
                first = a;
            }
            if (b != 0) {
                second = b;
            }
            if (c != 0) {
                third = c;
            }

            if (first>0 && second>0 && third>0)
            {
                System.out.println(first+second+third);
                first   = 0;
                second  = 0;
                third   = 0;
            }
        }
        return true;
    }
}

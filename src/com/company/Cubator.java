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
public class Cubator implements Runnable {
    private int var;
    private Flags flags;

    public Cubator(int var, Flags flags) {
        this.var = var;
        this.flags = flags;
    }

    @Override
    public void run() {
        boolean res = false;
        while (!res) {
            res = Consumer.GetSum(var * var * var, 0, 0, flags);
        }
    }
}

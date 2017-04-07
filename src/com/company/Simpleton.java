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
public class Simpleton implements Runnable {
    private int var;
    private Flags flags;

    public Simpleton(int var, Flags flags) {
        this.var = var;
        this.flags = flags;
    }

    @Override
    public void run() {
        boolean res = false;
        while (!res) {
            res = Consumer.GetSum(0, 0, var, flags);
        }
    }
}

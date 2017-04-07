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
public class Quadro implements Runnable {
    private int var;
    private Flags flags;

    public Quadro(int var, Flags flags) {
        this.var = var;
        this.flags = flags;
    }

    @Override
    public void run() {
        boolean res = false;
        while (!res) {
            res = Consumer.GetSum(0, var * var, 0, flags);
        }
    }
}
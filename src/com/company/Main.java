package com.company;

public class Main {

    public static void main(String[] args) {
        Flags flags1 = new Flags();
        Flags flags2 = new Flags();
        Flags flags3 = new Flags();

        int[] a = {1,2,3};
        int[] b = {4,5,6};
        int[] c = {7,8,9};
        for (int a_el:
             a) {
            Cubator cubator= new Cubator(a_el, flags1);
            Thread cubatorThread = new Thread(cubator);
            cubatorThread.start();
        }
        for (int b_el:
                b) {
            Quadro quadro= new Quadro(b_el, flags2);
            Thread quadroThread = new Thread(quadro);
            quadroThread.start();
        }
        for (int c_el:
                c) {
            Simpleton simpleton= new Simpleton(c_el, flags3);
            Thread simpletonThread = new Thread(simpleton);
            simpletonThread.start();
        }
    }
}

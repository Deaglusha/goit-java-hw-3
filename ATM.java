package com.java;

public class ATM {
    public int countBanknotes(int sum) {
        int a500 = 0, a200 = 0, a100 = 0, a50 = 0, a20 = 0, a10 = 0, a5 = 0, a2 = 0, a1 = 0;
        int bill = sum;

        if (bill >= 500) {
            a500 += bill / 500;
            bill -= (a500 * 500);
        }
        if (bill >= 200) {
            a200 += bill / 200;
            bill -= (a200 * 200);
        }
        if (bill >= a100) {
            a100 += bill / 100;
            bill -= (a100 * 100);
        }
        if (bill >= a50) {
            a50 += bill / 50;
            bill -= (a50 * 50);
        }
        if (bill >= a20) {
            a20 += bill / 20;
            bill -= (a20 * 20);
        }
        if (bill >= a10) {
            a10 += bill / 10;
            bill -= (a10 * 10);
        }
        if (bill >= a5) {
            a5 += bill / 5;
            bill -= (a5 * 5);
        }
        if (bill >= a2) {
            a2 += bill / 2;
            bill -= (a2 * 2);
        }
        if (bill >= a1) {
            a1 += bill;
            bill -= a1;
        }
        return a500 + a200 + a100 + a50 + a20 + a10 + a5 + a2 + a1;
    }

    public static void main(String[] args) {
        ATM atm = new ATM();

        System.out.println("countBanknotes(500) = " + atm.countBanknotes(500));
        System.out.println("countBanknotes(578) = " + atm.countBanknotes(578));
    }
}

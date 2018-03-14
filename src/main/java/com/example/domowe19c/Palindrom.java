package com.example.domowe19c;

public class Palindrom implements Comparable<Palindrom> {
    private int palindromNo;
    private int num1;
    private int num2;

    public Palindrom(int palindromNo, int num1, int num2) {
        this.palindromNo = palindromNo;
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getPalindromNo() {
        return palindromNo;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    @Override
    public int compareTo(Palindrom p) {
        if (this.palindromNo > p.palindromNo)
            return 1;
        if (this.palindromNo > p.palindromNo)
            return 0;
        else
            return -1;
    }

    @Override
    public String toString() {
        return "Palindrom{" +
                "palindromNo=" + palindromNo +
                ", num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }
}
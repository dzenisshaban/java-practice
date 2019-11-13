package com.rakovets.course.challenge;

public class Task2 {
    public static void main(String[] args) {
        try {
            int[] num = new int[3];
            num[4] = 5;
            System.out.println(num[4]);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        System.out.println("Program Task2 is ending");
    }
}

package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException{

        for (int count = 10; count>0; count--) {
            System.out.println(count);
            Thread.sleep(1000);
        }
        System.out.println("LAUNCH!");
    }
}
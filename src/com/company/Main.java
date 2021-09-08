package com.company;

public class Main {

    public static void printAmerican(String day, int date, String month, int year) {
        System.out.printf("%s, %s %d, %d.\n", day, month, date, year);
    }

    public static void printEuropean(String day, String month, int date, int year){
        System.out.printf("%s %d %s %d.", day, date, month, year);
    }

    public static void main(String[] args) {
        printAmerican("Monday",8,"September",2021);
        printEuropean("monday","September", 8, 2021);
    }
}

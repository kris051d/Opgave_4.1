package com.company;

public class Main {

    public static void printAmerican(){
        String day = "wednesday";
        String date = "8";
        String month = "September";
        String year = "2021";
        System.out.println(day+", "+month+" "+date+", "+year+".");
    }

    public static void printEuropean(){
        String day = "wednesday";
        String date = "8";
        String month = "September";
        String year = "2021";
        System.out.println(day+" "+date+" "+month+" "+year+".");
    }

    public static void main(String[] args) {
        printAmerican();
        printEuropean();
    }
}

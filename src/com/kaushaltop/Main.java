package com.kaushaltop;

public class Main {

    public static void main(String[] args) {

        int number = 0;

        while (number < 15) {

            number++;

            //The below condition skips the first five numbers
            if (number <= 5) {

                //System.out.println("Skipping number "+number);

                continue;

            }

            //This statement prints out remaining numbers
            System.out.println("Numbers "+number);

            //Below condition skips initial 10 numbers and prints numbers from 11 to 15
            if (number > 10) {

                //System.out.println("Breaking at "+number);

            }
        }

    }
}

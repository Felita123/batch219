package com.xsisday1;

import java.util.Scanner;

public class xsis05 {
    public static void main(String[] args) {
        double literperkilo, totaljaraktempuh, totalliter;
        Scanner scan= new Scanner(System.in);
        System.out.println("Total Jarak Tempuh :");
        totaljaraktempuh = scan.nextDouble();
        System.out.println("Total Bensin yang dipakai :");
        totalliter = scan.nextDouble();
        literperkilo = totaljaraktempuh/totalliter;
        System.out.println("Satu liter perkilo :"+literperkilo);

    }
}

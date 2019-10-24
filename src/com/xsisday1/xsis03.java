package com.xsisday1;
import java.util.Scanner;
public class xsis03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Firstname: ");
        String firstname = scan.nextLine();
        System.out.println("Last name:");
        String lastname = scan.nextLine();
        System.out.println("Full name:"+firstname + lastname);
    }
}

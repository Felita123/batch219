package com.xsisday1;
import java.util.Scanner;
public class xsis02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int panjang=0, lebar=0, luas;

        System.out.print("Panjang:");
        panjang= scan.nextInt();
        System.out.print("lebar:");
        lebar=scan.nextInt();
        luas=panjang * lebar;
        System.out.print("Luas persegi panjang:"+luas);
    }
}

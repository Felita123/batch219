package com.xsisday1;
import java.util.Scanner;
public class xsis06 {
    static final double pajak= .15;
    public static void main(String[] args) {
        double itemforetax,itemaftertax;
        Scanner scan = new Scanner(System.in);
        System.out.println("Harga  barang sebelum pajak :");
        itemforetax = scan.nextDouble();
        itemaftertax = itemforetax + (itemforetax * pajak);
        System.out.println("Harga barang setelah pajak:"+itemaftertax);
    }
}

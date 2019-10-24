package com.xsisday1;
import java.sql.SQLOutput;
import java.util.Scanner;
public class xsis07 {
    public static void main(String[] args) {
        double itemforediscount,itemafterdiscount,discount;
        Scanner scan = new Scanner(System.in);
        System.out.println("Harga item barang:");
        itemforediscount = scan.nextDouble();
        System.out.println("diskon : %");
        discount = scan.nextDouble();
        itemafterdiscount = itemforediscount - (itemforediscount*discount/100);
        System.out.println("harga barang sesudah diskon:"+itemafterdiscount);



    }
}

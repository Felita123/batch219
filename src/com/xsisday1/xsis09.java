package com.xsisday1;
import java.util.Scanner;
public class xsis09 {
    public static void main(String[] args) {
        int bilangan,digit1,digit2,digit3,digit4,sisa,totaljumlah;
        Scanner scan = new Scanner(System.in);
        System.out.println("masukkan bilangan:");
        bilangan= scan.nextInt();
        digit1=bilangan/1000;
        sisa = bilangan % 1000;
        System.out.println("digit1="+digit1+",sisa="+sisa);
        digit2=sisa/100;
        sisa = bilangan % 100;
        System.out.println("digit2="+digit2+",sisa="+sisa);
        digit3=sisa/10;
        sisa = bilangan % 10;
        System.out.println("digit3="+digit3+",sisa="+sisa);
        digit4=sisa;
        System.out.println("digit4="+digit4+",sisa="+sisa);
        totaljumlah=digit1+digit2+digit3+digit4;
        System.out.println("total jumlah="+totaljumlah);
    }
}

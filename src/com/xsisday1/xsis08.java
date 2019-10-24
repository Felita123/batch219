package com.xsisday1;
// konversi temperature dari fahrenheit ke kelvin
// rumus = kelvin=(fahrenheit + 459.67)/1.8
import java.util.Scanner;
public class xsis08 {

    static final double cf= 459.67;
    static final double cd= 1.8;
    public static void main(String[] args) {
        double fahrenheit,kelvin;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input temperature fahrenheit");
        fahrenheit = scan.nextDouble();
        kelvin = (fahrenheit+cf)/cd;
        System.out.println("konversi fahrenheit ke temperature kelvin="+kelvin);

    }
}

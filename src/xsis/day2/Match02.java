package xsis.day2;
import java.util.Scanner;
public class Match02 {
    public static void main(String[] args) {
        double s,a,t;
        Scanner scan= new Scanner(System.in);
        System.out.println("jarak:");
        s = scan.nextDouble();

        System.out.println("percepatan:");
        a = scan.nextDouble();

        t= Math.sqrt(2*s /a);
        System.out.println("waktu tempuh:"+t);
        //bulatan ke atas >0.5 ke1
        System.out.println("waktu tempuh:"+Math.round(t));
       //bulat kebawah >0.5 tetap 0.5
        System.out.println("waktu tempuh:"+Math.floor(t));

        System.out.println("waktu tempuh:"+Math.ceil(t));




    }
}

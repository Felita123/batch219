package quiz01;

import java.util.Scanner;

public class quiz1 {
    public static void main(String[] args) {
        double sudut1,sudut2,sudut3;
        Scanner scan = new Scanner(System.in);
        System.out.println("sudut 1=");
        sudut1 = scan.nextDouble();
        System.out.println("sudut 2=");
        sudut2 = scan.nextDouble();

        sudut3=180-(sudut1+sudut2);
        System.out.println("besar sudut ketiga="+sudut3);
    }
}

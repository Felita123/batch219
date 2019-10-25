package quiz02;

import java.util.Scanner;

public class no5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input1,input2,input3,input4;
        System.out.println("masukkan input1:");
        input1=scan.nextInt();
        System.out.println("masukkan input2:");
        input2=scan.nextInt();
        System.out.println("masukkan input1:");
        input3=scan.nextInt();
        System.out.println("masukkan input2:");
        input4=scan.nextInt();
        if (input1<0 || input2<0 || input3<0 || input4<0) {
            System.out.println("among the number is negative one");
        }
    }
}

package quiz02;

import java.util.Scanner;

public class no02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input1,input2;
        System.out.println("masukkan input1:");
        input1=scan.nextInt();
        System.out.println("masukkan input2:");
        input2=scan.nextInt();
        if (input1>0 && input2>0) {
            System.out.println("positive");
        }
    }
}

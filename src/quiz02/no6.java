package quiz02;

import java.util.Scanner;

public class no6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input1,input2,input3;
        System.out.println("masukkan input1:");
        input1=scan.nextInt();
        System.out.println("masukkan input2:");
        input2=scan.nextInt();

        if (input1 > input2) {
            input3=input1;
            input1=input2;
            input2=input3;
            System.out.println(input1 +"lalu"+input2);
        }
    }
}

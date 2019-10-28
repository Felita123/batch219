package PRxsis.ke2;

import java.util.Scanner;

public class prno19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input1,input2,input3,add1,add2,add3,sisi1,sisi2,sisi3;
        System.out.println("masukkan input1:");
        input1= scan.nextInt();
        System.out.println("masukkan input2:");
        input2= scan.nextInt();
        System.out.println("masukkan input3:");
        input3= scan.nextInt();
        add1=input1+input2;
        add2=input1+input3;
        add3=input2+input3;
        sisi1=(input1*input1);
        sisi2=(input2*input2);
        sisi3=(input3*input3);
        if(input3<add1 && input2<add2 && input1<add3){
            System.out.println("bisa jadi segitiga biasa");
        } else if (sisi1==sisi2+sisi3) {
            System.out.println("bisa jadi segitiga siku-siku ");
        } else if (sisi2==sisi1+sisi3) {
            System.out.println("bisa jadi segitiga siku-siku ");
        } else if (sisi3==sisi1+sisi2) {
            System.out.println("bisa jadi segitiga siku-siku ");
        } else if (input1==input2 && input2==input3){
            System.out.println("bisa jadi segitiga sama sisi");
        } else {
            System.out.println("bukan segitiga");
        }
    }
}

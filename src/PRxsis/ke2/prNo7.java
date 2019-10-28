package PRxsis.ke2;

import java.util.Scanner;

public class prNo7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input1, input2, input3,sisi1,sisi2,sisi3;
        System.out.println("masukkan sisi1:");
        input1 = scan.nextInt();
        System.out.println("masukkan sisi2:");
        input2 = scan.nextInt();
        System.out.println("masukkan sisi3:");
        input3 = scan.nextInt();
        sisi1=(input1*input1);
        sisi2=(input2*input2);
        sisi3=(input3*input3);
        if (sisi1==sisi2+sisi3) {
            System.out.println("bisa jadi segitiga siku-siku ");
        } else if (sisi2==sisi1+sisi3) {
            System.out.println("bisa jadi segitiga siku-siku ");
        } else if (sisi3==sisi1+sisi2) {
            System.out.println("bisa jadi segitiga siku-siku ");
        }

    }
}

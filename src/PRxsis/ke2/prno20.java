package PRxsis.ke2;

import java.util.Scanner;

public class prno20 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pin1, pin2, pin3, uang, note1, note2, note3, sisa1, sisa2, pin;
        System.out.println("masukkan pin:");
        pin1 = scan.nextInt();
        pin = 1234;
        if (!(pin1 == 1234)) {
            System.out.println("masukkan pin lagi:");
            pin2 = scan.nextInt();
            if (pin2==pin){
                System.out.println("masukkan uang:");
                uang = scan.nextInt();
                note1 = uang / 10;
                sisa1 = uang % 10;
                note2 = sisa1 / 5;
                sisa2 = sisa1 % 5;
                note3 = sisa2 / 1;
                System.out.println("note yang didapat:" + note1 + " 10$ " + note2 + " 5$ " + note3+" 1$ ");
            }
            if (!(pin2 == pin)) {
                System.out.println("masukkan pin lagi:");
                pin3 = scan.nextInt();
                if (pin3==pin){
                    System.out.println("masukkan uang:");
                    uang = scan.nextInt();
                    note1 = uang / 10;
                    sisa1 = uang % 10;
                    note2 = sisa1 / 5;
                    sisa2 = sisa1 % 5;
                    note3 = sisa2 / 1;
                    System.out.println("note yang didapat:" + note1 + " 10$ " + note2 + " 5$ " + note3+" 1$ ");
                }
                if (!(pin3 == pin)) {
                    System.out.println("pin di blocked");
                }
            }
        }
        if (pin1==pin){
            System.out.println("masukkan uang:");
            uang = scan.nextInt();
            note1 = uang / 10;
            sisa1 = uang % 10;
            note2 = sisa1 / 5;
            sisa2 = sisa1 % 5;
            note3 = sisa2 / 1;
            System.out.println("note yang didapat:" + note1 + " 10$ " + note2 + " 5$ " + note3+" 1$ ");
        }
    }
}


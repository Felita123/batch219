package PRxsis.ke2;

import java.util.Scanner;

public class prno14 {
    public static void main(String[] args) {
        int days;
        int month;
        Scanner scan = new Scanner(System.in);
        System.out.println("input bulan:");
        month = scan.nextInt();
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("its winter");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("its spring");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("its summer");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("its autumn");
        }
    }
}

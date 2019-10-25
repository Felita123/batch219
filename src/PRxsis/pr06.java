package PRxsis;

import java.util.Scanner;

public class pr06 {
    public static void main(String[] args) {
        int input, sisa, note1, note2, note3, note4;
        Scanner scan = new Scanner(System.in);
        System.out.println("input number=");
        input = scan.nextInt();
        note1 = input / 20;
        sisa = input % 20;
        note2 = sisa / 10;
        sisa = sisa % 10;
        note3 = sisa / 5;
        sisa = sisa % 5;
        note4 = sisa / 1;
        sisa = sisa % 1;
        System.out.println("given note:" + note1 + "for 20$" + note2 + "for 10$" + note3 + "for 5$" + note4 + "for 1$");

    }
}
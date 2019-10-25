package PRxsis;

import java.util.Scanner;

public class pr07 {
    public static void main(String[] args) {
        int step,total,sisa,stepI,mile,yard,foot,inch;
        Scanner scan = new Scanner(System.in);
        System.out.println("input number=");
        step = scan.nextInt();
        stepI = step * 25;
        System.out.println("Total step inch:"+stepI);
        mile = stepI / 63360;
        sisa = stepI % 63360;
        yard = sisa / 36;
        sisa = sisa % 36;
        foot = sisa / 12;
        sisa = sisa % 12;
        inch = sisa / 1;
        sisa = sisa % 1;
        System.out.println("total step:" + mile + "for mile" + yard + " for yard" + foot + "for feet" + inch + "for inch");

    }
}

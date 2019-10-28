package PRxsis.ke2;

import java.util.Scanner;

public class prNo10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Workhours,grosspay,deduction,payrate;
        System.out.println("masukkan jam:");
        Workhours= scan.nextInt();
        System.out.println("masukkan upah:");
        payrate= scan.nextInt();
        deduction=(payrate*30)/100;
        grosspay=payrate-deduction;
        if(Workhours>40){
            System.out.println("grosspay:"+(2*grosspay));
        } else {
            System.out.println("grosspay:"+grosspay);
        }
    }
}

package PRxsis.ke2;

import java.util.Scanner;

public class prNo09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int payrate,Workhours;
        System.out.println("masukkan lama kerja:");
        Workhours= scan.nextInt();
        System.out.println("masukkan upah:");
        payrate= scan.nextInt();
        if(Workhours>40){
            System.out.println("grosspay:"+(2*payrate));
        } else {
            System.out.println("grosspay:"+payrate);
        }
    }
}

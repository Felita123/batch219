package PRxsis.ke2;

import java.util.Scanner;

public class prNo8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jump1,jump2,jump3,averageJump;
        System.out.println("masukkan jump1:");
        jump1= scan.nextInt();
        System.out.println("masukkan jump2:");
        jump2= scan.nextInt();
        System.out.println("masukkan jump3:");
        jump3= scan.nextInt();
        averageJump=(jump1+jump2+jump3)/3;
        if(averageJump<8){
            System.out.println("pemain tidak terkualifikasi");
        } else {
            System.out.println("pemain terkualifikasi");
        }
    }
}

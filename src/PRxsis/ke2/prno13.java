package PRxsis.ke2;

import java.util.Scanner;

public class prno13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double input,sisa;
        System.out.println("masukkan input bilangan antara 0-999:");
        input= scan.nextDouble();
        sisa=input/100;
        if(sisa<10 && sisa>=1){
            System.out.println("input 3 digit");
        } else if(sisa>=0.1 && sisa<1) {
            System.out.println("input 2 digit");
        } else if(sisa>=0.01 && sisa<0.1) {
            System.out.println("input 1 digit");
        }
    }
}

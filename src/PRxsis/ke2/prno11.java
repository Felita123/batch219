package PRxsis.ke2;

import java.util.Scanner;

public class prno11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int miles  ;
        System.out.println("masukkan miles traveled:");
        miles= scan.nextInt();


        if(miles<6000){
            System.out.println("miles left until next service:"+(6000-miles));
        } else {
            System.out.println("miles left until next service:"+(12000-miles));
        }
    }
}

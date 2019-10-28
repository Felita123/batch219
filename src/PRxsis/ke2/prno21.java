package PRxsis.ke2;

import java.util.Scanner;

public class prno21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice,quantity,liter,galon;
        System.out.println("galon ke liter:1");
        System.out.println("liter ke galon:2");
        System.out.println("pilih pilihan 1 atau 2");
        choice= scan.nextInt();
        System.out.println("masukkan kuantitas");
        quantity= scan.nextInt();
        liter=quantity*3785;
        galon=quantity/3785;
        if(choice==1){
            System.out.println("liter:"+liter);
        } else if( choice==2 ){
            System.out.println("galon:"+galon);
        }
    }
}

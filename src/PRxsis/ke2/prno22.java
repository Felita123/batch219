package PRxsis.ke2;

import java.util.Scanner;

public class prno22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String vehicle,quantity,liter,galon;
        System.out.println("jenis vehicle");
        vehicle= scan.next();
        vehicle=vehicle.toUpperCase();

        if(vehicle=="M"){
            System.out.println("amount to pay: 1$");
        } else if( vehicle=="T" ){
            System.out.println("amount to pay: 4$");
        } else if( vehicle=="C"){
            System.out.println("amount to pay 2$");
        }
    }
}

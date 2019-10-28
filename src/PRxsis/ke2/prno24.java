package PRxsis.ke2;

import java.util.Scanner;

public class prno24 {
    public static void main(String[] args) {
        int amount;
        double diskon1,diskon2,diskon3,diskon4;
        Scanner scan = new Scanner(System.in);
        System.out.println("amount order : $");
        amount = scan.nextInt();

        diskon1=0.05*amount;
        diskon2=0.01*amount;
        diskon3=0.2*amount;
        if (amount < 30){
            System.out.println("no diskon: 0$");
        }else if(amount>=30 && amount<70){
            System.out.println("diskon 5%: "+Math.round(diskon1)+" $");
        }else if(amount>=70 && amount<150){
            System.out.println("diskon 10%: "+Math.round(diskon2)+" $");
        }else if(amount>=150){
            System.out.println("diskon 20%: "+Math.round(diskon3)+" $");
        }
    }
}

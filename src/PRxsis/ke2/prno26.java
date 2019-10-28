package PRxsis.ke2;

import java.util.Scanner;

public class prno26 {
    public static void main(String[] args) {
        int number;
        double amount1,amount2,amount3,amount4;
        Scanner scan = new Scanner(System.in);
        System.out.println("number : kwh");
        number = scan.nextInt();

        amount1=0.10*number;
        amount2=0.25*number;
        amount3=0.40*number;
        amount4=0.60*number;

        if (number <= 500){
            System.out.println("bayar: "+Math.round(amount1)+" $");
        }else if(number>=501 && number<=2000){
            System.out.println("bayar: "+Math.round(amount2)+" $");
        }else if(number>=2001 && number<=4000){
            System.out.println("bayar: "+Math.round(amount3)+" $");
        }else if(number<=4001){
            System.out.println("bayar: "+Math.round(amount4)+" $");
        }
    }
}

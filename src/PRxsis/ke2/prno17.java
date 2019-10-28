package PRxsis.ke2;

import java.util.Scanner;

public class prno17 {
        static final String is_numeric= "[-+]?\\d+(\\.\\d+)?";
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String number;
            int sisa1,sisa2;
            System.out.println("masukkan bilangan:");
            number= scan.next();
            int num= Integer.parseInt(number);
            sisa1=num%5;
            sisa2=num%8;
            if(number.matches(is_numeric)){
                if(sisa1==0 && sisa2 ==0 && num!=0){
                System.out.println("divisible by 5 dan 8");
            }

            }
        }

}

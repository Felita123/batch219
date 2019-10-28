package PRxsis.ke2;

import java.util.Scanner;

public class no18 {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int numberCD;
            System.out.println("masukkan CD:");
            numberCD= scan.nextInt();

            if(numberCD>=4){
                System.out.println("reward 45 point");
            } else if( numberCD==3 ){
                System.out.println("reward 20 point");
            } else if(numberCD==2){
                System.out.println("reward 10 point");
            } else if(numberCD==1){
                System.out.println("reward 3 point");
            }
        }
    }


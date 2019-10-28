package PRxsis.ke2;
import java.util.Scanner;
public class prNo4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input;
        double bagi;
        System.out.println("masukkan input:");
        input= scan.nextInt();
        bagi=input/1000;
        if(bagi<10 && bagi>0){
            System.out.println("input yang dimasukkan 4 digit");
        }
        else{
            System.out.println("input yang dimasukkan bukan 4 digit");
        }
    }
}

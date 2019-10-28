package PRxsis.ke2;
import java.util.Scanner;

public class prNo1 {

    public static void main(String[] args) {
        int input;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input bilangan : ");
        input = scan.nextInt();
        if (input % 6 == 0 && input>0){
            System.out.println("Inputan Bilangan hasil perkalian dari 6");
        }else{
            System.out.println("Inputan Bilangan bukan hasil perkalian dari 6");
        }
    }
}



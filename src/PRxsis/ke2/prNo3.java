package PRxsis.ke2;

import java.util.Scanner;

public class prNo3 {
    public static void main(String[] args) {
        int input,sisa,quotient;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input bilangan : ");
        input = scan.nextInt();
        quotient=input/4;
        sisa=input % 4;
        System.out.println(input + "=" + quotient + "X 4" +"+"+sisa);
        if (input % 4 == 0){
            System.out.println("Inputan Bilangan hasil perkalian dari 4");
        }else{
            System.out.println("Inputan Bilangan bukan hasil perkalian dari 4");
        }
    }
}

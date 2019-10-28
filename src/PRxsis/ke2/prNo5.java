package PRxsis.ke2;
import java.util.Scanner;
public class prNo5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input1,input2;
        System.out.println("masukkan input1:");
        input1= scan.nextInt();
        System.out.println("masukkan input2:");
        input2= scan.nextInt();
        if(input1<input2){
            System.out.println("paling kecil "+ input1);
        } else {
            System.out.println("paling kecil "+ input2);
        }
    }
}

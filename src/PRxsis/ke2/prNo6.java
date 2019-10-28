package PRxsis.ke2;
import java.util.Scanner;

public class prNo6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input1,input2,input3,add1,add2,add3;
        System.out.println("masukkan input1:");
        input1= scan.nextInt();
        System.out.println("masukkan input2:");
        input2= scan.nextInt();
        System.out.println("masukkan input3:");
        input3= scan.nextInt();
        add1=input1+input2;
        add2=input1+input3;
        add3=input2+input3;
        if(input3<add1 && input2<add2 && input1<add3){
            System.out.println("bisa jadi segitiga");
        }
    }
}

package PRxsis.ke2;
import java.util.Scanner;
public class prno23 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int berat1,berat2,berat3;
        System.out.println("masukkan berat orang 1");
        berat1=scan.nextInt();
        System.out.println("masukkan berat orang 2");
        berat2=scan.nextInt();
        System.out.println("masukkan berat orang 3");
        berat3=scan.nextInt();

        if (berat1>berat2 && berat1>berat3){
            System.out.println("orang satu paling berat");
        }else if(berat2>berat1 && berat2>berat3){
            System.out.println("orang kedua paling berat");
        }else if(berat3>berat1 && berat3>berat2){
            System.out.println("orang ketiga paling berat");
        }

    }
}

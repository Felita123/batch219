package PRxsis;

import java.util.Scanner;

public class pr05 {
    public static void main(String[] args) {
        int input,sisa,digit1,digit2,digit3,digit4;
        Scanner scan = new Scanner(System.in);
        System.out.println("input number=");
        input = scan.nextInt();
        digit1 = input/604800;
        sisa = input % 604800;
        digit2 = sisa/86400;
        sisa = input % 86400;
        digit3 = sisa/3600;
        sisa = input % 3600;
        digit4 = sisa/60;
        sisa = input % 60;
        System.out.println("result display:" +digit1 +"hari" + digit2 +"jam"+ digit3 +"menit"+ digit4 +"detik");

    }
}

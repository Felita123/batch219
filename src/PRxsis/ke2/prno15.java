package PRxsis.ke2;
import java.util.Scanner;
public class prno15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double input,digit1, digit2;
        String a, b, c, d, e, f, g, h, i, j;
        System.out.println("masukkan input bilangan antara 1.0-4.9:");
        input = scan.nextDouble();
        a = "satu";
        b = "dua";
        c = "tiga";
        d = "empat";
        e = "lima";
        f = "enam";
        g = "tujuh";
        h = "delapan";
        i = "sembilan";
        j = "nol";

        digit1 = input;
        digit2 = (input*10) % 10;

        if (digit1 < 2 && digit1>=1 && digit2 == 0) {
            System.out.println("hasil angka ke teks: " + a + " point " + j);
        } else if(digit1 < 2 && digit1>=1 && digit2 == 1){
            System.out.println("hasil angka ke teks: " + a + " point " + a);
        }else if(digit1 < 2 && digit1>=1 && digit2 == 2){
            System.out.println("hasil angka ke teks: " + a + " point " + b);
        }else if(digit1 < 2 && digit1>=1 && digit2 == 3){
            System.out.println("hasil angka ke teks: " + a + " point " + c);
        }else if(digit1 < 2 && digit1>=1 && digit2 == 4){
            System.out.println("hasil angka ke teks: " + a + " point " + d);
        }else if(digit1 < 2 && digit1>=1 && digit2 == 5){
            System.out.println("hasil angka ke teks: " + a + " point " + e);
        }else if(digit1 < 2 && digit1>=1 && digit2 == 6){
            System.out.println("hasil angka ke teks: " + a + " point " + f);
        }else if(digit1 < 2 && digit1>=1 && digit2 == 7){
            System.out.println("hasil angka ke teks: " + a + " point " + g);
        }else if(digit1 < 2 && digit1>=1 && digit2 == 8){
            System.out.println("hasil angka ke teks: " + a + " point " + h);
        }else if(digit1 < 2 && digit1>=1 && digit2 == 9){
            System.out.println("hasil angka ke teks: " + a + " point " + i);
        }

        if (digit1 >= 2 && digit1<3  && digit2 == 0) {
            System.out.println("hasil angka ke teks: " + b + " point " + j);
        } else if (digit1 >= 2 && digit1<3  && digit2 == 1) {
            System.out.println("hasil angka ke teks: " + b + " point " + a);
        }else if (digit1 >= 2 && digit1<3  && digit2 == 2) {
            System.out.println("hasil angka ke teks: " + b + " point " + b);
        }else if (digit1 >= 2 && digit1<3  && digit2 == 3) {
            System.out.println("hasil angka ke teks: " + b + " point " + c);
        }else if (digit1 >= 2 && digit1<3  && digit2 == 4) {
            System.out.println("hasil angka ke teks: " + b + " point " + d);
        }else if (digit1 >= 2 && digit1<3  && digit2 == 5) {
            System.out.println("hasil angka ke teks: " + b + " point " + e);
        }else if (digit1 >= 2 && digit1<3  && digit2 == 6) {
            System.out.println("hasil angka ke teks: " + b + " point " + f);
        }else if (digit1 >= 2 && digit1<3  && digit2 == 7) {
            System.out.println("hasil angka ke teks: " + b + " point " + g);
        }else if (digit1 >= 2 && digit1<3  && digit2 == 8) {
            System.out.println("hasil angka ke teks: " + b + " point " + h);
        }else if (digit1 >= 2 && digit1<3  && digit2 == 9) {
            System.out.println("hasil angka ke teks: " + b + " point " + i);
        }

        if (digit1 >= 3 && digit1<4  && digit2 == 0) {
            System.out.println("hasil angka ke teks: " + c + " point " + j);
        } else if (digit1 >= 3 && digit1<4  && digit2 == 1) {
            System.out.println("hasil angka ke teks: " + c + " point " + a);
        }else if (digit1 >= 3 && digit1<4 && digit2 == 2) {
            System.out.println("hasil angka ke teks: " + c + " point " + b);
        }else if (digit1 >= 3 && digit1<4  && digit2 == 3) {
            System.out.println("hasil angka ke teks: " + c + " point " + c);
        }else if (digit1 >= 3 && digit1<4  && digit2 == 4) {
            System.out.println("hasil angka ke teks: " + c + " point " + d);
        }else if (digit1 >= 3 && digit1<4  && digit2 == 5) {
            System.out.println("hasil angka ke teks: " + c + " point " + e);
        }else if (digit1 >= 3 && digit1<4  && digit2 == 6) {
            System.out.println("hasil angka ke teks: " + c + " point " + f);
        }else if (digit1 >= 3 && digit1<4  && digit2 == 7) {
            System.out.println("hasil angka ke teks: " + c + " point " + g);
        }else if (digit1 >= 3 && digit1<4  && digit2 == 8) {
            System.out.println("hasil angka ke teks: " + c + " point " + h);
        }else if (digit1 >= 3 && digit1<4  && digit2 == 9) {
            System.out.println("hasil angka ke teks: " + c + " point " + i);
        }

        if (digit1 >= 4 && digit1<5  && digit2 == 0) {
            System.out.println("hasil angka ke teks: " + d + " point " + j);
        } else if (digit1 >= 4 && digit1<5  && digit2 == 1) {
            System.out.println("hasil angka ke teks: " + d + " point " + a);
        }else if (digit1 >= 4 && digit1<5  && digit2 == 2) {
            System.out.println("hasil angka ke teks: " + d + " point " + b);
        }else if (digit1 >= 4 && digit1<5  && digit2 == 3) {
            System.out.println("hasil angka ke teks: " + d + " point " + c);
        }else if (digit1 >= 4 && digit1<5  && digit2 == 4) {
            System.out.println("hasil angka ke teks: " + d + " point " + d);
        }else if (digit1 >= 4 && digit1<5  && digit2 == 5) {
            System.out.println("hasil angka ke teks: " + d + " point " + e);
        }else if (digit1 >= 4 && digit1<5  && digit2 == 6) {
            System.out.println("hasil angka ke teks: " + d + " point " + f);
        }else if (digit1 >= 4 && digit1<5  && digit2 == 7) {
            System.out.println("hasil angka ke teks: " + d + " point " + g);
        }else if (digit1 >= 4 && digit1<5  && digit2 == 8) {
            System.out.println("hasil angka ke teks: " + d + " point " + h);
        }else if (digit1 >= 4 && digit1<5  && digit2 == 9) {
            System.out.println("hasil angka ke teks: " + d + " point " + i);
        }
    }
}

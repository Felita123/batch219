package PRxsis.ke2;
import java.util.Scanner;
public class prno16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String letter,huruf;
        System.out.println("masukkan nilai antara A-F:");
        letter = scan.nextLine();
        huruf=letter.toUpperCase();

        if (huruf.equals("A")) {
            System.out.println("90-100 %");
        } else if (huruf.equals("B")){
            System.out.println("80-89 %");
        } else if (huruf.equals("C")) {
            System.out.println("70-79 %");
        } else if (huruf.equals("D")) {
            System.out.println("60-69 %");
        } else if (huruf.equals("E") || huruf.equals("F")) {
            System.out.println("0-59 %");
        }
    }

}

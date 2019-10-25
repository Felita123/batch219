package quiz02;

import java.util.Scanner;

public class no4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;
        int kata;
        System.out.println("masukkan input:");
        input=scan.nextLine();
        kata = input.length();
        if (kata>20) {
            System.out.println("many characters");
        }

    }
}

package quiz02;

import java.util.Scanner;

public class no3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input,kata;
        System.out.println("masukkan input:");
        input=scan.next();
        kata = input.toUpperCase();
        if (input.equals(kata)) {
            System.out.println("uppercase");
        }

    }
}

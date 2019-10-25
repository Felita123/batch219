package PRxsis;

import java.util.Scanner;

public class pr04 {
    public static void main(String[] args) {
        int input,result;
        Scanner scan = new Scanner(System.in);
        System.out.println("input number=");
        input = scan.nextInt();
        result = (input+1) % 2;
        System.out.println("result=" +result);
    }
}

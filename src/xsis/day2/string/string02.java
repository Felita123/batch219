package xsis.day2.string;
import java.util.Scanner;
public class string02 {
    public static void main(String[] args) {
        String s,reverse;
        Scanner scan = new Scanner(System.in);
        System.out.println("input:");
        s= scan.next();
        System.out.println("hasil:"+s);
        System.out.println("reverse:" +s.charAt(3)+s.charAt(2)+s.charAt(1)+s.charAt(0));

    }
}

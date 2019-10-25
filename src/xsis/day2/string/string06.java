package xsis.day2.string;
import java.util.Scanner;
public class string06 {
    public static void main(String[] args) {
        String username,name;
        double add,round,koma;
        add= 10*Math.random()+100;
        Scanner scan= new Scanner(System.in);
        String s = " Hello Java Programmer";
        System.out.println("username:");
        username = scan.next();
        name= s.substring(0,5);
        System.out.println("campurannya:"+username+(Math.round(add)));
    }
}

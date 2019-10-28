package PRxsis.ke2;
import java.util.Scanner;
public class pr15lain {
    //static final String IS_NUMERIC = "[-+]?\\d+(\\.\\d+)?";

    public static void main(String[] args) {
        char digit1;
        char digit2;
        String input;
        Scanner scan = new Scanner(System.in);
        System.out.println("input hari:");
        input=scan.next();

        digit1=input.charAt(0);
        digit2=input.charAt(2);

        switch(digit1){
        case 1:
        System.out.println("satu");
        break;
        case 2:
        System.out.println("dua");
        break;
        case 3:
        System.out.println("tiga");
        break;
        case 4:
        System.out.println("empat");
        break;
    }
        switch(digit2){
            case 1:
                System.out.println("satu");
                break;
            case 2:
                System.out.println("dua");
                break;
            case 3:
                System.out.println("tiga");
                break;
            case 4:
                System.out.println("empat");
                break;
            case 5:
                System.out.println("lima");
                break;
            case 6:
                System.out.println("enam");
                break;
            case 7:
                System.out.println("tujuh");
                break;
            case 8:
                System.out.println("delapan");
                break;
            case 9:
                System.out.println("sembilan");
                break;
            case 0:
                System.out.println("nol");
                break;
        }
        System.out.println(digit1+" point "+digit2);
}
}

package PRxsis;
import java.util.Scanner;
public class pr01 {
    public static void main(String[] args) {
        int input,result,sisa;
        Scanner scan = new Scanner(System.in);
        System.out.println("input number=");
        input = scan.nextInt();
        sisa = input % 10;
        System.out.println("remain="+sisa);
        result = sisa*8;
        System.out.println("result from lastdigit" +sisa +"x 8:"+result);
    }
}

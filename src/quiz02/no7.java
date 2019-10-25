package quiz02;
import java.util.Scanner;
public class no7 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int temp1,temp2,temp3,rata;
            System.out.println("masukkan input1:");
            temp1=scan.nextInt();
            System.out.println("masukkan input2:");
            temp2=scan.nextInt();
            System.out.println("masukkan input3:");
            temp3=scan.nextInt();
            rata=(temp1+temp2+temp3)/3;
            if(rata>60){
                System.out.println("heat wave");
            }
    }
}

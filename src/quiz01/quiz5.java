package quiz01;
import java.util.Scanner;
public class quiz5 {
    public static void main(String[] args) {
    double fahrenheit, celcius, konversi;
    Scanner scan = new Scanner(System.in);
    System.out.print("Input Temperature in Fahreinhet : ");
    fahrenheit = scan.nextDouble();
    konversi = (fahrenheit-32)*0.56;
            System.out.println("hasil konversi fahrenheit ke celcius : "+konversi);
}
}

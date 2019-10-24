package quiz01;

import java.util.Scanner;

public class quiz6 {
    public static void main(String[] args) {
        double beratbadan,tinggibadan,beratideal;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Temperature in beratbadan : ");
        beratbadan = scan.nextDouble();
        System.out.print("Input Temperature in tinggibadan : ");
        tinggibadan = scan.nextDouble();
        beratideal=beratbadan/(tinggibadan*tinggibadan);
        System.out.print("berat ideal : "+beratideal);

    }
}

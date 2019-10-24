package quiz01;
// nilai rata2
import java.util.Scanner;
public class quiz2 {

    public static void main(String[] args) {
        double mat,bio,fis,sos,nilairata2;
        Scanner scan = new Scanner(System.in);
        System.out.println("nilai mat=");
        mat = scan.nextDouble();
        System.out.println("nilai bio=");
        bio = scan.nextDouble();
        System.out.println("nilai fis=");
        fis = scan.nextDouble();
        System.out.println("nilai sos=");
        sos = scan.nextDouble();
        nilairata2=(mat+bio+fis+sos)/4;
        System.out.println("rata-rata nilai="+nilairata2);

    }
}

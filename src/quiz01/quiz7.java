package quiz01;
import java.util.Scanner;
public class quiz7 {
    public static void main(String[] args) {
        double harga1,harga2,harga3,total,total2,rata1,rata2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Harga produk 1=");
        harga1 = scan.nextDouble();
        System.out.println("Harga produk 2=");
        harga2 = scan.nextDouble();
        System.out.println("Harga produk 3=");
        harga3 = scan.nextDouble();

        total=(harga1+harga2+harga3);
        System.out.println("total harga produk sebelum kena pajak="+total);
        total2=((0.2*harga1)+harga1)+((0.2*harga2)+harga2)+((0.2*harga3)+harga3);
        System.out.println("total harga produk sesudah kena pajak="+total2);

        rata1=total/3;
        System.out.println("rata2 total harga produk sebelum kena pajak="+rata1);
        rata2=total2/3;
        System.out.println("rata2 total harga produk sesudah kena pajak="+rata2);
    }
}

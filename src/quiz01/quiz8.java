package quiz01;

import java.util.Scanner;

public class quiz8 {
    public static void main(String[] args) {
        double hargabarang,diskon,jumlahhemat;
        Scanner scan = new Scanner(System.in);
        System.out.println("Harga barang=");
        hargabarang = scan.nextDouble();
        System.out.println("diskon=");
        diskon = scan.nextDouble();

        jumlahhemat=hargabarang*(diskon/100);
        System.out.println("total uang yang bisa dihemat="+jumlahhemat);

    }
}

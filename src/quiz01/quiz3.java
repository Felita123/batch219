package quiz01;

import java.util.Scanner;

public class quiz3 {
    static final double pajak = 0.07;
    static final double tips = 0.1;

    public static void main(String[] args) {
        double hargamakananori,hargamakananafter,hargaAfterPajak,hargaAfterTips;
        Scanner scan = new Scanner(System.in);
        System.out.println("harga makanan asli=");
        hargamakananori = scan.nextDouble();
        hargaAfterPajak = hargamakananori*pajak;
        hargaAfterTips = hargamakananori*tips;
        hargamakananafter=hargamakananori+(hargamakananori*pajak)+(hargamakananori*tips);
        System.out.println("harga makanan pajak:"+hargaAfterPajak);
        System.out.println("harga makanan tips:"+hargaAfterTips);
        System.out.println("harga makanan sesudah pajak dan tips:"+hargamakananafter);

    }
}

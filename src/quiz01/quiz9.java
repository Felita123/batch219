package quiz01;
import java.util.Scanner;

public class quiz9 {
    static final double pajak = 0.2;
    static final double bayar = 15000;
    public static void main(String[] args) {
        double jumlahtagihan,jumlahkwh,kwhawal,kwhakhir,totaltagihan;
        Scanner scan = new Scanner(System.in);
        System.out.println("kwh awal bulan=");
        kwhawal = scan.nextDouble();
        System.out.println("kwh akhir bulan=");
        kwhakhir = scan.nextDouble();
        jumlahkwh= kwhawal+kwhakhir;
        jumlahtagihan=jumlahkwh*15000;
        totaltagihan=(jumlahtagihan*0.2)+jumlahtagihan;
        System.out.println("total tagihan yang harus dibayar="+jumlahtagihan);

    }
}

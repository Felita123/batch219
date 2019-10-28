package PRxsis.ke2;

import java.util.Scanner;

public class prNo12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int distance1,distance2,acceleration1,timeboth,acceleration2;
        System.out.println("masukkan percepatan mobil1:");
        acceleration1= scan.nextInt();
        System.out.println("masukkan percepatan mobil2:");
        acceleration2= scan.nextInt();
        System.out.println("masukkan waktu untuk 2 mobil:");
        timeboth= scan.nextInt();
        distance1=0+(12*acceleration1*timeboth^2);
        distance2=0+(12*acceleration2*timeboth*timeboth);

        if(distance1<distance2){
            System.out.println("the car b is first");
        } else {
            System.out.println("the car a is first");
        }
    }
}

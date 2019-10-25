package xsis.day2.condition;

public class conditi01 {
    public static void main(String[] args) {
        String a,b,c;
        a="xsis";
        b="xsis";
        c="hello";

        if (a.equals(b)) {
            System.out.println("object string equal");
        } else{
            System.out.println("object string beda");
        }
        if (!a.equals(c)) {
            System.out.println("object string true");
        } else {
            System.out.println("object string false");
        }

        int umur=21;
        double ipk=3.01;
        if (umur >20 && ipk>3.01 && ipk <3.5) {
            System.out.println("found");
        }else{
            System.out.println("false");
        }
  }
}

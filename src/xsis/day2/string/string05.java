package xsis.day2.string;

public class string05 {
    public static void main(String[] args) {
        String huruf1,huruf2,huruf3;
        String s = " Hello Java Programmer";
        System.out.println("lenght s:"+s.length());

        System.out.println("index:"+s.indexOf("Java"));
//antara huruf ke 6 ampe 10 yang ditampilan
        huruf1= s.substring(11,22);
        huruf2= s.substring(0,6);
        huruf3= s.substring(6,11);
        System.out.println("reverse:"+huruf1+huruf2+huruf3);
    }
}

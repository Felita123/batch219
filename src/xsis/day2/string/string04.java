package xsis.day2.string;

public class string04 {
    public static void main(String[] args) {
        String s,st;
        s= "hello net developer welcome to xsis academy";
        System.out.println(s);
        //replacement
        st=s.replace("NET","JAVA");
        st=s.replace("","");

        System.out.println("after replace:"+st);

        st=s.replace("welcome","hello");
        System.out.println("after replace:"+st);

        st=s.replace("net","java");
        st=s.replace("welcome","aloha");
        st=s.replace("xsis academy","xsis").toUpperCase();

        System.out.println("after replace:"+st);

    }
}

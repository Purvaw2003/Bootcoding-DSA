package string;

public class MethodInString {
    public static void main(String[] args) {
        String S="Bootcoding";
        String d= S.replace("Boot","Cube");
        System.out.println(d);
        boolean f= S.startsWith("Boot");
        System.out.println(f);
        boolean g=S.endsWith("ing");
        System.out.println(g);
        int h=S.length();
        System.out.println(h);
        String i=S.toLowerCase();
        System.out.println(i);
        char j=S.charAt(3);
        System.out.println(j);
        int k=S.indexOf('t');
        System.out.println(k);
        int l=S.lastIndexOf('B');
        System.out.println(l);
        boolean m=S.equals("tshirt");
        System.out.println(m);
        boolean n=S.equalsIgnoreCase("Bootcoding");
        System.out.println(n);
    }
}

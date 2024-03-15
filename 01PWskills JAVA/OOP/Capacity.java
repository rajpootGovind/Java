package OOP;

public class Capacity {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        StringBuffer sb2 = new StringBuffer("govind");
        System.out.println(sb2.capacity());
        sb2.append("r");
        System.out.println(sb2);
        System.out.println(sb2.capacity());
        System.out.println(sb2.length());
        StringBuffer sb3 = new StringBuffer(150);
        System.out.println(sb3.capacity());
        sb3.append("rajpoot");
        System.out.println(sb3);
        sb3.trimToSize();
        System.out.println(sb3.capacity());

    }
}

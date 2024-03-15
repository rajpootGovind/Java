package pwskills;

public class StringComp {
    public static void main(String[] args) {
        String s1 = new String ("pwjava");
          String s2 = s1.concat("skills");
          String s3 = new String("pwjava");
           s3 = s3.concat("skills");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s1==s2);
        System.out.println(s2.equals(s3));
        System.out.println(s2==s3);
    }
}

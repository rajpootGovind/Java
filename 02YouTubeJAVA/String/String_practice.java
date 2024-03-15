public class String_practice
{
    public static void main(String[] args) {
        String s1 = "GOVIND RAJPOOT";
        String s2 = "jayhind rajpoot";
        System.out.println(s1.startsWith("GOV"));
        System.out.println(s2.contains("raj"));
        System.out.println(s2.endsWith("nd"));
        String s3 = s2.toUpperCase();
        System.out.println(s3);
        System.out.println(s1.replace("I"," "));
        System.out.println(s1.indexOf("T"));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.regionMatches(6,s3,7,7));
        System.out.println( s1.concat(" OK"));
        System.out.println(s1);
        StringBuilder sb1 = new StringBuilder("java");
        System.out.println(sb1.append(" hii"));
        System.out.println(sb1);
        StringBuilder sb2 = new StringBuilder(35);
        System.out.println(sb2.capacity());
       sb2. ensureCapacity(72);
        System.out.println(sb2.capacity());
        System.out.println(sb1.capacity());


    }
}

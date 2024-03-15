public class bitwiseoperator {
    public static void main(String[] args) {
        int x=9, y=10 ;

        // | or
        System.out.println(x|y);//1011

        // & and
        System.out.println(x&y);//1000

        // ^ xor
        System.out.println(x^y);//0011

        // ~ bitwise complement
        System.out.println(~x);//0110

        // >> right shift
        System.out.println(x>>2);//36

        // << left shift
        System.out.println(y<<1);//

    }
}

import java.util.Scanner;
public class lowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dataType = sc.nextLine();
       int size = 0;

      // switch (dataType.toLowerCase()){
        switch (dataType){
           case "integer":
              size = 4 ;
              break ;
           case "long":
               size = 8 ;
               break ;
           case "double":
               size = 8 ;
               break ;
           case "float":
               size = 4 ;
               break ; case "character":
               size = 1 ;
               break ;
           default:
               System.out.println("invalid data type");
       }
        System.out.println(size);
    }
}

/*
import java.util.Scanner;

public class main{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next(), b = sc.next(), c = sc.next();
        System.out.println(c);
        System.out.println(b);
        System.out.println(a);
        sc.close();
    }
}
*/
/*
import java.util.Scanner;

class UseScanner {
    public static void main(String [] args){
         Scanner scanner = new Scanner(System.in);
         String name1 = scanner.next(), name2 = scanner.next(), name3 = scanner.next(), name4 = scanner.next();
         System.out.println(name4);
         System.out.println(name3);
         System.out.println(name2);
         System.out.println(name1);
         scanner.close();
    }
}
*/

import java.util.Scanner;

public class UseScannerDatatype{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0); //nextChar() doesn't exist
        
        String f = sc.nextLine();
        
        String b = sc.next(); // nextString() doesn't exist
        int c = sc.nextInt();
        double d = sc.nextDouble();
        System.out.println("Character:"+a);
        System.out.println("String token:"+b);
        System.out.println("String Line:"+f);
        System.out.println("Integer:"+c);
        System.out.println("Double:"+d);
        System.out.println("The end");
        
        sc.close();
    }
}
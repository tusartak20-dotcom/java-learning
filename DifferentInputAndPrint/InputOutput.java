/* Code snippet to find hours and minutes in minutes*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutes = scanner.nextInt();
        int tHour = minutes/60 ;
        int tMinutes = minutes%60;
        System.out.println(tHour +" hours and "+tMinutes + " minutes");
        scanner.close();
    }
}


/* Code snippet to use unary operator*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int inputInteger = 50;

        // your code here - increase the integer by 1, then decrease it by 2, and finally increase it by 3
        ++inputInteger;
        inputInteger -=  2 ;
        inputInteger += 3 ;
        // print the final computed integer
        System.out.println(inputInteger);
    }
}

/* Code snippet to find hours and minutes in minutes*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 4;
        int b = a++; // b= 4, a = 5
        int c = --a + b++; // a = 4, b = 5, c = 8
        int result = ++a - (c++ - b) + c; 
        System.out.println(result);
    }
}

/* Use of BufferedReader to read from InputStream*/  
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Read the integer input
        int n = Integer.parseInt(reader.readLine());

        // TODO: Increment n by 1
        n++;

        // TODO: Decrement n by 2
        n -= 2;
        // TODO: Double the resulting value of n
       n *= 2;
        // Print the final value of n
        System.out.println(n);
        int n1 = 0;
        System.out.print(++n1);
        System.out.print(n1++);
        System.out.print(n1++);
    }
}

/* Use of Printf */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        //System.out.println((--num1)+' '+(--num2)+" "+(--num3)+" "+(--num4));
        System.out.printf("%d %d %d %d",--num1,--num2,--num3,--num4);
    }
}
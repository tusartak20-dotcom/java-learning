import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        if ( a > b ){
            System.out.println("TRUE");
        }
        else{
            System.out.println( "FALSE");
        }
        
    }
}



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner to read input from the user.
        Scanner sc = new Scanner(System.in);

        // Read two integer values from the user.
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(String.valueOf(a > b).toUpperCase());
    }
}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        // You can use scanner.nextBoolean() to read a boolean value
        int numberOfCups = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();
        System.out.println((10 <= numberOfCups && numberOfCups <= 20 && !weekend)|| 
                            (15 <= numberOfCups && numberOfCups <= 25 && weekend));
    }
}
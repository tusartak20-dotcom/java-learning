/*Java Code snippet for square, cube and raised to the power 4 */
import java.util.Scanner;

public class Arithmetic{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(n*n);
        System.out.println(n*n*n);
        System.out.println(n*n*n*n);        
    }
}

/*Java code snippet to do basic airthmetic */
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        // TODO: Perform addition, multiplication, and division operations
        int sum = num1 + num2;
        int product = num1 * num2;
        int div = num1/num2;
        System.out.println(sum);
        System.out.println(product);
        System.out.println(div);
    }
}




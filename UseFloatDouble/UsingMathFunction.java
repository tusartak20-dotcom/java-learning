import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double formula = Math.pow(num1, 3)+ Math.pow(num1, 2)+ num1 + 1;
        System.out.println(formula);
    }
}


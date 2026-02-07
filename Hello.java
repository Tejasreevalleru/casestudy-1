import java.util.Scanner;

public class Hello {

    public static int add(int a, int b) {
        return a + b;
    }

    public static String checkEvenOdd(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {

        // 🔹 Case Study-2 daily update line
        System.out.println("Daily update: Case Study 2 change");

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Welcome to Jenkins Java Demo ===");

        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        int sum = add(n1, n2);

        System.out.println("Sum = " + sum);
        System.out.println("First number is " + checkEvenOdd(n1));
        System.out.println("Second number is " + checkEvenOdd(n2));

        System.out.println("Program executed successfully in Jenkins CI/CD 🚀");

        sc.close();
    }
}

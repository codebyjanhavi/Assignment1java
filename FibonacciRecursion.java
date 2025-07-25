import java.util.*;
public class FibonacciRecursion {
    static int fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
	System.out.println("Enter number:");
	int a= sc.nextInt();
        System.out.println("Fibonacci series up to " + a + " a:");
        for (int i = 0; i < a; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
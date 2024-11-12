import java.util.*;
public class Practical1_Fibonacci
{
    public static int recursiveFibonacci(int n)
    {
        if(n <= 1)
        {
            return n;
        }
        return recursiveFibonacci(n-1) + recursiveFibonacci(n-2);
    }
    public static void fibonacci(int n)
        {
            int num1 = 0;
            int num2 = 1;
            System.out.print(num1+ " " +num2);

            for(int i = 2; i <= n; i++)
            {
                int temp = num1 + num2;
                System.out.print(" " +temp);
                num1 = num2;
                num2 = temp;
            }
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(recursiveFibonacci(n));
        fibonacci(n);
    }
}

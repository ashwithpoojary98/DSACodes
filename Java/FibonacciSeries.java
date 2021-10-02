import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int fib1=0;
        int fib2=1;
        int fib3=0;
        System.out.print(fib1+" "+fib2+" ");
        for (int i=2;i<n;i++){
            fib3=fib1+fib2;
            System.out.print(fib3+" ");
            fib1=fib2;
            fib2=fib3;
        }
    }
}

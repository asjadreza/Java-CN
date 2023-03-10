package Recursion;

// facttorial
class Factorial {
    public int fact(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int factSmall = fact(n-1);
        int factorial = n * factSmall;
        return factorial;
    }
}

// sum of first n natural number
class SumOfFirstN {

    public int sumOfFirstN(int n){
        if(n == 1) return 1;
        return sumOfFirstN(n-1) + n;
    }
}

// fibonacci number: find nth fibonacci numbers
class Fibonacci {

    public int fibonacci(int n){
        if(n == 0 || n == 1) return n;

        return fibonacci(n-1) + fibonacci(n-2);
    }
}

// what is the output
class Test {
    public void display(int n){
        if(n < 0){
            return;
        }
        if(n == 0){
            System.out.println(n);
            return;
        }

        display(n--);
        System.out.print(n + " ");
    }

}
public class Recursion {
    public static void main(String[] args) {

        // Factorial fact = new Factorial();
        // int n = 4;
        // int ans = fact.fact(n);
        // System.out.println(ans); 

        // sum of first n natural number
        SumOfFirstN s = new SumOfFirstN();
        int n = 5;
        int ans = s.sumOfFirstN(n);
        System.out.println(ans);
        System.out.println(1 /10);

        // fibonacci
        Fibonacci fib = new Fibonacci();
        System.out.println(fib.fibonacci(7));

        // what is the output
        Test test = new Test();
        test.display(3);

        
    }
}

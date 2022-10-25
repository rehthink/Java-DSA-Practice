package Recursion;

public class FibonacciNumber {
    /*
    *
    * Fibonacci Number - 0,1,1,2,3,5,8,13...
    *
    * */

    public static void main(String[] args) {
        int ans = fibo(60);
        System.out.println(ans);
    }

    static int fibo(int n) {
        if (n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}

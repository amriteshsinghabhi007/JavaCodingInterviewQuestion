package DSA.Recursion;

public class Fibonacci {
    public  int fibnoacciSeries(int n){
        if(n < 0){
            return -1;
        }
        if(n==0 || n ==1){
            return n;
        }
        return fibnoacciSeries(n-1)+fibnoacciSeries(n-2);
    }

    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        System.out.println(fib.fibnoacciSeries(6));
    }
}

package DSA.Recursion;

public class Factorial {

    public int factorialOfInteger(int n){
        if(n<0){
            return -1;
        }
        if (n == 0 || n ==1){
            return 1;
        }
        return n * factorialOfInteger(n-1);
    }
    public static void main(String[] args) {

        Factorial fact = new Factorial();
        System.out.println(fact.factorialOfInteger(4));
    }
}

package DSA.Recursion;

//How to find GCD ( Greatest Common Divisor) of two numbers using recursion
public class GCD {
    public int greatestCommonDivisor(int a, int b){
        if (b == 0){
            return a;
        }
        return greatestCommonDivisor(b,a%b);
    }
    public static void main(String[] args) {
        GCD gcd = new GCD();
        System.out.println(gcd.greatestCommonDivisor(12,8));
    }
}

package DSA.Recursion;

//How to find the sum of digits of a positive integer number using recursion ?
public class SumIntegerNumber {
    public int sumOfPositiveNumber(int n){
        if (n == 0){
            return 0;
        }
        return ((n%10)+sumOfPositiveNumber(n/10));
    }
    public static void main(String[] args) {
        SumIntegerNumber sin = new SumIntegerNumber();
        System.out.println(sin.sumOfPositiveNumber(53));

    }
}

package DSA.Recursion;


//How to calculate power of a number using recursion
public class PowerOfNumber {
    public Double calculatePowerOfNumber(Double base, Double pow){
        if (pow == 0 || pow == 1){
            return 1.0;
        }
        return (base * Math.pow(base , pow-1));
    }
    public static void main(String[] args) {
      PowerOfNumber pon = new PowerOfNumber();
        System.out.println(pon.calculatePowerOfNumber(5.0,3.0));
    }
}

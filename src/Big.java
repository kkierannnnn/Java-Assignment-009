import java.math.BigInteger;

public class Big {
    public static void main(String[] args) {
        displayFactorials();
    }
    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
    public static void displayFactorials() {
        System.out.println("Number\tFactorial");
        for (int i = 0; i <= 30; i++) {
            System.out.println(i + "\t" + factorial(i));
        }
    }
}

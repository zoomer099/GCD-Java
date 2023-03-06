public class GreatestCommonDenominator {
    public static void main(String[] args) {
        System.out.println("The greatest common denominator of 348238 & 4598723 is: "+gcd(348238,4598723));
        System.out.println("The greatest common denominator of 2138148 & 253928 is: "+gcd(2138148, 253928));
    }
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
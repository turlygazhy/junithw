package hw;

public class Utils {
    public String concatenateWords(String a, String b) {
        return a + b;
    }

    public int computeFactorial(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Please provide positive number");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}

import java.util.*;

public class missingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;

        long n = sc.nextLong();
        long expectedSum = (n * (n + 1)) / 2;
        long actualSum = 0;

        for (int i = 0; i < n - 1; i++) {
            actualSum += sc.nextInt();
        }

        System.out.println(expectedSum - actualSum);
    }
}

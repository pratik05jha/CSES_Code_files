import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class increasingArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        long res = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i]) {
                res += arr[i - 1] - arr[i];
                arr[i] = arr[i - 1];
            }
        }
        pw.println(res);

        br.close();
        pw.close();
    }
}
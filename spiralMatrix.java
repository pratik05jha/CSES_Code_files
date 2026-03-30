import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class spiralMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long y = Long.parseLong(st.nextToken()); // row
            long x = Long.parseLong(st.nextToken()); // col

            long ans;
            if (y > x) {
                if (y % 2 == 0) {
                    ans = (y * y) - x + 1;
                } else {
                    ans = (y - 1) * (y - 1) + x;
                }
            } else {
                if (x % 2 != 0) {
                    ans = (x * x) - y + 1;
                } else {
                    ans = (x - 1) * (x - 1) + y;
                }
            }
            pw.println(ans);
        }
        pw.close();
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
//import java.util.StringTokenizer;
public class permutation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int n = Integer.parseInt(br.readLine());
        if(n==2 || n==3){
            pw.println("NO SOLUTION");
        }else {
            for (int i = 2; i <= n; i += 2) {
                pw.print(i + " ");
            }
            for (int i = 1; i <= n; i += 2) {
                pw.print(i + (i + 2 <= n ? " " : "")); // Avoids trailing space
            }
        }
        pw.println();
        pw.close();
    }
}

import java.util.*;
public class repetitions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        int cnt = 1,res = 1;
        for(int i = 1; i<ip.length(); i++){
            if(ip.charAt(i) == ip.charAt(i-1)){
             cnt++;
             res = Math.max(res,cnt);
            }
            else
                cnt = 1;
        }
        System.out.println(res);
    }
}

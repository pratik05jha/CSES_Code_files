import java.util.*;
public class weirdAlgorithm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.print(n + " ");
        while(n!= 1){
            if((n&1)==1){
                n = (n*3) + 1;
                System.out.print(n + " ");
            }else{
                n = n/2;
                System.out.print(n + " ");
            }
        }
    }
}

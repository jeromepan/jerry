import java.math.BigInteger;
import java.util.Scanner;

public class t1 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int dp[][] = new int [30][2];
        for(int i = 0 ; i<dp.length; i++){
            for(int j = 0; j<dp[i].length; j++){
                System.out.print(dp[i][j] + ",");

            }
            System.out.println();
        }
        int n, k;
        n = cin.nextInt();
        k = cin.nextInt();
        dp[1][0] = ((k - 1));
        dp[1][1] = ((0));
        for (int i = 2; i <= n; i++) {
            dp[i][0] = (dp[i - 1][0] + (dp[i-1][1])) * ((k-1));
            System.out.println(dp[i][0]);
            dp[i][1] = (dp[i - 1][0]);
            System.out.println(dp[i-1][0]);
        }
        System.out.println(dp[n][0] + (dp[n][1]));
    }
}
import java.util.Arrays;
public class Longest_Alternating_Subsequence {
    public static int longAlterSubsequence(int[] arr)
    {
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if((arr[i] > arr[j] && i % 2 == 0) || (arr[i] < arr[j] && i % 2 != 0)) {
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
        }
        int maxLength = 0;
        for(int len : dp) {
            maxLength = Math.max(maxLength, len);
        }
        return maxLength;
    }
    public static void main(String[] args)
    {
        int[] arr = {1, 5, 4, 9, 8, 7};
        int length = longAlterSubsequence(arr);
        System.out.println(length);
    }
}

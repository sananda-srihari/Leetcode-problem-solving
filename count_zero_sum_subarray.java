import java.util.HashMap;
import java.util.Scanner;;
public class count_zero_sum_subarray {
    public static int countZeroSumSubarray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = -1;
        int sum = 0;
        int count = 0;
        map.put(0, 1);
        while(i < nums.length-1) {
            i++;
            sum += nums[i];
            
            if(map.containsKey(sum)) {
                count += map.get(sum);
                map.put(sum, map.get(sum)+1);
            } else {
                map.put(sum, 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of size : ");
        int n = sc.nextInt();
        System.out.println("Enter the array elements : ");
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(countZeroSumSubarray(nums));
    }
}

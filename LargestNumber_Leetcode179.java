import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public String largestNumber(int[] nums) {
        String[] numstr = new String[nums.length];
        for(int i=0;i<numstr.length;i++)
        {
            numstr[i] = Integer.toString(nums[i]);
        }
        Comparator<String> cmp = new Comparator<String>() {
            public int compare(String a, String b) {
                String o1 = a + b;
                String o2 = b + a;
                return o2.compareTo(o1);
            }
        };
        Arrays.sort(numstr, cmp);
        if(numstr[0].equals("0")) {
            return "0";
        }
        StringBuilder res = new StringBuilder();
        for(String str : numstr) {
            res.append(str);
        }
        return res.toString();
    }
}

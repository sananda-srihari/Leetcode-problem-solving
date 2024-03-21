class Solution {
    public int firstMissingPositive(int[] nums) {
        int missingNumber = 1;
        Arrays.sort(nums);
        for(int num : nums)
        {
            if(num>0)
            {
                if(num == missingNumber)
                {
                    missingNumber++;
                }
                else if (num > missingNumber){
                    break;
                }
            }
        }
        return missingNumber;
    }
}

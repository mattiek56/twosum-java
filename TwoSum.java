javaimport java.util.Scanner;

public class TwoSum {

    public int[] TwoSum(int[] nums, int target){
        
        int[] final_value = new int[2];
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j< nums.length; j++) {
                if ((nums[i] + nums[j]) == target){
                    final_value[0] = i;
                    final_value[1] = j;
                }
            }
        }
        return final_value;
    }
}

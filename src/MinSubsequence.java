import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinSubsequence {
    public static void main(String[] args) {
        int nums[] = {6};
        MinSubsequence.min(nums);
    }

    private static List<Integer> min(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int sum = 0;
        int temp = 0;
        for(int i : nums){
            sum += i;
        }
        sum /= 2;
        System.out.println(sum);
        Arrays.sort(nums);
        for(int i= nums.length- 1;i >= 0;i --){
            temp += nums[i];
            ans.add(nums[i]);
            if(temp > sum){
                System.out.println(ans);
                return ans;
            }
        }
        return ans;
    }
}

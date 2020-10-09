public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,1};
        SortColors sc = new SortColors();
        sc.sortColors(nums);
    }

    private void sortColors(int[] nums) {
        int p0 = 0;
        int p2 = nums.length - 1;
        int cur = 0;
        int temp;
        while(cur < p2){
            if(nums[cur] == 0){
                temp = nums[cur];
                nums[cur] = nums[p0];
                nums[p0] = temp;
                p0 ++;
                cur ++;
            }else if(nums[cur] == 2){
                temp = nums[cur];
                nums[cur] = nums[p2];
                nums[p2] = temp;
                p2 --;
            }else{
                cur ++;
            }
        }
    }
}

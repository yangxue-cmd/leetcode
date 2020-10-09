import java.lang.reflect.Array;
import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int num[] = {1,2,3,4};
        ProductExceptSelf pp = new ProductExceptSelf();
        pp.product(num);
    }
    public void product(int[]nums){
        int n = nums.length;
        int []ll = new int[n];
        int []rr = new int[n];
        ll[0] = 1;
        rr[n-1] = 1;
        for (int i = 1;i < nums.length;i ++){
            ll[i] = ll[i-1]*nums[i-1];
        }
        for (int i = nums.length - 2;i > -1;i --){
            rr[i] = rr[i+1]*nums[i+1];
        }
        int i = 0;
        while(i < n){
            nums[i] = ll[i]*rr[i];
            i++;
        }
        System.out.println(Arrays.toString(nums));
    }
}

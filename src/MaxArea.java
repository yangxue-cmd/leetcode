public class MaxArea {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        MaxArea a = new MaxArea();
        a.maxArea(height);
    }
    public int maxArea(int[] height){
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while(right > left){
            max = Math.max(max,Math.min(height[left],height[right])*(right - left));
            if(height[left] > height[right]){
                right --;
            }else{
                left ++;
            }
        }
        System.out.println(max);
     return max;
    }
}

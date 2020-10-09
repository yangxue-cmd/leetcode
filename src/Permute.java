import java.util.ArrayList;
import java.util.List;

public class Permute {
    public static void main(String[] args) {
        int[] num = {1,2,3};
        Permute pp = new Permute();
        pp.permute(num);
    }
    List<ArrayList<Integer>> list1= new ArrayList<ArrayList<Integer>>();
    public void permute(int[] nums){
        List<Integer> path = new ArrayList<>();
        back(nums,path);
        System.out.println(list1);
    }
    public void back(int[] nums,List<Integer> path){
        if(path.size() == nums.length){
            list1.add(new ArrayList<>(path));
            return;
        }
        for(int i = 0 ;i< nums.length; i ++){
            if(path.contains(nums[i])){
                continue;
            }
            path.add(nums[i]);
            back(nums,path);
            path.remove(path.size()-1);
        }
    }
}

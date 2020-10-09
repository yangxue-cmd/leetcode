import java.util.Comparator;
import java.util.Map;
import java.util.PriorityQueue;

public class KthLargest {
    private PriorityQueue<Integer> pp;
    private int kk;
    public static void main(String[] args) {
        int k = 3;
        int[] arr = {4,5,8,2};
        KthLargest kthLargest = new KthLargest();
        kthLargest.kthLargest(arr,k);
        System.out.println(kthLargest.add(3));
        System.out.println(kthLargest.add(5));
        System.out.println(kthLargest.add(10));
        System.out.println(kthLargest.add(9));
        System.out.println(kthLargest.add(4));
    }

    private  void kthLargest(int[] arr, int k) {
        kk = k;
        pp = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        for (int i = 0;i < arr.length;i ++){
            add(arr[i]);
        }
    }
    public int add(int val) {
        if(pp.size() < kk){
            pp.add(val);
        }else if(val > pp.peek()){
            pp.poll();
            pp.add(val);
        }
        return pp.peek();
    }
}

//    private PriorityQueue<Integer> PriorityQueue;
//    private int fixed_k;
//
//    // KthLargest 创建一个最小堆，写入k个大的元素
//    public void K(int k, int[] nums) {
//        fixed_k = k;
//        PriorityQueue = new PriorityQueue<>(k);
//        for (int val : nums) add(val);
//    }
//
//    public int add(int val) {
//        // size小于k，直接放入
//        if (PriorityQueue.size() < fixed_k) {
//            PriorityQueue.add(val);
//        } else if (val > PriorityQueue.peek()) {
//            // val大于队首元素，则删除队首 添加val
//            PriorityQueue.poll();
//            PriorityQueue.add(val);
//        }
//        // PriorityQueue中保存k个大的元素，PriorityQueue中队首元素就是第k个元素
//        return PriorityQueue.peek();
//    }
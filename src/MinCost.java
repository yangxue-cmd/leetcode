public class MinCost {
    public static void main(String[] args) {
        int []cost = {1,2,3,4,5};
        String s = "abbaa";
        MinCost.mincost(s,cost);
    }

    private static void mincost(String s, int[] cost) {
        int res = 0;


        int i = 0;
        int len = s.length();
        while(i < len){
            int sum = 0;
            int maxvalue = 0;
            char ch = s.charAt(i);
            while(i < len && s.charAt(i) == ch){
                maxvalue = Math.max(cost[i],maxvalue);
                sum += cost[i];
                i ++;
            }
            res += sum - maxvalue;
        }
        System.out.println(res);
    }
}

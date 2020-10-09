import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindRepeatedDnaSequences {
    public static void main(String[] args) {
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        FindRepeatedDnaSequences ff = new FindRepeatedDnaSequences();
        ff.findRepeatedDnaSequences(s);
    }
    public List<String> findRepeatedDnaSequences(String s) {
        int L = 10;
        int len = s.length();
        HashSet set = new HashSet();
        List<String> l1 = new ArrayList<>();
        for (int i = 0; i < len - L + 1; i++) {
            String s1 = s.substring(i, i + L);
            if (set.contains(s1)) {
                l1.add(s1);
            }
            set.add(s1);
        }
        System.out.println(l1);
        return l1;
    }
}

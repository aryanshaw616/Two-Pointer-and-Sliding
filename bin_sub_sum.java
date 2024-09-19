import java.util.*;
public class bin_sub_sum {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int s = 0, res = 0;
        for (int num : nums) {
            s += num;
            if (map.containsKey(s - goal)) {
                res += map.get(s - goal);
            }
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        return res;
    }
}

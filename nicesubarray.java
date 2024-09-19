import java.util.*;
public class nicesubarray {
      public int numberOfSubarrays(int[] nums, int k) {
        Map<Integer ,Integer>map=new HashMap<>();
        int res=0;
            map.put(0,1);
            int c=0;
            for(int i:nums)
            {
              c+=i%2;
              res+=map.getOrDefault(c-k,0);
              map.put(c,map.getOrDefault(c,0)+1);
            }
            return res;
    }
}

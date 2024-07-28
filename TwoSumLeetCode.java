package tp;

import java.util.HashMap;
import java.util.Map;

class TwoSumLeetCode {
   
    public static void main(String[] args){
    	 TwoSumLeetCode dp = new TwoSumLeetCode();
    	 int[] nums = {2,7,11,15};
    	 int target = 9;
    	int res[] = dp.twoSum(nums, target);
    	if(res != null) {
    		System.out.println(res[0]+" "+res[1]);
    	}else
    		System.out.println("No");
        
    }
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
       for(int i=0; i<nums.length; i++){
              map.put(nums[i],i);
       }

       for(int i=0; i<nums.length;i++){
        int compliment = target - nums[i];
        if(map.containsKey(compliment) && map.get(compliment) != i){
            return new int[] {i,map.get(compliment)};
        }
       }return null;
}
    }

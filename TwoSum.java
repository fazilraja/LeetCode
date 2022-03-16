import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        //we create a empty map, whose key is the number and value is its index in array
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        //find the difference between the target number and an index, if the map contains that number that means
        //that there exists a pair of two sum
        for(int i = 0; i < nums.length; i++) {
            //find difference
            int diff = target - nums[i];
            //if the map contains the othe half of the pair
            if(map.containsKey(diff)){
                //create a array on the spot to save memory and time, return it
                int[] result = {map.get(diff), i};
                return result;
            }
            //add the number and index to the map and go next gg
            map.put(nums[i], i);
        }
        return null;
    }
}

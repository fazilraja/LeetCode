import java.util.ArrayList;
import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        //a hashset can only contain distinct integers, no duplicates
        HashSet<Integer> set = new HashSet<Integer>();

        for (int i : nums) {
            //using add method, if the number is already in the set then it will return false, that means
            //that there is a duplicate, so we return true(! means not, so when add returns false, not false
            //enters the if statement and returns true
            if (!set.add(i)) {
                return true;
            }
        }
        //if never true return false
        return false;
    }
}

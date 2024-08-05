import java.util.*;

class Solution {
    // Function to find common elements in three arrays.
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2, List<Integer> arr3) {
        Set<Integer> set1 = new HashSet<>(arr1);
        Set<Integer> set2 = new HashSet<>(arr2);
        Set<Integer> set3 = new HashSet<>(arr3);

        List<Integer> ans = new ArrayList<>();

        for (Integer num : set1) {
            if (set2.contains(num) && set3.contains(num)) {
                ans.add(num);
            }
        }

        return ans;
    }
}

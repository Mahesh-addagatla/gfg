class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
         ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        // Split the numbers into the pos and neg lists
        for (int num : arr) {
            if (num >= 0) {
                pos.add(num);
            } else {
                neg.add(num);
            }
        }

        // Create a new list to hold the rearranged elements
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;
        
        // Alternate between positive and negative numbers
        while (i < pos.size() && j < neg.size()) {
            ans.add(pos.get(i++));
            ans.add(neg.get(j++));
        }

        // Add remaining positive numbers, if any
        while (i < pos.size()) {
            ans.add(pos.get(i++));
        }

        // Add remaining negative numbers, if any
        while (j < neg.size()) {
            ans.add(neg.get(j++));
        }

        // Copy the rearranged elements back into the original array
        for (int k = 0; k < arr.size(); k++) {
            arr.set(k, ans.get(k));
        }
        
    }
}

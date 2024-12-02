class Solution {

    ArrayList<Integer> search(String pat, String txt) {
        // your code here
        ArrayList<Integer> ans = new ArrayList<>();
        if(txt == null || txt.isEmpty() || pat.length()>txt.length()){
            return ans;
        }
        int index=txt.indexOf(pat);
        while (index!=-1){
            ans.add(index);
            index=txt.indexOf(pat,index+1);
        }
        
        return ans;
    }
}

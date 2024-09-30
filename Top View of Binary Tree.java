class Pair{
    Node node;
    int index;
    Pair(Node node,int index){
        
        this.node = node;
        this.index = index;
    }
}

class Solution {
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root) {
        // add your code
        ArrayList<Integer> ans=new ArrayList<>();
        if(root==null)return ans;
        Map<Integer,Integer> map=new TreeMap<>();
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
             Pair p = q.remove();
           int index = p.index;
           Node temp = p.node;
        //   map mein add kro
        
           if(!map.containsKey(index)){
                map.put(index, temp.data);
            }
           
           if(temp.left != null){
               q.add(new Pair(temp.left,index-1));
           }
           if(temp.right != null){
               q.add(new Pair(temp.right,index+1));
           }
        }
        for(int val:map.values()){
            ans.add(val);
        }
        return ans;
    }
}

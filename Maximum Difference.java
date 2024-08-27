class Solution {
    public int findMaxDiff(int[] arr) {
        // code here
         int n=arr.length;
        int ls[]=new int[n];
        int rs[]=new int[n];
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<n;i++){
            if(stack.isEmpty()){
                ls[i]=0;
                stack.push(arr[i]);
            }else if(stack.peek()<arr[i]){
                ls[i]=stack.peek();
                stack.push(arr[i]);
            }else{
                while(!stack.isEmpty()&&stack.peek()>=arr[i]){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    ls[i]=0;
                }else{
                    
                   ls[i]=stack.peek();
                }
                stack.push(arr[i]);
            }
        }
        stack.clear();
        for(int i=n-1;i>=0;i--){
            if(stack.isEmpty()){
                rs[i]=0;
                stack.push(arr[i]);
            }else if(stack.peek()<arr[i]){
                rs[i]=stack.peek();
                stack.push(arr[i]);
            }else{
                while(!stack.isEmpty()&&stack.peek()>=arr[i]){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    rs[i]=0;
                }else{
                    
                   rs[i]=stack.peek();
                }
               
                stack.push(arr[i]);
            }
        }
        int maxDiff=0;
        for(int i=0;i<n;i++){
            maxDiff=Math.max(maxDiff,Math.abs(ls[i]-rs[i]));
        }
        return maxDiff;
    }
}

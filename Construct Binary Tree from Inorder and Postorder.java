class GfG
{
    //Function to return a tree created from postorder and inoreder traversals.
    Node findnode(int[] in,int[] post,int start,int end, List<Integer> index){
        if(index.get(0)==-1|| start>end)return null;
        int divfact=-1;
        for(int i=start;i<=end;i++){
            if(post[index.get(0)]==in[i]){
                divfact=i;
                break;
            }
        }
        int t=index.get(0);
        Node node=new Node(post[index.get(0)]);
        index.remove(0);
        index.add(t-1);
        node.right=findnode(in,post,divfact+1,end,index);
        node.left=findnode(in,post,start,divfact-1,index);
        return node;
    }
    Node buildTree(int in[], int post[], int n) {
        // Your code here
        List<Integer> index=new ArrayList<>();
        index.add(n-1);
        return findnode(in,post,0,n-1,index);
    }
}

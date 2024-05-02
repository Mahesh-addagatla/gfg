class Tree {
    static int idx;
    public static void preorder(Node root,ArrayList<Integer> arr){
        if(root==null){
            arr.add(-1);
            return ;
        }
        arr.add(root.data);
        preorder(root.left,arr);
        preorder(root.right,arr);
    }
    // Function to serialize a tree and return a list containing nodes of tree.
    public ArrayList<Integer> serialize(Node root) {
        // code here
        ArrayList<Integer> a=new ArrayList<>();
        preorder(root,a);
        return a;
    }
    public static Node create(ArrayList<Integer> arr){
        idx++;
        if(arr.get(idx)==-1)return null;
        Node newNode=new Node(arr.get(idx));
        newNode.left=create(arr);
        newNode.right=create(arr);
        return newNode;
    }
    // Function to deserialize a list and construct the tree.
    public Node deSerialize(ArrayList<Integer> A) {
        // code here
        idx=-1;
        Node root=create(A);
        return root;
    }
};

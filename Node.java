
    public  class Node {
        int value;
        Node left;
        Node right;
        public Node(){

        }
        public Node(int value) {
            this.value = value;
            right = null;
            left = null;
        }
    
    //Method Add Node
    public static Node AddNode(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        if (value < current.value) {
            current.left = AddNode(current.left, value);
        } else if (value > current.value) {
            current.right = AddNode(current.right, value);
        } else {
            return current;
        }
        return current;
    }
    //In ra value
    public static void Println(Node node) {
        if (node != null) {
            Println(node.left);
            System.out.print(" " + node.value);
            Println(node.right);
        }
    }
    
    public static void main(String[] args) {
        //Khoi tao root bang null
        Node root = null;
        int[] ds1 = {1,4,6,9,11,2,7,3,8};
        int[] ds2 = {1,3,2,4,5,10,11,6};
        int k = ds1.length;
        for(int i=0; i<k; i++) {
            root = root.AddNode( root,ds1[i] );
        }
        int l = ds2.length;
        for(int j=0; j<l; j++) {
            root = root.AddNode( root,ds2[j] );
        }
        root.Println(root);
    }

}
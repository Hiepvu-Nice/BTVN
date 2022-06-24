import java.util.Scanner;
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
        Scanner input = new Scanner(System.in);
        //Khoi tao root bang null
        Node root = null;
        
        while(true){
            System.out.println("1. Du lieu VD");
            System.out.println("2. Du lieu nhap tay");
        int luachon = input.nextInt();
        if (luachon == 1)
        {
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
        System.out.print("Danh sach kq:");
        root.Println(root);
        }
        else if (luachon == 2)
        {
        int[] ds1 = new int[100];
        System.out.println("Nhap so phan tu cua ds1:");
        int n1 = input.nextInt();
        for(int i=0; i<n1;i++){
            ds1[i]=input.nextInt();
            root = root.AddNode( root,ds1[i] );
        }
        int[] ds2 = new int[100];

        System.out.println("Nhap so phan tu cua ds2:");
        int n2 = input.nextInt();
        for(int j=0; j<n2;j++){
            ds2[j]=input.nextInt();
            root = root.AddNode( root,ds2[j] );
        }

        System.out.print("Danh sach kq:");
        root.Println(root);
        }
        break;
    }
  }
}

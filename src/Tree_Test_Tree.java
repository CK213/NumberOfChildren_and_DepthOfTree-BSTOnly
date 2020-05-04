public class Tree_Test_Tree {
    private Tree_Test_Node root;
    private int val;

    public static Tree_Test_Node search(int x, Tree_Test_Node n){
        if (n==null || n.getData()==x)
            return n;
        else if(n.getData() > x)
            return search(x,n.getLeft());
        else
            return search(x,n.getRight());
    }

    //method to find the minimum value in a tree
    public static Tree_Test_Node findMin(Tree_Test_Node root){
        if(root==null)
            return null;
        else if (root.getLeft() != null)
            return findMin(root.getLeft());
        return root;
    }

    // method to insert a new Tree_Test_Node
    public static Tree_Test_Node insert(Tree_Test_Node root, int x){
        if (root == null)
            return new Tree_Test_Node(x);

        // x is greater. Should be inserted to right
        else if(x>root.getData())
            root.setRight(insert(root.getRight(),x));

        // x is smaller should be inserted to left
        else
            root.setLeft(insert(root.getLeft(),x));
        return root;
    }

    // method to delete a Tree_Test_Node
    public static Tree_Test_Node delete(Tree_Test_Node root, int x){

        //searching for the item to be deleted
        if(root==null)
            return null;
        if (x>root.getData())
            root.setRight(delete(root.getRight(), x));
        else if(x<root.getData())
            root.setLeft(delete(root.getLeft(), x));
        else
        {
            //No Children
            if(root.getLeft()==null && root.getRight()==null)
            {
                root = null;
                return null;
            }

            //One Child
            else if(root.getLeft()==null || root.getRight()==null)
            {
                Tree_Test_Node temp;
                if(root.getLeft()==null)
                    temp = root.getRight();
                else
                    temp = root.getLeft();
                root = null;
                return temp;
            }

            //Two Child
            else
            {
                Tree_Test_Node temp = findMin(root.getRight());
                root.setData(temp.getData());
                root.setRight(delete(root.getRight(), temp.getData()));
            }
        }
        return root;
    }

    public static void inorder(Tree_Test_Node root) {

        // checking if the root is not null
        if (root != null) {

            // visiting left child
            inorder(root.getLeft());

            // printing data at root
            System.out.print(" " + root.getData() + " ");

            // visiting right child
            inorder(root.getRight());
        }
    }
}

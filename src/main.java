public class main{
    public static void main(String[] args){
        Tree_Test_Node root;
        root = new Tree_Test_Node(20);
        Tree_Test_Tree.insert(root, 5);
        Tree_Test_Tree.insert(root, 1);
        Tree_Test_Tree.insert(root, 15);
        Tree_Test_Tree.insert(root, 9);
        Tree_Test_Tree.insert(root, 7);
        Tree_Test_Tree.insert(root, 12);
        Tree_Test_Tree.insert(root, 30);
        Tree_Test_Tree.insert(root, 25);
        Tree_Test_Tree.insert(root, 40);
        Tree_Test_Tree.insert(root, 45);
        Tree_Test_Tree.insert(root, 42);

        Tree_Test_Tree.inorder(root);
        System.out.println("");
    }
}

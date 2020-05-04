public class Tree_Test_Node {
    private int data;
    private Tree_Test_Node parent;
    private Tree_Test_Node left;
    private Tree_Test_Node right;

    public Tree_Test_Node(int element){
        data = element;
        left = null;
        right = null;
    }

    public Tree_Test_Node getLeft() {
        return left;
    }

    public Tree_Test_Node getParent() {
        return parent;
    }

    public Tree_Test_Node getRight() {
        return right;
    }

    public int getData() {
        return data;
    }

    public void setParent(Tree_Test_Node parent) {
        this.parent = parent;
    }

    public void setLeft(Tree_Test_Node left) {
        this.left = left;
    }

    public void setRight(Tree_Test_Node right) {
        this.right = right;
    }

    public void setData(int data) {
        this.data = data;
    }
}

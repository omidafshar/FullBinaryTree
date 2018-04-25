/**
 * Job: Understands a node in a binary tree.
 */
public class Node {


    private Node leftChild = null;

    private Node rightChild = null;

    public void setLeftChild(Node left) {
        leftChild = left;
    }

    public void setRightChild(Node right) {
        rightChild = right;
    }

    public static boolean isFullBinaryTree(Node n) {
        if (n == null) return true;
        if (n.leftChild == null) return n.rightChild == null;
        return n.rightChild != null && isFullBinaryTree(n.leftChild) && isFullBinaryTree(n.rightChild);
    }
}

/**
 * Job: Understands a node in a binary tree.
 */
public class Node {


    private Node leftChild;

    private Node rightChild;

    public Node(Node left, Node right) {
        leftChild = left;
        rightChild = right;
    }

    public static boolean isFullBinaryTree(Node n) {
        if (n == null) return true;
        if (n.leftChild == null) return n.rightChild == null;
        return n.rightChild != null && isFullBinaryTree(n.leftChild) && isFullBinaryTree(n.rightChild);
    }
}

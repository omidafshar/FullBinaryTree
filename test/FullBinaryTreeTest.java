import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by omidafshar on 4/24/18.
 */
public class FullBinaryTreeTest {

    @Test
    public void nullNodeIsFullBinaryTree() {
        assertTrue(Node.isFullBinaryTree(null));
    }

    @Test
    public void nodeWithZeroChildrenIsFullBinaryTree() {
        Node n = new Node();
        assertTrue(Node.isFullBinaryTree(n));
    }

    @Test
    public void nodeWithOneChildIsNotFullBinaryTree() {
        Node n = new Node();
        Node left = new Node();
        n.setLeftChild(left);
        assertFalse(Node.isFullBinaryTree(n));
    }

    @Test
    public void nodeWithTwoChildrenIsFullBinaryTree() {
        Node n = new Node();
        Node left = new Node();
        Node right = new Node();
        n.setLeftChild(left);
        n.setRightChild(right);
        assertTrue(Node.isFullBinaryTree(n));
    }

    @Test
    public void childNodeWithOneChildIsNotFullBinaryTree() {
        Node n = new Node();
        Node left = new Node();
        Node right = new Node();
        Node grandchild = new Node();
        n.setLeftChild(left);
        n.setRightChild(right);
        left.setLeftChild(grandchild);
        assertFalse(Node.isFullBinaryTree(n));
    }
}

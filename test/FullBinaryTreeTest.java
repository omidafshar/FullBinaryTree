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
    public void leftNodeWithOneLeftChildIsNotFullBinaryTree() {
        Node n = new Node();
        Node left = new Node();
        Node right = new Node();
        Node grandchild = new Node();
        n.setLeftChild(left);
        n.setRightChild(right);
        left.setLeftChild(grandchild);
        assertFalse(Node.isFullBinaryTree(n));
    }

    @Test
    public void leftNodeWithOneRightChildIsNotFullBinaryTree() {
        Node n = new Node();
        Node left = new Node();
        Node right = new Node();
        Node grandchild = new Node();
        n.setLeftChild(left);
        n.setRightChild(right);
        left.setRightChild(grandchild);
        assertFalse(Node.isFullBinaryTree(n));
    }

    @Test
    public void leftNodeWithTwoChildrenIsFullBinaryTree() {
        Node n = new Node();
        Node left = new Node();
        Node right = new Node();
        Node grandchildLeft = new Node();
        Node grandchildRight = new Node();
        n.setLeftChild(left);
        n.setRightChild(right);
        left.setLeftChild(grandchildLeft);
        left.setRightChild(grandchildRight);
        assertTrue(Node.isFullBinaryTree(n));
    }

    @Test
    public void rightNodeWithOneLeftChildIsNotFullBinaryTree() {
        Node n = new Node();
        Node left = new Node();
        Node right = new Node();
        Node grandchild = new Node();
        n.setLeftChild(left);
        n.setRightChild(right);
        right.setLeftChild(grandchild);
        assertFalse(Node.isFullBinaryTree(n));
    }

    @Test
    public void rightNodeWithOneRightChildIsNotFullBinaryTree() {
        Node n = new Node();
        Node left = new Node();
        Node right = new Node();
        Node grandchild = new Node();
        n.setLeftChild(left);
        n.setRightChild(right);
        right.setRightChild(grandchild);
        assertFalse(Node.isFullBinaryTree(n));
    }

    @Test
    public void rightNodeWithTwoChildrenIsFullBinaryTree() {
        Node n = new Node();
        Node left = new Node();
        Node right = new Node();
        Node grandchildLeft = new Node();
        Node grandchildRight = new Node();
        n.setLeftChild(left);
        n.setRightChild(right);
        right.setLeftChild(grandchildLeft);
        right.setRightChild(grandchildRight);
        assertTrue(Node.isFullBinaryTree(n));
    }

    @Test
    public void leftChildNodeFullRightNotFullIsNotFullBinaryTree() {
        Node n = new Node();
        Node left = new Node();
        Node right = new Node();
        Node leftgrandchildLeft = new Node();
        Node leftgrandchildRight = new Node();
        Node rightgrandchildLeft = new Node();
        n.setLeftChild(left);
        n.setRightChild(right);
        left.setLeftChild(leftgrandchildLeft);
        left.setRightChild(leftgrandchildRight);
        right.setLeftChild(rightgrandchildLeft);
        assertFalse(Node.isFullBinaryTree(n));
    }

    @Test
    public void rightChildNodeFullLeftNotFullIsNotFullBinaryTree() {
        Node n = new Node();
        Node left = new Node();
        Node right = new Node();
        Node leftgrandchildLeft = new Node();
        Node rightgrandchildLeft = new Node();
        Node rightgrandchildRight = new Node();
        n.setLeftChild(left);
        n.setRightChild(right);
        left.setLeftChild(leftgrandchildLeft);
        right.setLeftChild(rightgrandchildLeft);
        right.setRightChild(rightgrandchildRight);
        assertFalse(Node.isFullBinaryTree(n));
    }

    @Test
    public void bothChildNodesFullIsFullBinaryTree() {
        Node n = new Node();
        Node left = new Node();
        Node right = new Node();
        Node leftgrandchildLeft = new Node();
        Node leftgrandchildRight = new Node();
        Node rightgrandchildLeft = new Node();
        Node rightgrandchildRight = new Node();
        n.setLeftChild(left);
        n.setRightChild(right);
        left.setLeftChild(leftgrandchildLeft);
        left.setRightChild(leftgrandchildRight);
        right.setLeftChild(rightgrandchildLeft);
        right.setRightChild(rightgrandchildRight);
        assertTrue(Node.isFullBinaryTree(n));
    }
}

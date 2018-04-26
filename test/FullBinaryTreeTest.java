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
        Node n = new Node(null, null);
        assertTrue(Node.isFullBinaryTree(n));
    }

    @Test
    public void nodeWithOneChildIsNotFullBinaryTree() {
        Node left = new Node(null, null);
        Node n = new Node(left, null);
        assertFalse(Node.isFullBinaryTree(n));
    }

    @Test
    public void nodeWithTwoChildrenIsFullBinaryTree() {
        Node left = new Node(null, null);
        Node right = new Node(null, null);
        Node n = new Node(left, right);
        assertTrue(Node.isFullBinaryTree(n));
    }

    @Test
    public void leftNodeWithOneLeftChildIsNotFullBinaryTree() {
        Node grandchild = new Node(null, null);
        Node left = new Node(grandchild, null);
        Node right = new Node(null, null);
        Node n = new Node(left, right);
        assertFalse(Node.isFullBinaryTree(n));
    }

    @Test
    public void leftNodeWithOneRightChildIsNotFullBinaryTree() {
        Node grandchild = new Node(null, null);
        Node left = new Node(null, grandchild);
        Node right = new Node(null, null);
        Node n = new Node(left, right);
        assertFalse(Node.isFullBinaryTree(n));
    }

    @Test
    public void leftNodeWithTwoChildrenIsFullBinaryTree() {
        Node grandchildLeft = new Node(null, null);
        Node grandchildRight = new Node(null, null);
        Node left = new Node(grandchildLeft, grandchildRight);
        Node right = new Node(null, null);
        Node n = new Node(left, right);
        assertTrue(Node.isFullBinaryTree(n));
    }

    @Test
    public void rightNodeWithOneLeftChildIsNotFullBinaryTree() {
        Node grandchild = new Node(null, null);
        Node left = new Node(null, null);
        Node right = new Node(grandchild, null);
        Node n = new Node(left, right);
        assertFalse(Node.isFullBinaryTree(n));
    }

    @Test
    public void rightNodeWithOneRightChildIsNotFullBinaryTree() {
        Node grandchild = new Node(null, null);
        Node left = new Node(null, null);
        Node right = new Node(null, grandchild);
        Node n = new Node(left, right);
        assertFalse(Node.isFullBinaryTree(n));
    }

    @Test
    public void rightNodeWithTwoChildrenIsFullBinaryTree() {
        Node grandchildLeft = new Node(null, null);
        Node grandchildRight = new Node(null, null);
        Node left = new Node(null, null);
        Node right = new Node(grandchildLeft, grandchildRight);
        Node n = new Node(left, right);
        assertTrue(Node.isFullBinaryTree(n));
    }

    @Test
    public void leftChildNodeFullRightNotFullIsNotFullBinaryTree() {
        Node leftgrandchildLeft = new Node(null, null);
        Node leftgrandchildRight = new Node(null, null);
        Node rightgrandchildLeft = new Node(null, null);
        Node left = new Node(leftgrandchildLeft, leftgrandchildRight);
        Node right = new Node(rightgrandchildLeft, null);
        Node n = new Node(left, right);
        assertFalse(Node.isFullBinaryTree(n));
    }

    @Test
    public void rightChildNodeFullLeftNotFullIsNotFullBinaryTree() {
        Node rightgrandchildLeft = new Node(null, null);
        Node rightgrandchildRight = new Node(null, null);
        Node leftgrandchildLeft = new Node(null, null);
        Node left = new Node(leftgrandchildLeft, null);
        Node right = new Node(rightgrandchildLeft, rightgrandchildRight);
        Node n = new Node(left, right);
        assertFalse(Node.isFullBinaryTree(n));
    }

    @Test
    public void bothChildNodesFullIsFullBinaryTree() {
        Node leftgrandchildLeft = new Node(null, null);
        Node leftgrandchildRight = new Node(null, null);
        Node rightgrandchildLeft = new Node(null, null);
        Node rightgrandchildRight = new Node(null, null);
        Node left = new Node(leftgrandchildLeft, leftgrandchildRight);
        Node right = new Node(rightgrandchildLeft, rightgrandchildRight);
        Node n = new Node(left, right);
        assertTrue(Node.isFullBinaryTree(n));
    }
}

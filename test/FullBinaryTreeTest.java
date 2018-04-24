import org.junit.Test;

import static org.junit.Assert.assertTrue;

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
}

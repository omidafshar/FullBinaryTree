import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by omidafshar on 4/24/18.
 */
public class FullBinaryTreeTest {

    @Test
    public void nullBinaryTreeIsFullBinaryTree() {
        assertTrue(Node.isFullBinaryTree(null));
    }
}

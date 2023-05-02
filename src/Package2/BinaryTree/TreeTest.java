package Package2.BinaryTree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TreeTest {

    Tree createTree() {
        Tree tree = new Tree();
        int[] numbers = {2, 32, 0, -44, 5, 10, -50, -23};

        for (int number : numbers) {
            tree.put(number);
        }

        return tree;
    }
    @Test
    void print() {
    }

    @Test
    void tree_ROOT_NO_NULL() {
        Tree tree = createTree();
        Assertions.assertNotNull(tree.root());
    }
}
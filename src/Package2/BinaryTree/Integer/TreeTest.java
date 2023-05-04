package Package2.BinaryTree.Integer;

import org.junit.jupiter.api.Test;

import java.util.Random;

class TreeTest {

    Tree createTree() {
        Tree tree = new Tree();
//        int[] numbers = {2, 32, 0, -44, 5, 10, -50, -23};
        Random random = new Random();
        for (int i = 0; i < random.nextInt(20); i++) {
            tree.put(random.nextInt(-100, 100));
        }

        System.out.println("Tree size=" + tree.size());
        return tree;
    }

    @Test
    void printReverseOrder() {
        Tree tree = createTree();
        tree.printReverseOrder(tree.root());
    }

    @Test
    void printNaturalOrder() {
        Tree tree = createTree();
        tree.printNaturalOrder(tree.root());
    }

    @Test
    void tree_GET_ROOT() {
        Tree tree = createTree();
        System.out.println(tree.root());
    }
}
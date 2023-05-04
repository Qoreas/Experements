package Package2.BinaryTree.Integer;

public class Tree {
    private Node root;
    private int size;

    public int size() {
        return size;
    }

    public Node root() {
        return root;
    }

    // ���������, �������������� ������� ������
    private static class Node {
        private int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    '}';
        }
    }

    // ���������� �������� � ������������ ������
    public void put(int value) {
        Node elem = new Node(value);

        if (root == null) {
            root = elem;
            size++;
            return;
        }

        putHelper(root, elem);
        size++;
    }

    private void putHelper(Node current, Node elem) {
        if (current.value > elem.value) {
            if (current.left == null) current.left = elem;
            else putHelper(current.left, elem);
        } else {
            if (current.right == null) current.right = elem;
            else putHelper(current.right, elem);
        }
    }


    // ������ ������ �� �������� ����
    public void printNaturalOrder(Node current) {
        if (current.left != null) printNaturalOrder(current.left);
        System.out.println("Value=" + current.value + " ");
        if (current.right != null) printNaturalOrder(current.right);
    }

    public void printReverseOrder(Node current) {
        if (current.right != null) printReverseOrder(current.right);
        System.out.println("Value=" + current.value + " ");
        if (current.left != null) printReverseOrder(current.left);
    }
}

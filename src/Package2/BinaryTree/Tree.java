package Package2.BinaryTree;

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
    }

    // ���������� �������� � ������������ ������
    public void put(int value) {
        Node elem = new Node(value);

        if (root == null) {
            root = elem;
            size++;
            return;
        }

        if (root.value > elem.value) {
            if (root.left == null) root.left = elem;



        } else {

        }
        size++;
    }

    // ������ ������ �� �������� ����
    public void print(Node current) {
        if (current.left != null) print(current.left);
        System.out.println("Value=" + current + " ");
        if (current.right != null) print(current.right);
    }
}

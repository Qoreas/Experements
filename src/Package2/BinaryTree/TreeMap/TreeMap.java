package Package2.BinaryTree.TreeMap;

public class TreeMap<K, V> {
    private Node<K, V> root;
    private int size;

    public int size() {
        return size;
    }

    public Node<K, V> root() {
        return root;
    }

    // Структура, представляющая элемент дерева
    private static class Node<K, V> {
        private K key;
        private V value;
        Node<K, V> left;
        Node<K, V> right;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    '}';
        }
    }

    // Добавление элемента в передаваемое дерево
    public void put(K key, V value) {
            if (root == null) {
            root = new Node<>(key, value);
            size++;
            return;
        }

        putHelperRecursive(root, key, value);
        size++;
    }

    private void putHelperRecursive(Node<K, V> current, K key, V value) {
        Comparable<? super K> k = (Comparable<? super K>) key;
        int cmp = k.compareTo(current.key);
        if (cmp < 0) {
            if (current.left == null) current.left = new Node<>(key, value);
            else putHelperRecursive(current.left, key, value);
        } else if (cmp > 0){
            if (current.right == null) current.right = new Node<>(key, value);
            else putHelperRecursive(current.right, key, value);
        }
    }

//    public void remove()

    // Печать дерева от элемента вниз
    public void printValuesNaturalOrder(Node<K, V> current) {
        if (current.left != null) printValuesNaturalOrder(current.left);
        System.out.println("Value=" + current.value + " ");
        if (current.right != null) printValuesNaturalOrder(current.right);
    }

    public void printValuesReverseOrder(Node<K, V> current) {
        if (current.right != null) printValuesReverseOrder(current.right);
        System.out.println("Value=" + current.value + " ");
        if (current.left != null) printValuesReverseOrder(current.left);
    }

    public void printKeysNaturalOrder(Node<K, V> current) {
        if (current.left != null) printKeysNaturalOrder(current.left);
        System.out.println("Value=" + current.key + " ");
        if (current.right != null) printKeysNaturalOrder(current.right);
    }

    public void printKeysReverseOrder(Node<K, V> current) {
        if (current.right != null) printKeysReverseOrder(current.right);
        System.out.println("Value=" + current.key + " ");
        if (current.left != null) printKeysReverseOrder(current.left);
    }
}

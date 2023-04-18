package Package2.CreateLinkedListV1;

public class LinkedList_demo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println(list.size());

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        System.out.println(list.size());

        System.out.println("LL = " + list);

        System.out.println("Index of 5 = " + list.get(5));

        list.remove(2);
        System.out.println("LL remove 2 = " + list);

        list.addFirst(44);
        System.out.println("LL = " + list);

    }
}

package Package2.LinkedMap_ex;

import java.util.LinkedList;

public class T1_create {
    public static void main(String[] args) {
        String str1 = "Hello World!";
        String str2 = "My name is Earl";
        String str3 = "I love Java";
        String str4 = "I live in Moscow";

        LinkedList<String> list = new LinkedList<>();
        list.add(str1);
        list.add(str2);
        list.add(str3);
        list.add(1, str4);

        System.out.println(list);
    }
}

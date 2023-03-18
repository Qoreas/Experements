package Package2.Map.HashMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class T3_forEach {
    public static void main(String[] args) {
        HashMap<Integer, String> passportsAndNames = new HashMap<>();
        passportsAndNames.put(212133, "����� ���������� ���������");
        passportsAndNames.put(162348, "���� ���������� ����������");
        passportsAndNames.put(8082771, "������� ���� �����");

        for (Entry entry : passportsAndNames.entrySet()) {
            System.out.println(entry);
        }

        System.out.println();

        passportsAndNames.entrySet().forEach(System.out::println);
    }
}

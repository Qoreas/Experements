package Package2.Map.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class T1 {
    public static void main(String[] args) {
        HashMap<Integer, String> passAndName = new HashMap<>();

        passAndName.put(212133, "����� ���������� ���������");
        passAndName.put(162348, "���� ���������� ����������");
        passAndName.put(8082771, "������� ���� �����");
//        passAndName.put(8082771, "�������");
        System.out.println(passAndName);

//        String lidiaName = passAndName.get(212133);
//        System.out.println(lidiaName);
//
//        passAndName.remove(162348);
//        System.out.println(passAndName);

        System.out.println(passAndName.containsValue("������� ���� �����"));

        Set<Integer> keys = passAndName.keySet();
        System.out.println(keys);

        ArrayList<String> values = new ArrayList<>(passAndName.values());
        System.out.println(values);
    }
}

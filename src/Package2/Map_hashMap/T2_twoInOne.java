package Package2.Map_hashMap;

import java.util.HashMap;

public class T2_twoInOne {
    public static void main(String[] args) {
        HashMap<Integer, String> passportsAndNames = new HashMap<>();
        HashMap<Integer, String> passportsAndNames2 = new HashMap<>();

        passportsAndNames.put(212133, "����� ���������� ���������");
        passportsAndNames.put(162348, "���� ���������� ����������");
        passportsAndNames.put(8082771, "������� ���� �����");

        passportsAndNames2.put(917352, "������� ��������� �������");
        passportsAndNames2.put(925648, "������ �������� �������");

        passportsAndNames.putAll(passportsAndNames2);
        System.out.println(passportsAndNames);
    }
}

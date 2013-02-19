package org.SCJP.Accessmodifiers;

public class Test {

    public static void main(String[] args) {
        double temp = Math.random();
        if (temp < 0.5) {
            System.out.println("left");
        } else {
            System.out.println("right");
        }
    }

}

class A {
    protected int x;

    protected void f() {
    }

    protected static String name = "Ku-Ku";
}

class B extends A {
    public void someFunc() {
        x = 10; // ������ � ���������� ����� ������������ ������
        f();
        A ref = new A();
        ref.x = 13; // � ��������� ��������� ������ ��������� � ���������
                    // ������ ��� � ���������
        @SuppressWarnings("unused")
        String bebe = A.name; // ����������� ���������� - �� ����������
    }
}

class C {
    @SuppressWarnings("unused")
    public void someFunc() {
        String mmm = A.name; // �������� �����. ���������� name - �������� � ��
                             // ����� ����� (������ ���� ����� � ���������
                             // � ������ ������. ���� ����� � ��������� � ��� ��
                             // ������, ��� � �, �� ����� ��������)
        A a = new A();
        int myX = a.x; // �������� �����. ���������� x - �� ����� ����� (������
                       // ���� ����� � ��������� � ������ ������. ����
                       // ����� � ��������� � ��� �� ������, ��� � �, �� �����
                       // ��������)
        a.x = 1; // �������� �����. ���������� x - �� ����� ����� (������ ����
                 // ����� � ��������� � ������ ������. ���� ����� �
                 // ��������� � ��� �� ������, ��� � �, �� ����� ��������)}}
        a.f(); // �������� �����. ������� f - �� ����� ����� (������ ���� �����
               // � ��������� � ������ ������. ���� ����� � ���������
               // � ��� �� ������, ��� � �, �� ����� ��������)}}
    }
}
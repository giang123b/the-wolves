package L5;

import java.util.Scanner;

public class Bai4IF {
    public static boolean check(int a, int b, int c) {
        if (a + b <= c || a + c <= b || b + c <= a) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap 3 canh cua tam giac: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (check(a, b, c)) {

            if (a == b && a == c && b == c) System.out.println("La tam giac deu");
            else if (a == b) {
                if (a * a + b * b == c * c) System.out.println("La tam giac vuong can");
                else System.out.println("La tam giac can");
            } else if (a == c) {
                if (a * a + c * c == b * b) System.out.println("La tam giac vuong can");
                else System.out.println("La tam giac can");
            } else if (c == b) {
                if (c * c + b * b == a * a) System.out.println("La tam giac vuong can");
                else System.out.println("La tam giac can");
            } else if (c * c + b * b == a * a) System.out.println("La tam giac vuong");
            else if (a * a + b * b == c * c) System.out.println("La tam giac vuong");
            else if (a * a + c * c == b * b) System.out.println("La tam giac vuong");
            else System.out.println("La tam giac thuong");
        } else System.out.println("Khong phai tam giac");
    }
}

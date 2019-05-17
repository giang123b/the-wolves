package L5;

import java.util.Scanner;

public class Bai5 {
    public static boolean check(int a, int b, int c) {
        if (a + b <= c || a + c <= b || b + c <= a) return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.printf("Nhap do dai cua 3 doan thang: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (check(a, b, c)){
            int ncv = (a + b + c) / 2;
            double x = Math.sqrt(ncv * (ncv - a)* (ncv - b)* (ncv - c));
            System.out.printf("Hinh tam giac co dien tich: %-10.2f", x);
        }
        else System.out.println("Khong phai tam giac");
    }
}

package L5;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        System.out.printf("Nhap 4 so a, b, c, d: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println("So lon nhat la: " + Math.max(Math.max(a, b), Math.max(c, d)));
    }
}

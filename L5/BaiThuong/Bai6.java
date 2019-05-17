package L5;

import javafx.util.Pair;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
//        Pair <Integer, Integer> p = new Pair<Integer, Integer>(1, 2);
//        System.out.printf("so phia truoc: " + p.getKey());
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap toan do diem x: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.printf("Nhap toan do diem y: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        double dd = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        System.out.printf("Khoang cach giua 2 diem la: %.2f", dd);
    }
}

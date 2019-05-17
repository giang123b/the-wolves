package L5;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Bai2IF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap 1 ngay trong thang 3 nam 2008: ");
        int n = sc.nextInt();
        int du = n%7;
        if (n%7 == 1) System.out.println("Thu 7");
        if (n%7 == 2) System.out.println("Chu Nhat");
        if (n%7 == 3) System.out.println("Thu 2");
        if (n%7 == 4) System.out.println("Thu 3");
        if (n%7 == 5) System.out.println("Thu 4");
        if (n%7 == 6) System.out.println("Thu 5");
        if (n%7 == 0) System.out.println("Thu 6");
//        if (n%7 == 6) System.out.println("Thu 7");
    }

}

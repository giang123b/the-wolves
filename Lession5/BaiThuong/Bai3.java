package L5;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        System.out.println("Nhap nam: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%400 == 0 || (n%4 == 0 && n%100 != 0)) System.out.println("Nam " + n + " co 366 ngay");
        else System.out.println("Nam " + n + " co 365 ngay");
    }
}

package L5;

import java.util.Scanner;

public class Bai3IF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap so luong dien: ");
        int a = sc.nextInt();
        if (a <= 50) System.out.println("So tien la: " + (a * 550) + " VND");
        if (a > 50 && a <= 100) System.out.println("So tien la: " + (50* 550 + (a - 50) * 850) + " VND");
        if (a > 100 && a <= 200) System.out.println("So tien la: " + (50 * 550 + 50 * 850 + (a-100)*1200) + " VND");
        if (a > 200) System.out.println("So tien la: " + (50 * 550 + 50 * 850 + 100*1200 + (a-200)*1500) + " VND");
    }
}

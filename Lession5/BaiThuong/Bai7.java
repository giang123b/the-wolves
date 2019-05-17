package L5;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap toan do diem x: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        double dd = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
        //System.out.println(dd);
        if(dd <= 1) System.out.println("Co thuoc hinh trong");
        else System.out.println("Khong thuoc hinh tron");
    }
}

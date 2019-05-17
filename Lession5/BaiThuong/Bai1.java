package L5;

import java.util.Scanner;

//Viết chương trình giải phương trình bậc nhất
public class Bai1 {
    public static void main(String[] args) {
        System.out.printf("Nhap so a,b: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a == 0 && b == 0)
            System.out.println("Phuong trinh vo so nghiem");
        else if (a == 0 && b!=0)
            System.out.println("Phuong trinh vo nghiem");
        else System.out.println("Nghiem la: " + (double)b/a);
    }

}

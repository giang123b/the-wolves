package L5;

import java.util.Scanner;

public class Bai2 {
    public static void GiaiPTBac2(double a, double b, double c) {
        if(a == 0){
            if(b == 0 && c == 0)
                System.out.println("Phuong trinh vo so nghiem");
            else if(b != 0 && c != 0){
                System.out.println("Nghiep cua phuong trinh la: " + (double)c/b);
            }
            else System.out.println("Phuong trinh vo nghiem");
        }
        else{
            double denta = b*b-4*a*c;
            if(denta < 0) System.out.println("Phuong trinh vo nghiem");
            else if(denta == 0){
                System.out.println("Phuong trinh co nghiem kep: x1 = x2 = " + (double)-b/2*a);
            }
            else {
                System.out.println("Phuong trinh co 2 nghiem: ");
                System.out.println("x1 = " + (double)(-b - Math.sqrt(denta)) / (2*a));
                System.out.println("x2 = " + (double)(-b + Math.sqrt(denta)) / (2*a));
            }
        }
    }
    public static void main(String[] args) {
        System.out.printf("Nhap a, b, c cua phuong trinh ax^2 + bx + c = 0: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        GiaiPTBac2(a, b, c);
    }
}

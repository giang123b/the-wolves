package bai_2;

import java.util.Scanner;

public class If {
    public static void main(String... args) {
        bai1();
        bai2();
        bai3();
        bai4();
    }

    public static void bai1() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap bieu thuc: ");
        String s = input.nextLine();
        int a = s.charAt(0), b = s.charAt(1);
        char c = s.charAt(2);
        if (Character.toString(c).equals("+")) System.out.println("Ket qua la: " + (a-48 + b-48));
        else if (Character.toString(c).equals("-")) System.out.println("Ket qua la: " + (a-48 - b-48));
        else if (Character.toString(c).equals("*")) System.out.println("Ket qua la: " + (a-48) * (b-48));
        else System.out.println("Ket qua la: " + (double) (a-48) / (b-48));
    }
    public static void bai2()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ngay trong thang 3: ");
        int n = input.nextInt();
        int i = n % 7;
        switch (i)
        {
            case 1:
                System.out.println("Ngay do la thu 7.");
                break;
            case 2:
                System.out.println("Ngay do la chu nhat.");
            case 3:
                System.out.println("Ngay do la thu 2.");
                break;
            case 4:
                System.out.println("Ngay do la thu 3.");
                break;
            case 5:
                System.out.println("Ngay do la thu 4.");
                break;
            case 6:
                System.out.println("Ngay do la thu 5.");
                break;
            case 0:
                System.out.println("Ngay do la thu 6.");
                break;
        }
    }
    public static void bai3()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap luong dien: ");
        int dien = input.nextInt(), giaTien = 0;
        if(dien <= 50) giaTien = dien * 550;
        else if(dien <= 100) giaTien = 50 * 550 + (dien - 50) * 850;
        else if(dien <=200) giaTien = 50 *550 + 50 * 850 + (dien - 100) * 1200;
        else giaTien = 50 *550 + 50 * 850 + 100 * 1200 + (dien - 200) * 1500;
        System.out.println("Tong tien dien la: " + giaTien);
    }
    public static void bai4()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap 3 canh: ");
        int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
        if(a+b>c && a+c >b && b+c>a)
        {
            if(a==b && b==c) System.out.println("Day la tam giac deu.");
            else if(a == Math.sqrt(b*b+c*c) || c == Math.sqrt(b*b+a*a) || b == Math.sqrt(a*a+c*c))
            {
                if(a==b || b == c || a == c) System.out.println("Day la tam giac vuong can");
            }
            else System.out.println("Day la tam giac thuong");
        }
    }
}

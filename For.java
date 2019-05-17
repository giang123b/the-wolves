package bai_2;
import java.util.Scanner;
public class For {
    public static void main(String... args)
    {
        phuongTrinhBac1();
        phuongTrinhBac2();
        dayYear();
        minMax();
        tamGiac();
        kc2Diem();
        hTron();
        kiTu();
    }
    public static void phuongTrinhBac1()
    {
        Scanner input = new Scanner(System.in);
        System.out.print(" Nhap 2 so a va b: ");
        int a = input.nextInt(), b= input.nextInt();
        if(a == 0)
        {
            if(b == 0) System.out.println("Vo so nghiem");
            else System.out.println("Vo nghiem");
        }
        else
        {
            double kq = -(double)b/a;
            System.out.println("Nghiem cua phuong trinh la: " + kq);
        }
    }
    public static void phuongTrinhBac2()
    {
        Scanner input = new Scanner(System.in);
        System.out.print(" Nhap 3 so a, b va c: ");
        int a = input.nextInt(), b= input.nextInt(), c = input.nextInt();
        float delta = b*b-4*a*c;
        if(delta < 0) System.out.println("Phuong trinh vo nghiem");
        else if(delta == 0) System.out.println("Phuong trinh co nghiem kep: " + (-b/(2*a)));
        else
        {
            double x1 = (-b + Math.sqrt(delta))/(2*a), x2 = (b + Math.sqrt(delta))/(2*a);
            System.out.println("Phuong trinh cos 2 nghiem la: " + x1 + " va " + x2);
        }
    }
    public static void dayYear()
    {
        Scanner input = new Scanner(System.in);
        System.out.print(" Nhap nam: ");
        int year = input.nextInt();
        if((year % 4 == 0 && year % 100 !=0) || year % 400 ==0) System.out.println("Co 366 ngay.");
        else System.out.println("Co 365 ngay.");
    }
    public static void minMax()
    {
        Scanner input = new Scanner(System.in);
        System.out.print(" Nhap 4 so: ");
        int[] a = new int[5];
        for(int i=0; i<4; i++) a[i] = input.nextInt();
        for(int i=0;i<3;i++)
            for(int j=i+1;j<4;j++) if(a[i]>a[j])
            {
                int tmp = a[i]; a[i]=a[j]; a[j]= tmp;
            }
        System.out.println(a[0] + " " + a[3]);
    }
    public static void tamGiac()
    {
        Scanner input = new Scanner(System.in);
        System.out.print(" Nhap 3 so a, b, c: ");
        int a = input.nextInt(), b= input.nextInt(), c = input.nextInt();
        if(a+b>c && a+c>b && b+c>a)
        {
            System.out.println("Day la 1 tam giac.");
            double p = (a+b+c)/2;
            double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.println("Dien tich la: " + s);
        }
        else System.out.println("Day khong phai 1 tam giac.");
    }
    public static void kc2Diem()
    {
        Scanner input = new Scanner(System.in);
        System.out.print(" Nhap toa do diem 1: ");
        int x1 = input.nextInt(), y1= input.nextInt();
        System.out.print(" Nhap toa do diem 2: ");
        int x2 = input.nextInt(), y2= input.nextInt();
        int kq = ((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
        System.out.println("Khoang cach giua 2 diem la: " + Math.sqrt(kq));
    }
    public static void hTron()
    {
        Scanner input = new Scanner(System.in);
        System.out.print(" Nhap toa do diem : ");
        float x = input.nextFloat(), y = input.nextFloat();
        if((x>=-1 && x<=1) && y>=-1 && y<=-1) System.out.println("Diem nam trong duong tron");
        else System.out.println("Diem nam ngoai duong tron");
    }
    public static void kiTu()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ky tu: ");
        char c = input.next().charAt(0);
        if(Character.isLetter(c)) System.out.println("Day la 1 chu cai.");
        else if(Character.isDigit(c)) System.out.println("Day la 1 chu so.");
        else System.out.println("Day la 1 ky tu khac.");
    }

}

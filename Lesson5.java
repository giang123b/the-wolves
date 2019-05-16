import java.util.Scanner;

public class Lesson5 {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Giai phuong trinh bac nhat");
        phuongTrinhBacNhat();

        System.out.println("Giai phuong trinh bac hai");
        phuongTrinhBacHai();


        System.out.println("Tim so ngay cua nam");
        soNgayCuaNam();

        System.out.println("Tim so max min trong 4 so");
        soLonNhatVaBeNhat();

        System.out.println("Kiem tra tam giac");
        kiemTraDieuKienTamGiac();

        System.out.println("Khoang cach giua 2 diem");
        khoangCachGiuaHaiDiem();

        System.out.println("Kiem tra diem co thuoc hinh tron");
        kiemTraThuocHinhTron();

        System.out.println("Kiem tra ki tu");
        kiemTraKiTu();

        System.out.println("Gia tri phep toan");
        tinhToan();

        System.out.println("Thu cua thang 3");
        thuCuaThang3();

        System.out.println("Tien dien");
        tienDien();

        System.out.println("Phan loai tam giac");
        phanLoaiTamGiac();
    }

    private static void phuongTrinhBacNhat () {
        double a, b;
        System.out.print("Nhap a: ");
        a = in.nextDouble();
        System.out.print("Nhap b: ");
        b = in.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            System.out.println("Nghiem phuong trinh x = " + -b/a);
        }
    }

    private static void phuongTrinhBacHai () {
        double a, b, c;

        System.out.print("Nhap a: ");
        a = in.nextDouble();
        System.out.print("Nhap b: ");
        b = in.nextDouble();
        System.out.print("Nhap c: ");
        c = in.nextDouble();

        double delta = b*b - 4*a*c;

        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (delta == 0) {
            System.out.println("Phuong trinh co nghiem kep: x1 = x2 = " + -b/(2*a));
        } else {
            System.out.println("Phuong trinh co 2 nghiem: ");
            System.out.println("x1 = " + (-b+Math.sqrt(delta))/(2*a));
            System.out.println("x2 = " + (-b-Math.sqrt(delta))/(2*a));
        }
    }

    private static void soNgayCuaNam () {
        System.out.print("Nhap nam: ");
        int n;
        n = in.nextInt();

        if (n % 400 == 0 || (n%4==0 && n%100!=0)) {
            System.out.println(366);
        } else {
            System.out.println(365);
        }
    }

    private static void soLonNhatVaBeNhat () {
        int a, b, c, d;

        System.out.print("Nhap so thu 1: ");
        a = in.nextInt();

        System.out.print("Nhap so thu 2: ");
        b = in.nextInt();

        System.out.print("Nhap so thu 3: ");
        c = in.nextInt();

        System.out.print("Nhap so thu 4: ");
        d = in.nextInt();

        int t1 = Math.max(a,b);
        int t2 = Math.max(c,d);

        System.out.println("So lon nhat = " + Math.max(t1, t2));

        t1 = Math.min(a,b);
        t2 = Math.min(c,d);

        System.out.println("So be nhat = " + Math.min(t1,t2));
    }

    private static double dienTichTamGiac(double a, double b, double c) {
        double p = (a+b+c)/2;

        return (Math.sqrt(p*(p-a)*(p-b)*(p-c)));
    }

    private static void kiemTraDieuKienTamGiac() {
        double a, b, c;

        System.out.print("Nhap a: ");
        a = in.nextDouble();

        System.out.print("Nhap b: ");
        b = in.nextDouble();

        System.out.print("Nhap c: ");
        c = in.nextDouble();

        if (a+b>c && b+c>a && c+a>b) {
            System.out.println("3 canh co the tao ra tam giac");
            System.out.println("Dien tich tam giac = " + dienTichTamGiac(a,b,c));
        } else {
            System.out.println("3 canh nhap vao ko the tao nen tam giac");
        }
    }

    private static void khoangCachGiuaHaiDiem(){
        double x1, y1, x2, y2;

        System.out.print("x1 = ");
        x1 = in.nextDouble();
        System.out.print("y1 = ");
        y1 = in.nextDouble();

        System.out.print("x2 = ");
        x2 = in.nextDouble();
        System.out.print("y2 = ");
        y2 = in.nextDouble();

        double dx = x1-x2;
        double dy = y1-y2;

        System.out.println("Khoang cach = " + Math.sqrt(dx*dx + dy*dy));
    }

    private static void kiemTraThuocHinhTron () {
        double x, y;
        System.out.print("x = ");
        x = in.nextDouble();

        System.out.print("y = ");
        y = in.nextDouble();

        double kc = Math.sqrt(x*x + y*y);
        if (kc <= 1) {
            System.out.println("Diem nam trong hinh tron R(O, 1) voi O(0,0)");
        } else {
            System.out.println("Diem ko nam trong hinh tron R(O, 1) voi O(0,0)");
        }
    }

    private static void kiemTraKiTu() {
        System.out.print("Nhap ki tu: ");
        char c = in.next().charAt(0);

        if (Character.isLetter(c)) {
            System.out.println(c + " la 1 chu cai");
        } else if (Character.isDigit(c)) {
            System.out.println(c + " la 1 chu so");
        } else {
            System.out.println(c + " la 1 ky tu khac");
        }
    }

    private static void tinhToan() {
        int a, b;
        System.out.print("Nhap a: ");
        a = in.nextInt();

        System.out.print("Nhap b: ");
        b = in.nextInt();

        System.out.print("Nhap phep toan: ");
        char op = in.next().charAt(0);

        if (op == '+') {
            System.out.println("a + b = " + (a+b));
        } else if (op == '-') {
            System.out.println("a + b = " + (a-b));
        } else if (op == '*') {
            System.out.println("a + b = " + (a*b));
        } else if (op == '/') {
            System.out.println("a + b = " + ((float)a/b));
        } else {
            System.out.println("Phep toan ko hop le!");
        }
    }

    private static void thuCuaThang3() {
        System.out.print("Nhap ngay: ");
        int n = in.nextInt();

        if (n <= 0 && n > 31) {
            System.out.println("Ngay ko hop le");
        } else {
            int t = n%7;
            switch (t) {
                case 0:
                    System.out.println("Thu 6");
                    break;
                case 1:
                    System.out.println("Thu 7");
                    break;
                case 2:
                    System.out.println("Chu Nhat");
                    break;
                case 3:
                    System.out.println("Thu 2");
                    break;
                case 4:
                    System.out.println("Thu 3");
                    break;
                case 5:
                    System.out.println("Thu 4");
                    break;
                case 6:
                    System.out.println("Thu 5");
                    break;
            }
        }
    }

    private static void tienDien() {
        int n;
        System.out.print("Nhap luong dien tieu thu: ");
        n = in.nextInt();

        int donGia[] = {550, 850, 1200, 1500};
        int i=0;

        int sum = 0;

        while (n>0) {
            if (n >= 50 && i < donGia.length - 1) {
                sum += (donGia[i] * 50);
            } else {
                sum += (donGia[i] * n);
                break;
            }
            n -= 50;
            i++;
        }

        System.out.println("Tong tien: " + sum);
    }

    private static void phanLoaiTamGiac() {
        System.out.printf("a = ");
        double a = in.nextDouble();
        System.out.printf("b = ");
        double b = in.nextDouble();
        System.out.printf("c = ");
        double c = in.nextDouble();

        boolean can = false;
        boolean vuong = false;
        boolean deu = false;

        if (a==c || b==c || c==a) {
            can = true;
            if (a==b && a==c && b==c) {
                deu = true;
            }
        }

        if ((a*a + b*b == c*c) || (b*b + c*c == a*a) || (c*c + a*a == b*b)) {
            vuong = true;
        }

        if (can) {
            if (deu) {
                System.out.println("Tam giac deu");
            } else if (vuong) {
                System.out.println("Tam giac vuong can");
            } else {
                System.out.println("Tam giac can");
            }
        } else if (vuong) {
            System.out.println("Tam giac vuong");
        } else {
            System.out.println("Tam giac thuong");
        }
    }
}

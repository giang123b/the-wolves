import org.omg.CORBA.MARSHAL;

import java.text.DecimalFormat;

public class BaiLan1 {
    public static void Bai1(){
        System.out.println("Bai 1: Chao giang!");
    }
    public static void Bai2(){
        System.out.printf("Dien tích của hình thang có đáy lớn, bé, chiều cao 7 5 6 là: ");
        System.out.println((7+5)*3);
    }

    public static void Bai3(){
        final double PI = 3.14;
        System.out.println("Dien tich hinh tron R = 3 la: " + PI*3*3);
        System.out.println("PI = " + PI);
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println("S = " + df.format(PI*3*3));
    }

    public static void Bai5(){
        int x = 1234;
        int y = 4321;
        double z = (double)(x+y)/(x-y);
        System.out.println("z1 = " + (double)(x+y)/(x-y));
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("z2 = " + df.format(z));
    }

    public static void Bai6(){
        int x = 3;
        System.out.println("Kq: " + Math.sqrt(x + Math.sqrt(x + Math.sqrt(x))));
    }

    public static void Bai8(){
        int x = 543200;
        System.out.printf("Kq: ");
        if(x / 3600 > 0)
            System.out.print(x/3600 + " gio ");
        if((x - 3600*(x/3600))/60 > 0)
            System.out.printf((x - 3600*(x/3600) )/60 + " phut ");
        if((x - 3600*(x/3600) - 60*((x - 3600*(x/3600))/60)) > 0)
            System.out.printf((x - 3600*(x/3600) - 60*((x - 3600*(x/3600))/60)) + " giay");
    }

    public static void main(String[] args) {
        Bai8();
    }
}

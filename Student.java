package Sample;
import java.io.*;

public class Student{
    public static double log2(double x)
    {
        return Math.log(x)/Math.log(2.0);
    }
    public static void main(String... args)
    {
        System.out.println("1.Nguyen Quoc Khanh dep trai");
        int dayLon=7, dayNho = 5, chieuCao=6;
        double s=(dayLon + dayNho)*chieuCao/2;
        System.out.println("2.Dien tich hinh thang la: " + s);
        int r = 3;
        s = 3.14* r*r;
        System.out.println("3.Dien tich hinh tron la: " + s);
        int a=5, b=6, c=7;
        float p=(a+b+c)/2;
        s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("4.Dien tich hinh tam giac la: " + s);
        int x=1234, y=4321;
        double kq = (x+y)/(x-y);
        System.out.println("5.Ket qua cua bai toan la: " + kq);
        x=3;
        kq = Math.sqrt(Math.sqrt(Math.sqrt(x)));
        System.out.println("5.Ket qua cua bai toan la: " + kq);
        x=6;
        kq = Math.pow(x,3) + log2(Math.pow(x,4)+2) -  Math.cbrt(x-4);
        System.out.println("5.Ket qua cua bai toan la: " + kq);
        x=543200;
        int hour, minute, second;
        hour = x / 3600;
        minute = x % 3600;
        second = minute % 60;
        minute /= 60;
        System.out.println(x + " giay la " + hour + " gio, " + minute + " phut, " + second + " giay");
    }
}
